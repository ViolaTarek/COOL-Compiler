import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Paths;
import org.antlr.v4.gui.*;
import javax.swing.*;




public class ParserTest {
	static String[] TOKENS = {"SEMICOLON", "DARROW", "INT_CONST", "SELF", "SELF_TYPE", "BOOL_CONST",
			"LPAREN", "RPAREN", "COLON", "ATSYM", "COMMA", "PLUS", "MINUS", "STAR",
			"SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "LE", "ASSIGN",
			"CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", "LOOP", "POOL",
			"THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", "NOT", "TYPEID",
			"OBJECTID", "STRING", "WS", "ERROR"};

	static int VALUED_INDEX_LIMIT = 1;
	static int NAMED_TOKEN_INDEX = 46;
	static int parser_error_flag = 0;

	public static BufferedWriter bufferedWriter;
	static String escapeSpecialCharacters(String text) {
		return
			text
				.replaceAll("\\\\", "\\\\\\\\")
				.replaceAll("\n", "\\\\n")
				.replaceAll("\t", "\\\\t")
				.replaceAll("\b", "\\\\b")
				.replaceAll("\f", "\\\\f")
				.replaceAll("\"", "\\\\\"")
				.replaceAll("\r", "\\\\015")
				.replaceAll("\033","\\\\033")
				.replaceAll("\001","\\\\001")
				.replaceAll("\002","\\\\002")
				.replaceAll("\003","\\\\003")
				.replaceAll("\004","\\\\004")
				.replaceAll("\022","\\\\022")
				.replaceAll("\013","\\\\013")
				.replaceAll("\000", "\\\\000")
				;
	}

	static void printAST(String filename) throws Exception{
		ANTLRInputStream inStream=null;
		try{
			inStream = new ANTLRInputStream(new FileInputStream(filename));
		}catch(Exception e){
			System.err.println("Could not read file "+filename);
			return;
		}
		CoolLexer lexer = new CoolLexer(inStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		tokens.fill();
		int lexer_flag = 0;
		for(Token t : tokens.getTokens()){
			if ( t.getType() == 45 ){

				lexer_flag = 1;
				System.err.println("Lexical error at "+t.getLine()+": "+escapeSpecialCharacters(t.getText()));	}

		}
		if (lexer_flag == 1)
			return;

		parser_error_flag = 0;
		CoolParser parser = new CoolParser(tokens);
		parser.removeErrorListeners();

		//parser.addErrorListener(new ParserError(Paths.get(filename).getFileName().toString()));

		CoolParser.ProgramBlocksContext prog = null;
		try{
			prog = parser.programBlocks();

		}catch(Exception e){
			e.printStackTrace();
		}
		if(parser_error_flag == 0) {

			ParseTree tree = prog;

			TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
			//viewer.open();
			String output = " ";
				for (int i =0 ;i<tree.getChildCount();i++){
					output += tree.getChild(i).toStringTree() + "\n";

			}
//			System.out.println(output);

			try (BufferedWriter out = new BufferedWriter(new FileWriter("parser.txt"))) {
				out.write(output);
				out.newLine();
				System.out.println("parser.txt has generated");
			} catch (IOException e) {
				e.printStackTrace();
			}


		}
		else
			System.err.println("Compilation halted due to lex and parse errors");


	}

	public static void main(String args[]) throws Exception{

		if(args.length < 1) {
			System.err.println("No files given");
			System.exit(1);
		}

		for(String filename : args)
		printAST(filename);
	}

	public static class ParserError extends BaseErrorListener {

		String filename;
		public ParserError(String fn) {
			super();
			filename=fn;
		}
		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionIntLine, String msg, RecognitionException e){
			parser_error_flag=1;
			String sourceName = recognizer.getInputStream().getSourceName();
			String errorMessage="";
			if(filename!=null){
				if(offendingSymbol instanceof CommonToken){
					errorMessage += "\""+filename+"\", line "+line+": syntax error at or near ";
					int typeid = ((CommonToken)offendingSymbol).getType();
					if (typeid == -1){
						errorMessage += "EOF";
					}
					else if (typeid <= VALUED_INDEX_LIMIT) {
						errorMessage += TOKENS[typeid-1] + " = " + ((CommonToken)offendingSymbol).getText();
					}else if(typeid >= NAMED_TOKEN_INDEX){
						errorMessage += TOKENS[typeid-1];
					}else{
						errorMessage += "\'"+escapeSpecialCharacters(((CommonToken)offendingSymbol).getText())+"\'";
					}
				}
			}
			System.err.println(errorMessage);
			throw new RuntimeException("One error found!");
		}
	}

}



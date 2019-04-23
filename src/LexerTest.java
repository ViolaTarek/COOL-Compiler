import java.io.*;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

import static java.lang.System.out;

public class LexerTest {

	static String[] TOKENS = {
			"SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COLON", "ATSYM", "COMMA",
			"PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE",
			"RBRACE", "DOT", "LE", "ASSIGN", "SELF", "SELF_TYPE", "CLASS", "ELSE",
			"FI", "IF", "IN", "INHERITS", "LET", "LOOP", "POOL", "THEN", "WHILE",
			"CASE", "ESAC", "OF", "NEW", "ISVOID", "NOT", "BOOL_CONST", "INT_CONST",
			"TYPEID", "OBJECTID", "STRING", "WS", "ERROR"
	};


	static int VALUED_INDEX_LIMIT = 6;

	static int EOF_TYPEID = -1;

	public static void main(String args[]) {
		if(args.length < 1) {
			System.err.println("No files given");
			System.exit(1);
		}
		for(String filename : args)
			printTokenStream(filename);

	}


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

	static void printTokenStream(String filename) {
		//create input stream
		ANTLRInputStream inStream = null;

		try {
			inStream = new ANTLRInputStream(new FileInputStream(filename));
		} catch(IOException e) {
			System.err.println("Cannot read input file.");
			System.exit(1);
		}

		CoolLexer lexer = new CoolLexer(inStream);

		//Call Lexer API for token stream
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		tokens.fill();

		//printing the name of the file
		String name = filename.substring(filename.lastIndexOf('/') + 1);
		out.println("#name \"" + name + "\"");

		final int BOOL_CONST_INDEX = Arrays.asList(TOKENS).indexOf("BOOL_CONST");
		final int STR_CONST_INDEX = Arrays.asList(TOKENS).indexOf("STR_CONST");
		final int INT_CONST_INDEX = Arrays.asList(TOKENS).indexOf("INT_CONST");
		final int TYPE_ID_INDEX = Arrays.asList(TOKENS).indexOf("TYPEID");
		final int OBJECT_ID_INDEX = Arrays.asList(TOKENS).indexOf("OBJECTID");
		final int ERROR_INDEX = Arrays.asList(TOKENS).indexOf("ERROR");
		final int CLASS_INDEX= Arrays.asList(TOKENS).indexOf("CLASS");


		//Print tokens in file stream
		int typeid;
		String file_op="";
		boolean hasError =false;

		for(Token t: tokens.getTokens()) {
			typeid = t.getType();
			if (typeid -1 == ERROR_INDEX) {
				out.println("Error : Can't generate token file \n Invalid Token AT LiNE: " + t.getLine() + " for text \"" + t.getText() + "\"");
				hasError =true;
				break;
			}
			if (typeid != EOF_TYPEID) {
				String output = String.format("#%d %s", t.getLine(), TOKENS[typeid - 1]);
				if (typeid <= VALUED_INDEX_LIMIT) {

					if (typeid - 1 == BOOL_CONST_INDEX)
						output += " " + t.getText().toLowerCase();

					else if (typeid - 1 == STR_CONST_INDEX)
						output += " \"" + escapeSpecialCharacters(t.getText()) + "\"";

				}
				if (typeid - 1 == INT_CONST_INDEX || typeid - 1 == TYPE_ID_INDEX || typeid - 1 == OBJECT_ID_INDEX || typeid - 1 == STR_CONST_INDEX) {
					output += " \"" + t.getText() + "\"";

				}
				if(typeid-1 == CLASS_INDEX){
					output += " \"" + t.getText() + "\"";

				}
				file_op += output + "\n";
			}
		}
		if(!hasError){
			try (BufferedWriter out = new BufferedWriter(new FileWriter("lexer.txt"))) {
				out.write(file_op);
				out.newLine();
				System.out.println("lexer.txt has generated");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
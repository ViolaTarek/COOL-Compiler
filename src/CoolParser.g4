parser grammar CoolParser;

programBlocks
   : classDefine SEMICOLON programBlocks # classes
   ;

classDefine
   : CLASS TYPEID (INHERITS TYPEID)? LBRACE (feature SEMICOLON)* RBRACE
   ;

feature
   : OBJECTID LPAREN (formal (COMMA formal)*)* RPAREN COLON TYPEID LBRACE expression RBRACE # method
   | OBJECTID COLON TYPEID (ASSIGN expression)? # property
   ;

formal
   : OBJECTID COLON TYPEID   //str:STRING
   ;

/* method argument */
expression
   : expression (ATSYM TYPEID)? DOT OBJECTID LPAREN (expression (COMMA expression)*)* RPAREN # methodCall
   | OBJECTID LPAREN (expression (COMMA expression)*)* RPAREN # ownMethodCall
   | IF expression THEN expression ELSE expression FI # if
   | WHILE expression LOOP expression POOL # while
   | LBRACE (expression SEMICOLON) + RBRACE # block
   | LET OBJECTID COLON TYPEID (ASSIGN expression)? (COMMA OBJECTID COLON TYPEID (ASSIGN expression)?)* IN expression # letIn
   | CASE expression OF (OBJECTID COLON TYPEID DARROW expression SEMICOLON) + ESAC # case
   | OBJECTID COLON TYPEID DARROW(expression)SEMICOLON #ASSIGN
   | NEW TYPEID # new
   | INT_CONST # int
   | MINUS expression # negative
   | ISVOID expression # isvoid
   | expression STAR expression # multiply
   | expression SLASH expression # division
   | expression PLUS expression # PLUS
   | expression MINUS expression # minus
   | expression LT expression # lessThan
   | expression LE expression # lessEqual
   | expression EQUALS expression # equal
   | NOT expression # boolNot
   | LPAREN expression RPAREN # parentheses
   | OBJECTID # id
   | STRING # string
   | BOOL_CONST # TrueOrFlase
   | OBJECTID ASSIGN expression # ASSIGN
   ;
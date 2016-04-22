grammar LabeledExpr;

/** The start rule; begin parsing here. */
prog:	stat+ ;

stat:	expr NEWLINE			# printExpr
	|	ID '=' expr NEWLINE		# assign
	|	NEWLINE					# blank
	;

expr:	expr op=(MUL | DIV) expr	# MulDiv
	|	expr op=(ADD | SUB) expr	# AddSub
	|	INT						# int
	|	ID						# id
	|	'(' expr ')'			# parens
	;

MUL	:	'*' ;
DIV	:	'/'	;
ADD	:	'+'	;
SUB	:	'-'	;
ID	:	[a-zA-Z]+ ;		// match identifiers
INT	:	[0-9]+ ;		// match integers
NEWLINE:'\r' ? '\n' ;	// return newlines to parser (is end-statement signal)
WS	:	[ \t]+ -> skip ;// toss out whitespae


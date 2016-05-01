grammar Ciclomatica;

prog: stat+;

stat:
	| 'while' '('expr')' stat
	| whileblock
	| 'if' '(' expression ') stat
        |    ifblock
	| 'else if' '(' expr ')' stat
	|    elseifblock
        | 'for' '(' forControl ')' stat
        | 'do' stat 'while' parExpression ';'
        | 'try' block ( catches 'finally' block
        | catches
        | 'finally' block )
        | 'switch' '('INT')' switchBlock
	| expr NEWLINE
        | ID '=' expr NEWLINE
        | NEWLINE
        ;

whileblock : '{' stat* '}' ;
ifblock : '{' stat* '}' ;
elseifblock : '{' stat* '}' ;
catches : catchClause (catchClause)* ;
catchClause : 'catch' '(' expr ')' block ;
forControl : forInit? ';' forExpression? ';' forUpdate? ;
forInit : ID '=' condition ;
forExpression : ID expression ID
              | ID expression INT
              ;
forUpdate :   ID expression ;
parExpression :   '(' expr ')' ;
switchLabel :   'case' INT ':'
            |   'default' ':'
            ;
switchBlock :   '{' switchBlockStatementGroup* switchLabel* '}' ;
switchBlockStatementGroup :   switchLabel+ blockStatement* ;
blockStatement : stat ;
block : '{' stat* '}' ;
condition: INT;
expr : ID '[' expr ']'
	 | '(' expr ')'
	 | INT
	 ;
expression : | expression ('++' | '--')
           |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
           |   expression ('<' '=' | '>' '=' | '>' | '<') expression
           ;
expressionList :   expression (',' expression)* ;

/*
IF: 'if';
ELSE IF: 'else if';
SWITCH: 'switch';
FOR: 'for';
DO: 'do'
WHILE: 'while'
CATCH: 'catch'
?
*/
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace

grammar Ciclomatica;

prog: stat+;


stat:    'while' '('expr')'  whileblock stat
    | ifexpr '?' ternaryBlock
	| 'if' '(' ifexpr ')' stat
	| 'if' '(' ifexpr ')' ifblock (stat)? 
    | 'else if' '(' expr ')' elseifblock stat
    | 'for' '(' forControl ')' stat
    | 'do' stat 'while' parExpression ';'
    | 'try' block ( catches 'finally' block
    | catches
    | 'finally' block )
    | 'switch' '('INT')' switchBlock
	| ID '(' ')' ';'
    | NEWLINE ID '(' ')' ';'
    | expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;
ternaryBlock: ID ' : ' ID ;

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

ifexpr: ID '<' INT
      | ID '>' INT
      | ID '>=' INT
      | ID '<=' INT
      ;

expression : | expression ('++' | '--')
           |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
           |   expression ('<' '=' | '>' '=' | '>' | '<') expression
           ;
expressionList :   expression (',' expression)* ;

ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE: '\r'? '\n' ;   // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace

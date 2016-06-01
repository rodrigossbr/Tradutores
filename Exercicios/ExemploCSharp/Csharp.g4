grammar Csharp;

prog: stat+;

packageDeclaration
        : ('package' ID)? ';'
        ;

classOrInterfaceModifier
        : 'public'
        | 'protected'
        | 'private'
        | 'abstract'
        | 'static'
        | 'final'
        | 'strictfp'
        ;

classIdentifier
        : 'public' 'class' ID
                 ('extends' ID '{' classBodyDeclaration '}')?
                 ('implements' '{' classBodyDeclaration '}')?
                 '{' classBodyDeclaration* '}'

        | 'protected' 'class' ID
                  ('extends' ID '{' classBodyDeclaration '}')?
                  ('implements' '{' classBodyDeclaration '}')?
                 '{' classBodyDeclaration* '}'
        | 'private' 'class' ID
                  ('extends' ID '{' classBodyDeclaration '}')?
                  ('implements' '{' classBodyDeclaration '}')?
                 '{' classBodyDeclaration* '}'
        ;

classBodyDeclaration
        : (classOrInterfaceModifier*)? 'main' '(' 'String[] args' ')' '{' stat '}'
        | (classOrInterfaceModifier*)? returnType '('')' '{' stat '}'
        | (classOrInterfaceModifier*)? returnType '(' multipleParameters ')' '{' stat '}'
        | classOrInterfaceModifier returnType '('')' '{' stat '}'
        | classOrInterfaceModifier returnType '('multipleParameters ')' '{' stat '}'
        | (classOrInterfaceModifier*)? 'main' '(' 'String[] args' ')' '{' stat* '}'
        | (classOrInterfaceModifier*)? returnType '('')' '{' stat* '}'
        | (classOrInterfaceModifier*)? returnType '(' multipleParameters ')' '{' stat* '}'
        | classOrInterfaceModifier returnType '('')' '{' stat '}'
        | classOrInterfaceModifier returnType '('multipleParameters ')' '{' stat* '}'
        ;
multipleParameters
        : returnType ID (',' returnType ID)?
        ;

returnType
        : 'void'
        | 'int'
        | 'string'
        | 'float'
        | 'boolean'
        ;

stat
        : 'while' '('expr')' stat
        | whileblock
        | 'if' '(' ifexpr ')' stat
        | 'if' '(' ifexpr ')' ifblock (stat)?
        | 'else if' '(' expr ')' stat
        | elseifblock
        | 'else' stat
        | 'else' '{' stat '}'
        | 'for' '(' forControl ')' stat
        | 'do' stat 'while' parExpression ';'
        | 'try' block ( catches 'finally' block
        | catches
        | 'finally' block )
        | 'switch' '('INT')' switchBlock
        | ID '(' ')' ';'
        | ID'.'ID'('')' ';'
        | ID'(' ')'
        | multipleVariable
        | multipleExpr
        | NEWLINE ID '(' ')' ';'
        | expr NEWLINE
        | ID '=' expr NEWLINE
        | NEWLINE
        ;

multipleVariable
        : ID('_'ID)?
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

ifexpr: ID '<' INT
      | ID '>' INT
      | ID '>=' INT
      | ID '<=' INT
      ;

multipleExpr: ifexpr ('||' ifexpr)
            | ifexpr ('&&' ifexpr)
            ;

expression : | expression ('++' | '--')
           |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
           |   expression ('<' '=' | '>' '=' | '>' | '<') expression
           ;
expressionList :   expression (',' expression)* ;

ID  : [a-zA-Z]+;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE: '\r'? '\n' ;   // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace




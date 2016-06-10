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
        : 'public' 'class' OBEJCTID '{' stat '}'
        | 'public' 'class' OBEJCTID ':' OBEJCTID '{' stat '}'
        | 'public' 'class' OBEJCTID ':' OBEJCTID (',' OBEJCTID)? '{' stat '}'
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

stat    : 'while' '('expr')' stat
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
        | createNewObject
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

createNewObject
        : OBEJCTID ID '=' 'new' OBEJCTID'(' ')'
        | OBEJCTID ID '=' 'new' OBEJCTID'(' multipleParameters ')'
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

variableAndMethodsGetSet : parametersType ID '{' GET ';'SET';' '}'
                         ;

//adicionar os tipos de variaveis que podem ser criadas
parametersType: 'int'
              | 'string'
              | 'bool'
              | 'decimal'
              | 'object'
              ;

methodParameters: parametersType multipleVariable(',' parametersType multipleVariable)?
                ;

methodClass: multipleVariable'(' ')'
           | multipleVariable '(' methodParameters ')'
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


GET : [get];
SET : [set];
ID  : [a-zA-Z]+;      // match identifiers
OBEJCTID: ([A-Z])[\w]+;
INT :   [0-9]+ ;         // match integers
NEWLINE: '\r'? '\n' ;   // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace


/*
Criar metodo para pegar atribição
a = 2;
a = b;

criar metodo para construtori
public Pessoa()
{
    ...
}

criar metodo para instanciar um objeto
Pessoa p1 = new Pessoa();

namespace

Não precisa ter metodos main

extends trocar por :


List<UserContact>d
*/


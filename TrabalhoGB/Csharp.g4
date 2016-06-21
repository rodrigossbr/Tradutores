grammar Csharp;

usingDeclaration
        : (USING ID'.'ID'.'ID';')? NEWLINE* namespaceDeclaration
           EOF
        ;

namespaceDeclaration
        : NAMESPACE ID'.'ID '{' NEWLINE* classIdentifier NEWLINE* '}'
        | NAMESPACE ID'-'ID '{' NEWLINE*  classIdentifier NEWLINE* '}'
        | NAMESPACE ID'{' NEWLINE* classIdentifier NEWLINE* '}'
        ;

prog: usingDeclaration*
    | namespaceDeclaration
    | classIdentifier+
    | stat+
    ;

classIdentifier: 'public' 'class' ID '{' stat+ '}'
               | 'public' 'class' ID ':' ID'{' stat+ '}'
               | 'public' 'class' ID ':' ID (',' ID)?'{' stat+ '}'
               | NEWLINE
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
        | variableAndMethodsGetSet
        | variableArray
        | construtor
        | NEWLINE ID '(' ')' ';'
        | expr NEWLINE
        | ID '=' expr NEWLINE
        | NEWLINE
        | WS
        ;

multipleVariable
        : ID('_'ID)?
        ;

createNewObject
        : ID ID '=' 'new' ID'(' ')'
        | ID ID '=' 'new' ID'(' multipleParameters ')'
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

//receber as variaveis

variableInCode
	: ID '=' ID';'
	| NEWLINE
        ;

construtor: 'public' ID '(' parametersType ID ')' '{' variableInCode+ '}'
          | 'public' ID '(' parametersType ID',' parametersType ID ')' '{' variableInCode+ '}'
	  | 'public' ID '(' parametersType ID',' parametersType ID ',' parametersType ID ')' '{' variableInCode+ '}'          
          ;

variableAndMethodsGetSet : 'public'  parametersType ID '{' GET ';'SET';' '}'
                         ;

variableArray : 'public' ID'<'ID'>' ID '{' GET ';' SET ';' '}'
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

USING: 'using';
NAMESPACE: 'namespace';
GET : 'get';
SET : 'set';
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


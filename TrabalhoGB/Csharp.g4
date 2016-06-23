
grammar Csharp;

usingDeclaration
        : (USING ID'.'ID'.'ID';')? NEWLINE* namespaceDeclaration EOF
        | NEWLINE* namespaceDeclaration EOF
        ;

namespaceDeclaration
        : NAMESPACE ID'.'ID NEWLINE* '{' NEWLINE* classIdentifier NEWLINE* '}' NEWLINE*
        | NAMESPACE ID'-'ID NEWLINE* '{' NEWLINE*  classIdentifier NEWLINE* '}' NEWLINE*
        | NAMESPACE ID NEWLINE* '{' NEWLINE* classIdentifier NEWLINE* '}' NEWLINE*
        ;

prog: usingDeclaration*
    | namespaceDeclaration
    | classIdentifier+
    | stat+
    ;

classIdentifier: modifierType 'class' ID '{' stat+ '}' NEWLINE*
               | modifierType 'class' ID ':' objectType (',' objectType)*? NEWLINE* '{' stat+ '}' NEWLINE*
               | NEWLINE
               ;

modifierType: 'public'
            | 'private'
            | 'protected'
            ;

objectType: ID;

multipleParameters
        : csharpType ID(',' csharpType ID)*?
        ;

csharpType: 'void'
          | 'int'
          | 'string'
          | 'bool'
          | 'decimal'
          | 'float'
          | 'boolean'
          | 'object'
          | 'List' '<' csharpType '>'
          | 'List' '<' ID '>'
          | 'IList' '<' csharpType '>'
          | 'IList' '<' ID '>'
          |  ID '<' csharpType '>'
          |  ID '<' ID '>'
          | objectType
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

construtor: modifierType ID '()' NEWLINE* '{' NEWLINE* '}' NEWLINE*
          | modifierType ID '()' NEWLINE* '{' NEWLINE* variableInCode* NEWLINE* '}' NEWLINE*
          | modifierType ID '(' multipleParameters ')' NEWLINE* '{' variableInCode+ '}' NEWLINE*
          ;

variableAndMethodsGetSet : modifierType csharpType ID '{' GET ';' SET ';' '}'
                         ;


methodParameters: csharpType multipleVariable(',' csharpType multipleVariable)?
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


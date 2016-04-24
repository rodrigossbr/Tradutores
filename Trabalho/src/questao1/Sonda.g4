
grammar Sonda;

prog: stat+ ;

stat: command NEWLINE   # printCmd
    | NEWLINE           # blank
    ;

command: basic ENTAO basic   # cmdEntao
       | basic APOS basic    # cmdApos
       | basic               # cmdBasic
       ;

basic : opbasic=(FRENTE | ESQUERDA | DIREITA | TRAS) N  # opBasic
      ;

ENTAO : 'entao' | 'ENTAO' ;
APOS : 'apos' | 'APOS' ;
NEWLINE : '\r' ? '\n' ;
FRENTE : 'frente' | 'FRENTE' ;
ESQUERDA : 'esquerda' | 'ESQUERDA' ;
DIREITA : 'direita' | 'DIREITA' ;
TRAS : 'tras' | 'TRAS' ;
N : [0-9]+ ;
WS : [ \t]+ -> skip;



grammar Cent;		

// java
// TODO doplnit o to že když to narazí na hodntu tak jí to propaguge až to narazí na operátor a pak to zavolá funkce který provedou operace na tech hodnotach
// Dela se to z classy BaseVisitor a pak override funkce
// https://www.javahelps.com/2019/04/antlr-hello-world-arithmetic-expression.html

// parser
root:	(expr NEWLINE)+ ;

expr:   '(' expr ')'                        #parexpr
    |   operator=NOT right=expr             #opexpr
	|   left=expr operator=MULTI right=expr #opexpr
    |	left=expr operator=PLUS right=expr  #opexpr
    |   left=expr operator=AND right=expr   #opexpr
    |   left=expr operator=OR right=expr    #opexpr
    |   left=expr operator=XOR right=expr   #opexpr
    | 	list                                #leafexpr
    |   left=expr operator=NOT right=expr   #errexpr
    ;

list: MINT
    | INT
    | BINARY
    | (INT)* 'a'
    ;


// lexer
//LIST        : MINT | INT | BINARY | (INT)* 'a';

MULTI       : '*';
PLUS        : '+';
AND         : '&';
OR          : '|';
XOR         : '^';
NOT         : '~';


INT         : (('1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9') ('1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '0')*) | '0';
MINT        : '-' INT;
BINARY      : BINSTART BINDIG+;

MINUS       : '-';

BINSTART    : '0B' | '0b';
BINDIG      : '0' | '1';

WS          : [ \t]+ -> skip ;
NEWLINE     : [\r\n]+ ;

ErrorChar   : . ;
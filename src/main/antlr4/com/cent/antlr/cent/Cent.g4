grammar Cent;		

// java
// TODO doplnit o to že když to narazí na hodntu tak jí to propaguge až to narazí na operátor a pak to zavolá funkce který provedou operace na tech hodnotach
// Dela se to z classy BaseVisitor a pak override funkce
// https://www.javahelps.com/2019/04/antlr-hello-world-arithmetic-expression.html

// parser
root:	(expr NEWLINE)* ;

expr:   '(' expr ')'                        #parexpr
	|   left=expr operator='*' right=expr   #opexpr
    |	left=expr operator='+' right=expr   #opexpr
    |   left=expr operator='&' right=expr   #opexpr
    |   left=expr operator='|' right=expr   #opexpr
    |   left=expr operator='^' right=expr   #opexpr
    |   operator='~' right=expr             #opexpr
    | 	LIST                                #leafexpr
    ;


// lexer
LIST        : MINT | INT | BINARY | 'a';
MINUS       : '-';
WS          : [ \t]+ -> skip ; 
NEWLINE     : [\r\n]+ ;
NONZERODIGIT: '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
ZERO        : '0';
DIGIT       : ZERO | NONZERODIGIT;
INT         : ZERO | NONZERODIGIT DIGIT*;
MINT        : '-' INT;
BINSTART    : '0B' | '0b';
BINDIG      : '0' | '1';
BINARY      : BINSTART BINDIG+;
grammar BigInt;

main: stat* EOF;

stat: assign 
 	|print
;

assign: ID '=' expr
	;

print: 'print' expr
	;

expr:	ID	#ExprID
	|NUM	#ExprNum
	;

ID:[a-z]+;
NUM:[0-9]+;
COMMENT:'--' .*? '\n' -> skip;
WS: [ \t\n\r]+ ->skip;
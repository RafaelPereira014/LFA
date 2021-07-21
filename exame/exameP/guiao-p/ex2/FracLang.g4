grammar FracLang;

main: stat* EOF;

stat: ( assign | display )? ';' 
;

assign: ID '<=' expr
	;

display: 'display' expr
	;

expr:	'(' expr ')' 	#ExprParents
	|op=('+'|'-') expr #ExprUnary 	
	|expr op=('*'|':') expr #ExprMultDiv 
	|expr op=('+'|'-') expr #ExprSumSub
	|fraction	#ExprFract
	|ID		#ExprID
	|NUM		#ExprNUM
	|'read' STRING 	#ExprReadStr
	|'reduce' expr  #ExprReduce
	;

STRING:'"' .*? '"';
fraction: NUM '/' NUM;
VAL: ID (ID|NUM);
ID:[a-z]+;
NUM:[0-9]+;
WS:[ \t\n\r]+ -> skip;
COMMENT: '--' .*? '\n' ->skip;
ERROR: .;



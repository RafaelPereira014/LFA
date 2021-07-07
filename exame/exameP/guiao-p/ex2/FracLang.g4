grammar FracLang;

main: stat* EOF;

stat : (display | assign)? ';'
	;

assign: ID '<=' expr	
	;
	
display: 'display' expr		
	;

expr: 	'(' expr ')'		#ExprParent
	|op = ('-'|'+') expr 	#ExprUnary
	|expr op=('*'|':') expr	#ExprMultDiv
	|expr op=('+'|'-') expr	#ExprAddSub
	|fraction		#ExprFract
	|INTEGER		#ExprInt
	| ID			#ExprID
	;

fraction : INTEGER '/' INTEGER;
ID: [a-z]+;
INTEGER: [0-9]+;
Comment: '--' .*? '\n' -> skip;
WS: [ \t\n\r]+ -> skip;
ERROR: .;
grammar StrLang;

main: (stat'\n')* EOF;

stat : print
        | assign
	;
assign: VAR ':' expr;

print: 'print' expr  			#printString
    ;

expr:	'input' '(' expr ')'		#ExprInput
	| '(' expr ')'			#ExprBoss
	| 'trim' expr 			#ExprTrim
	| expr '+' expr			#ExprAdd
	| expr '-' expr			#ExprSub
	| expr '/' expr '/' expr	#ExprSubstitute
	| STRING			#ExprString
	| VAR				#ExprVAR
	;

VAR: LETTER (NUM|LETTER)*;
STRING: '"' .*? '"';
fragment LETTER: [a-z]+;
fragment NUM: [0-9]+;
WS: [ \t\n\r]+ -> skip;
Comment: '//' .*? '\n' -> skip;

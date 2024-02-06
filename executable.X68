*-----------------------------------------------------------
* Title      : Compilador
* Written by : Pere Joan Vives Morey
* Date       : 2/02/2024
* Description: 
*-----------------------------------------------------------
          ORG    $1000
CR EQU $0D
LF EQU $0A
ENTRADA DC.B 'Introdueix un valor: ',0
SORTIDA DC.B CR,LF,'Sortida Teclat: ',0
START:
	SUBQ #8,A7
M:
	MOVE.L #5,0(A7)
	MOVE.L 0(A7),D0
	MOVE.L D0,4(A7)
	CLR.L D0
	ADDQ #8, A7
	SIMHALT
E0:
M:
	 END START

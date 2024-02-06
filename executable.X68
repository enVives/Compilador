*-----------------------------------------------------------
* Title      : Compilador
* Written by : Pere Joan Vives Morey
* Date       : 2/02/2024
* Description: 
*-----------------------------------------------------------
          ORG    $1000
V0 DC.L 0
V1 DC.L 0
V2 DC.L 0
V3 DC.L 0
V4 DC.W 0
ENTRADA DC.B 'Introdueix un valor: ',0
SORTIDA DC.B 'Sortida Teclat: ',0
START:
	MOVE #14,D0
	LEA ENTRADA,A1
	TRAP #15
	MOVE #4,D0
	TRAP #15
	 MOVE.L D1,V0
	CLR.L D1
	CLR.L D0
	MOVE.L #0, A1
	MOVE.L V0,D0
	NEG.L D0
	MOVE.L D0,V1
	MOVE.L #4,V2
	MOVE.L V1,D0
	ADD.L V2,D0
	MOVE.L D0,V3
	MOVE.L V3,V4
M:
	MOVE #14,D0
	LEA SORTIDA,A1
	TRAP #15
	MOVE.B V4,D1
	MOVE #6,D0
	TRAP #15
	CLR.L D1
	CLR.L D0
	MOVE.L #0, A1
	SIMHALT
	 END START

*~Font name~Courier New~
*~Font size~10~
*~Tab type~1~
*~Tab size~4~

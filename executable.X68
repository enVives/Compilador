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
	SUBQ #2, A7
M:
	MOVE.L #32,0(A7)
	MOVE.W #97,4(A7)
	SUBQ #4,A7
	MOVE.L 4(A7),-(A7)
	MOVE.W 12(A7),-(A7)
	 JSR E0
	ADD.L #6, A7
	MOVE.L (A7)+, D0
	MOVE.W D0,6(A7)
	 CLR.L D0
	MOVE.W 6(A7),D0
	MOVE.W D0,8(A7)
	CLR.L D0
	MOVE #14,D0
	LEA SORTIDA,A1
	TRAP #15
	MOVE.W 8(A7),D1
	MOVE #6,D0
	TRAP #15
	CLR.L D1
	CLR.L D0
	MOVE.L #0, A1
	ADDQ #8, A7
	ADDQ #2, A7
	SIMHALT
E0:
	SUB #4,A7
	MOVE.W 8(A7),D0
	SUB.L 10(A7),D0
	MOVE.L D0,0(A7)
	MOVE.L 0(A7),14(A7)
	ADDQ #4, A7
	RTS
	 END START

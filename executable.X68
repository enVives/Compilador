*-----------------------------------------------------------
* Title      : Compilador
* Written by : Pere Joan Vives Morey
* Date       : 2/02/2024
* Description: 
*-----------------------------------------------------------
          ORG    $1000


START:
	MOVE.W #100,D0
	MOVE.W #-2,D1
	
	DIVS.W D1,D0
    
	CLR.L D0
	MOVE.L  #3,D0
	TRAP #15
	
	
	SIMHALT
END

*~Font name~Courier New~
*~Font size~10~
*~Tab type~1~
*~Tab size~4~

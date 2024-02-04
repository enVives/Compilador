*-----------------------------------------------------------
* Title      : Compilador
* Written by : Pere Joan Vives Morey
* Date       : 2/02/2024
* Description: 
*-----------------------------------------------------------
          ORG    $1000

START:
	MOVE.L  #2147483647, D0  
   	MOVE.L  #-2147483648, D1
   	MULS.L  D1, D0

*~Font name~Courier New~
*~Font size~10~
*~Tab type~1~
*~Tab size~4~

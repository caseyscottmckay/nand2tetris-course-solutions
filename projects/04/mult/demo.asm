(LOOP)
    //if (i==n) goto END
    @i
    D=M
    @n
    D=D-M
    @END
    D;JEQ

    //RAM[arr+1] = -1
    @arr
    D=M
    @i
    A=D+M
    M=-1

    //i++
    @i
    M=M+1

    @LOOP
    0;JMP

(END)
    @END
    0;JMP
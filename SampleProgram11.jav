Methodstart checkGreater inta,intb
load b
load a
GT
IFTRUE
load a
print a
IFFALSE
load b
print b
endif
Methodend checkGreater
Methodstart main 
store a TRUE
store b TRUE
load b
load a
EQ2
IFTRUE
load a
print a
IFFALSE
load b
print b
endif
Methodcall checkGreater 5,6
store p 1
store len 10
loopstart
load len
load p
LT
IFTRUE
load p
print p
IFFALSE
break
inc p
loopend
store x 5
store y 10
store z 7
load y
load zc
MUL
load x
ADD
store w
load w
print w
Methodend main

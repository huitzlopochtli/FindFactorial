# Find Factorial 
The following program Demonstrates the actual algorithm behind finding Factorials even the number 0.
How factorials work : 

n! = n*(n-1)*(n-2)*(n-3)*......3*2*1
or, n! = n*(n-1)!...................(i)


now if we say,
5! = 5*4*3*2*1 = 120
4! = 4*3*2*1   = 24
3! = 3*2*1     = 6
2! = 2*1       = 2
1! = 1         = 1

but what is the factorial of 0?


lets analyse the above factorials.
we can see,

4! = 5!/5 = (4+1)!/(4+1)
3! = 4!/4 = (3+1)!/(3+1)
2! = 3!/3 = (2+1)!/(2+1)
1! = 2!/2 = (1+1)!/(1+1
so,
0! = 1!/1 = (1+0)!/(1+0)
-1!= 0!/0 =  which tries to devide 1 by 0 that leads to a Math Error or we can say it tends to infinity. 

which gives us an equation,
n! = (n+1)!/(n+1)...................(ii) ;  where n=0,1,2,3,.....; n>=0 ;

the above equations are used in the program to find foctorials.

import java.util.*;
class factorial{
	static long fac(long x){
		return fact(x+1)/(x+1); // n! = (n+1)!/(n+1)
	}
	
	static long fact(long x){
		if (x!=1)
			return x*fact(x-1); // n! = n*(n-1)!
		else 
			return 1;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		
		if(n<0)
			System.out.println("Math Error!\nValues less than Zero tends to Infinity!");
		else{
			long a = fac(n);
			System.out.println(n+"!= "+ a);
		}
	}
}
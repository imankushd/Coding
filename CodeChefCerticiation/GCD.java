package snippet;

public class GCD {
	
	static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a==b)
			return a;
		if(a>b)
			return gcd(a-b,b);
		return gcd(a,b-a);
	}
public static void main(String args[]) {
	int a=8,b=12;
	System.out.println("GCD of numbers "+a+" & "+b +" is "+gcd(a,b));
	
}
}

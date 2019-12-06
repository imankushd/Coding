import java.util.concurrent.SynchronousQueue;

public class GCD_LCM {

	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcd=gcd(12,15);
		System.out.println("GCD of above given numbers: "+gcd);
		
		int lcm=(12*15)/gcd;
		System.out.println("LCm of above given numbers: "+lcm);
	}

}

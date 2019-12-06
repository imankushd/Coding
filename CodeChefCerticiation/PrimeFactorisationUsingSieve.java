import java.util.Scanner;
import java.util.Vector;

public class PrimeFactorisationUsingSieve {

	final static int MAX=100000;
	
	static int[] spf=new int[MAX+1];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		spf(n);
		Vector<Integer> res = getFactorisation(n);
		
		System.out.print("Prime factorisation of "+n+" is: ");
		for(Integer i:res)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		sc.close();
	}

	private static void spf(int n) {
		// TODO Auto-generated method stub
		spf[1]=1;
		
		for(int i=2;i<=MAX;i++)
		{
			if(spf[i]==0)
			{
				spf[i]=i;
				
				for(int j=2*i;j<=MAX;j+=i)
				{
					if(spf[j]==0)
						spf[j]=i;
				}
			}
		}
		
	}

	private static Vector<Integer> getFactorisation(int n) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		
		int x=n;
		
		while(x!=1)
		{
			v.add(spf[x]);
			x=x/spf[x];
			
		}
		
		return v;
	}

}

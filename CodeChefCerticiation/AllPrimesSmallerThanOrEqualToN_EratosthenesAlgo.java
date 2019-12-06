import java.util.Scanner;

public class AllPrimesSmallerThanOrEqualToN_EratosthenesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] prime = new boolean[n+1];
		
		for(int i=0;i<=n;i++)
			prime[i]=true;
		
		for(int i=2;i*i<=n;i++)
		{
			if(prime[i]==true)
			{
				for(int p=i*i;p<=n;p+=i)
				{
					prime[p]=false;
				}
			}
		}
		
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==true)
				System.out.print(i+" ");
		}
		System.out.println();
		sc.close();
	}

}

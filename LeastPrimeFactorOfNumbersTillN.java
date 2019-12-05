import java.util.Scanner;

public class LeastPrimeFactorOfNumbersTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] least_prime = new int[n+1];
		
		least_prime[1]=1;
		
		for(int i=2;i<=n;i++)
		{
			if(least_prime[i]==0)
			{
				least_prime[i]=i;
				
				for(int j=2*i;j<=n;j+=i)
				{
					if(least_prime[j]==0)
						least_prime[j]=i;
				}
			}
		}
		
		System.out.println("Complexity of this program is O(nlogn)");
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Least prime factor of "+i+" is : "+least_prime[i]);
		}
		
	}

}

package dynamic_prog;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "CART";
		String ss = "MARCH";
		
		System.out.println("Min. elements used to convert s to ss are "+editDistance(s,ss,s.length(),ss.length()));
	}

	private static int editDistance(String s, String ss, int m, int n) {
		// TODO Auto-generated method stub
		
		int[][] dp = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0)
					dp[i][j]=j;
				else if(j==0)
					dp[i][j]=i;
				else if (s.charAt(i-1) == ss.charAt(j-1)) 
                    dp[i][j] = dp[i-1][j-1]; 
				else
				{
					dp[i][j] = 1+min(dp[i][j-1], dp[i-1][j], dp[i-1][j-1]);
				}
			}
		}
		
		return dp[m][n];
	}

	private static int min(int i, int j, int k) {
		// TODO Auto-generated method stub
		
		if(i<=j && i<=k)
			return i;
		else if(j<=i && j<=k)
			return j;
		else
			return k;
		
	}

}

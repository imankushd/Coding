package dynamic_prog;

public class LCS {
	
	static String res="";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AGGTAB";
		String ss = "GXTXAYB";

		/*char[] c = s.toCharArray();

		char[] ch = ss.toCharArray();*/

		String lcsString=lcs(s,ss,s.length(),ss.length());
		
		lcsString=lcsString.replace(" ","");
		
		System.out.println("LCS is "+lcsString+" of length "+lcsString.length());
	}

	private static String lcs(String c, String ch, int m, int n) {
		// TODO Auto-generated method stub
		
		int[][] L = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0)
					L[i][j]=0;
				else if(c.charAt(i-1)==ch.charAt(j-1))
					L[i][j]=1+L[i-1][j-1];
				else
					L[i][j]=Math.max(L[i-1][j], L[i][j-1]);
			}
		}
		
		int index = L[m][n];
		int temp = index;
		char[] res = new char[index+1];
		res[index]=' ';
		
		int i=m,j=n;
		
		while(i>0 && j>0)
		{
			if(c.charAt(i-1)==ch.charAt(j-1))
			{
				res[index-1]=c.charAt(i-1);
				i--;
				j--;
				index--;
			}
			else if(L[i-1][j]>L[i][j-1])
			{
				i--;
			}
			else
				j--;
		}
			
		return new String(res);
	}
}

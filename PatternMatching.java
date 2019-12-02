
public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String pat="AABC";
         String text="AACBAABCACAABC";
         int n=search(pat.toCharArray(),text.toCharArray());
         System.out.println("Found matching patterns: "+n);
	}

	private static int search(char[] pat, char[] text) {
		// TODO Auto-generated method stub
		int N=text.length;
		int M=pat.length;
		int i=0;
		int c=0;
		
		while(i<=N-M)
		{
			int j;
			for(j=0;j<M;j++)
			{
				if(text[i+j]!=pat[j])
					break;
			}
			if(j==M)
			{
				c++;
				System.out.println("Pattern "+c+" found at "+i);
				i=i+M;
			}
			else if(j==0)
			{
				i=i+1;
			}
			else
				i=i+j;
		}
		
		
		
		return c;
	}

}

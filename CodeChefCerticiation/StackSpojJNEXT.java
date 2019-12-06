import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackSpojJNEXT {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			//int n=Integer.parseInt(br.readLine());
			Stack<Integer> s = new Stack<Integer>();
			StringBuilder ss = new StringBuilder(br.readLine());
			StringTokenizer str = new StringTokenizer(ss.reverse().toString());
			System.out.println();
			int c=0;
						
			s.add(Integer.parseInt(str.nextToken()));
			
			while(str.hasMoreTokens())
			{
				int token=Integer.parseInt(str.nextToken());
				if(s.peek()>token && c<1)
				{
					int aa=s.pop();
					s.push(token);
					s.push(aa);
					c++;
				}
				else
				s.push(token);
			}
			String res="";
						
			for(int j=0;j<s.size();j++)
			{
						res+=s.get(s.size()-1-j);
			}
			
			System.out.println(res);
		}
		
		
	}

}

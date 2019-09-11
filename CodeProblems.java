import java.util.*;
public class CodeProblems {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   for(int i=0;i<t;i++)
	   {
		   int n=sc.nextInt();
		   int[] a=new int[n];
		   
		   HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		   for(int q=0;q<n;q++)
		   {
			   a[i]=sc.nextInt();
			   if(hm.containsKey(a[i]))
			   {
				   continue;
			   }
			   else
			   {
				   hm.put(a[i],1);
			   }
		   }	
	   }
   }
}

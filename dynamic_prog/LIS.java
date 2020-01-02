package dynamic_prog;

import java.util.ArrayList;
import java.util.List;

public class LIS {
	
	static List<Integer> al;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] l={10, 22, 9, 33, 21, 50, 41, 60, 80};
		
		al = new ArrayList<Integer>();
		
		lis(l,l.length,al);
		
	}

	private static void lis(int[] l, int length, List<Integer> al) {
		// TODO Auto-generated method stub
		
		int max=0;
		
		int[] lis = new int[length];
		
		for(int i=0;i<length;i++)
			lis[i]=1;
		
		for(int i=1;i<length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(l[i]>l[j] && lis[i]<lis[j]+1)
				{
					lis[i]=lis[j]+1;
				}
			}
		}
		
		for(int i=0;i<length;i++)
		{
			if(max<lis[i])
			{
				max=lis[i];
			}
		}
		
		System.out.println("Length of lis is "+max);

	}

}

package snippet;
import java.util.*;
public class RemoveDuplicates {
public static void main(String args[])
{
	int a[]=new int[]{2,3,2,4,3,5,4,5,6};
	System.out.println("Arrays before removing duplicates");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	System.out.println();
	Set<Integer> s=new HashSet<Integer>();
	for(int i=0;i<a.length;i++)
		s.add(a[i]);
	System.out.println("Arrays after removing duplicates");
	/*Iterator itr=s.iterator();
	while(itr.hasNext())
		System.out.print(itr.next()+" ");*/
	for(int i:s)
	{
		System.out.print(i+" ");
	}
		
}
}


public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int a[]= {1,4,3,2,5};
              secondHighestNumber(a,a.length);
	}

	public static void secondHighestNumber(int[] a, int length) {
		// TODO Auto-generated method stub
		if(length<2)
		{
			System.out.println("Invalid array");
			return;
		}
		int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			else if(a[i]>second&&a[i]!=first)
				second=a[i];
		}
			if(second!=Integer.MIN_VALUE)
				System.out.println("Second Largest element is "+second);
		}
 }

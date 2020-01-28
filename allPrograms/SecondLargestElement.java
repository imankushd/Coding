package snippet;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]={1,5,2,3,4};
        //second highest number
        secondHighestNumber(a,a.length);
	}

	public static void secondHighestNumber(int[] a, int length) {
		// TODO Auto-generated method stub
		if(length<2)
		{
			System.out.println("Invalid Array");
			return;
		}
		int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
		for(int i=0;i<length;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			else if(a[i]>second && a[i]!=first)
			{
				second=a[i];
			}
			
		}
		if(second!=Integer.MIN_VALUE)
		System.out.println("Second Largest Element is "+second);
	}

}

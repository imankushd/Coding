
public class QuickSort
{
	public static void main(String args[])
	{
		int a[]= {5,4,6,5,4,1};
		quicksort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

	public static void quicksort(int[] a, int l, int h) {
		// TODO Auto-generated method stub
		if(l<h)
		{
		int p=partition(a,l,h);
		quicksort(a,l,p-1);
		quicksort(a, p+1, h);
		}
	}

	public static int partition(int[] a, int l, int h) {
		// TODO Auto-generated method stub
		int i=l-1;
		int pivot=a[h];
		for(int j=l;j<h;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		int temp=a[i+1];
		a[i+1]=a[h];
		a[h]=temp;
		return i+1;
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
         int n=Integer.parseInt(br.readLine());
         int[] a=new int[n];
         int key=Integer.parseInt(br.readLine());
         
         for(int i=0;i<n;i++)
        	 a[i]=Integer.parseInt(br.readLine());
         int index=binarySearch(a,key);
         System.out.println("Element "+key+" is found at index: "+ index);
	}
	public static int binarySearch(int[] a, int key) {
		// TODO Auto-generated method stub
		int low=0,high=a.length-1;
		
		System.out.println("key to found: "+key);
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(a[mid]<key)
				low=mid+1;
			else if (a[mid]>key)
				high=mid-1;
			else
				return mid;
		}		
		return -1;
	}

}

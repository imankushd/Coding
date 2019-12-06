
public class MaxSumConsecutiveArray_KadaneAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,3,-2,-4,-1,5,2,-3,6};
		
		int maxSoFar=0;
		int maxEndingHere=0;
		
		for(int i=0;i<a.length;i++)
		{
			maxEndingHere=maxEndingHere+a[i];
			if(maxEndingHere<0)
				maxEndingHere=0;
			if(maxSoFar<maxEndingHere)
				maxSoFar=maxEndingHere;
		}
		
		System.out.println("Largest sum consecutive array sum is : "+maxSoFar);
	}

}

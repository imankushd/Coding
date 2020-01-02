package dynamic_prog;

import java.util.Scanner;

public class SegmentTree_MinElement {
	
	static int[] tree;
	static int[] arr;
	
	SegmentTree_MinElement(int[] arr,int start,int end,int[] tree)
	{
		buildSegTree(arr,0,end,tree,0);
	}

	private void buildSegTree(int[] arr, int start, int end, int[] tree, int treeNode) {
		
		if(start==end)
		{
			tree[treeNode]=arr[start];
		}
		else
		{
			int mid=(start+end)/2;
			buildSegTree(arr, start, mid, tree, 2*treeNode+1);
			buildSegTree(arr, mid+1, end, tree, 2*treeNode+2);
			
			tree[treeNode] = Math.min(tree[2*treeNode+1], tree[2*treeNode+2]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc .nextInt();
		arr = new int[n];
	
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		tree = new int[2*n-1];
		
		SegmentTree_MinElement st = new SegmentTree_MinElement(arr,0,n-1,tree);
		
		/*for(int i=0;i<2*n-1;i++)
			System.out.println(tree[i]);*/
		
		int min = getMin(0,n-1,0,2,0);
		
		System.out.println("Min element in range "+0+" & "+2+" is: "+min);
		
	}

	private static int getMin(int start, int end , int ss, int se, int treeNode) {
		// TODO Auto-generated method stub
		
		if(ss>end || se<start)
		{
			return Integer.MAX_VALUE;
		}
		
		if(ss<=start && se>=end)
		{
			return tree[treeNode];
		}
		else
		{
			int mid = (start+end)/2;
			
			return Math.min(getMin(start, mid, ss, se, 2*treeNode+1),getMin(mid+1, end, ss, se, 2*treeNode+2));
		}
	}

}

package snippet;

import javax.swing.plaf.synth.SynthEditorPaneUI;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class SpiralMatrix {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[][]=new int[][]{{1,2,3,4,5},{5,6,7,8,9},{7,5,6,8,0},{2,3,5,4,5}};
         int m=a.length;
         int n=a[0].length;
         System.out.println(m+" "+n);
         spiralPrint(m,n,a);
	}

	private static void spiralPrint(int m, int n, int[][] a) {
		// TODO Auto-generated method stub
	int k=0,l=0;
	
	while(k<m && l<n)
	{
		for(int i=l;i<n;i++)
		{
			System.out.print(a[k][i]+" ");
		}
		k++;
	
		for(int i=k;i<m;i++)
		{
			System.out.print(a[i][n-1]+" ");
		}
		n--;
		
		if(k<m)
		{
			for(int i=n-1;i>=l;i--)
			{
				System.out.print(a[m-1][i]+" ");
			}
			m--;
		}
		if(l<n){
		for(int i=m-1;i>=k;i--)
		{
			System.out.print(a[i][l]+" ");
		}
		l++;
		}
		
	}
		
		
	}

}

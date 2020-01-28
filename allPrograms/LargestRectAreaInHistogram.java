package snippet;
import java.util.*;
public class LargestRectAreaInHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hist[]={1,2,4,3,2};
		int area=maxAreaHist(hist,hist.length);
		System.out.println("Max Area in Histogram: "+area);
	}

	static int maxAreaHist(int[] hist, int length) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack();
		int tp=0;
		int area=0;
		int maxArea=-1;
		
		int i=0;
		while(i<length)
		{
			if(st.empty()||hist[st.peek()]<=hist[i])
			{
				st.push(i++);
			}
			else
			{
				tp=st.peek();
				st.pop();
			    area=hist[tp]*(st.empty()?i:(i*st.peek()-1));
			    if(maxArea<area)
			    	maxArea=area;
			}
		}
		while(st.empty()==false)
		{
			tp=st.peek();
			st.pop();
			area=hist[tp]*(st.empty()?i:(i-st.peek()-1));
		    if(maxArea<area)
		    	maxArea=area;
		}
		
		
		return maxArea;
	}

}

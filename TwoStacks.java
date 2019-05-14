package snippet;
import java.util.*;

public class TwoStacks {
       Stack<Integer> s=new Stack();
	   int top1;
       int top2;
       int size;
       static int arr[]; 		   
    		   
	public TwoStacks(int size) {
		arr=new int[size];
		this.top1 = -1;
		this.top2 = size;
	}
	
 void push1(int x)
 {
	 if(top1<top2-1)
	 {
		 top1++;
		 arr[top1]=x;
	 }
	 else
	 {
		 System.out.println("Stack is overflow");
		 System.exit(1);
	 }
 }
 void push2(int x)
 {
	 if(top1<top2-1)
	 {
		 top2--;
		 arr[top2]=x;
	 }
	 else
	 {
		 System.out.println("Stack is overflow");
		 System.exit(1);
	 }
 }
 int pop1()
 {
	 if(top1>=0)
	 {
		 int x=arr[top1];
		 top1--;
		 return x;
	 }
	 else
	 {
		 System.out.println("Stack is underflow");
		 System.exit(1);
	 }
	return 0;
	 
 }
 int pop2()
 {
	 if(top2<size)
	 {
		 int x=arr[top2];
		 top2++;
		 return x;
	 }
	 else
	 {
		 System.out.println("Stack is underflow");
		 System.exit(1);
	 }
	return 0;
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStacks ts = new TwoStacks(5); 
		ts.push1(1);
		ts.push2(2);
		ts.push1(3);
		ts.push2(4);
		ts.push1(5);
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(ts.pop1());
	}

}

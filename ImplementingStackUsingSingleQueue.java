import java.util.LinkedList;
import java.util.Queue;

public class ImplementingStackUsingSingleQueue {

	private static Queue<Integer> q=new LinkedList<Integer>();
	
	public void push(int i)
	{
		int size=q.size();
		q.add(i);
		for(int j=0;j<size;j++)
		{
			int x=q.remove();
			q.add(x);
		}
	}
	
	public int pop()
	{
		if(q.isEmpty())
		{
			System.out.println("Stack is empty.");
		}
		return q.remove();
	}
	
	public int top()
	{
		if(q.isEmpty())
		{
			System.out.println("Stack is empty.");
		    return -1;
		}
		return q.peek();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementingStackUsingSingleQueue s = new ImplementingStackUsingSingleQueue();
		for(int i=1;i<5;i++)
			s.push(i);
		System.out.println("Removing current top of stack: "+s.pop());
        System.out.println("Top element of Stack: "+s.top());
	}

}

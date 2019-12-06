import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

	public static Queue<Integer> q1 = new LinkedList<Integer>();
	public static Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(int i) throws MyException
	{
		q2.add(i);
		while(!q1.isEmpty())
		{
			q2.add(q1.remove());
		}
		Queue<Integer> q = q1; 
        q1 = q2; 
        q2 = q; 
	}
	
	public int pop()
	{
		return q1.remove();
	}
	
	public int top()
	{
		if(q1.isEmpty())
			return -1;
		
		return q1.peek();
	}
	
	
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub

		ImplementStackUsingQueues isuq = new ImplementStackUsingQueues();
		isuq.push(1);
		isuq.push(2);
		isuq.push(3);
		isuq.push(4);
		isuq.push(5);
		isuq.push(6);
		
		System.out.println("LIFO : "+isuq.pop());
		System.out.println("Element at top position: "+isuq.top());
		
	}

}

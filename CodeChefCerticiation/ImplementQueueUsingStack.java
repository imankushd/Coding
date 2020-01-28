import java.util.Stack;

class MyException extends Exception
{
	
	private static final long serialVersionUID = 1L;
	
	String str;
	public MyException(String str) {
		super(str);
	}
}

public class ImplementQueueUsingStack {

	final int MAX_CAPACITY=5;
	
	public static Stack<Integer> s1 = new Stack<Integer>();
	public static Stack<Integer> s2 = new Stack<Integer>();
	
	public void enQueue(int key) throws MyException
	{
		
		if(s1.size()==MAX_CAPACITY)
			throw new MyException("Stack OverFlow");
		s1.push(key);
	}
	
	public int deQueue()
	{
		while(!s1.isEmpty())
			s2.add(s1.pop());
		return s2.pop();
	}
	
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub

		ImplementQueueUsingStack iqus = new ImplementQueueUsingStack();
		iqus.enQueue(1);
		iqus.enQueue(2);
		iqus.enQueue(3);
		iqus.enQueue(4);
		iqus.enQueue(5);
		
		System.out.println(iqus.deQueue());
		
	}

}

import java.util.Stack;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class ConditionLocking
{
	Stack<Integer> s=new Stack<Integer>();
	ReentrantLock lock =new ReentrantLock();
	int CAPACITY=5;
	
	Condition StackFullCondition=lock.newCondition();
	Condition StackEmptyCondition=lock.newCondition();

	public void pushToStack(int item) throws InterruptedException
	{
		lock.lock();
		try {
			
			while(s.size()==CAPACITY)
			{
				StackFullCondition.await();
			}
			s.push(item);
			StackEmptyCondition.signalAll();
		}
		finally {
			lock.unlock();
		}
	}
	
	public Integer popFromStack() throws InterruptedException
	{
		lock.lock();
		try {
			while(s.size()==0)
				StackEmptyCondition.await();
			return s.pop();
		}
		finally {
			StackFullCondition.signalAll();
			lock.unlock();
		}
	}

}


public class LockApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

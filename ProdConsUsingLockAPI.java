import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ProducerNew implements Runnable {
	Queue<Integer> q;
	Lock lock;
	
	ProducerNew(Queue<Integer> q,Lock lock) {
		this.q = q;
		this.lock=lock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				lock.lock();
				if (q.size() == 5) {
					System.out.println("Queue is full. W8ng for consumer to consume.");
					}
				else {
			Random r=new Random();
			int n=r.nextInt(10);
			System.out.println(Thread.currentThread().getName()+" produced: "+n);
			q.add(n);
			q.notify();
			}
			}
			catch(IllegalMonitorStateException e)
			{	
			}
			finally {
				lock.unlock();
			}
		}
		}
	}

class ConsumerNew implements Runnable {

	Queue<Integer> q;
    Lock lock;
	
	ConsumerNew(Queue<Integer> q,Lock lock)
		{
			this.q=q;
			this.lock=lock;
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				lock.lock();
				if (q.isEmpty()) {
					System.out.println("Queue is empty. W8ng for producer to produce");
				}
				else
				{
			   System.out.println(Thread.currentThread().getName() + " consumed : " + q.remove());
			}
			}
			catch(IllegalMonitorStateException e)
			{	
			}
			finally {
				lock.unlock();
			}
		
	}
}
	}

public class ProdConsUsingLockAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Integer> q =new LinkedList<Integer>();	
        
        Lock lock = new ReentrantLock();
		
		ProducerNew p = new ProducerNew(q,lock);
		ConsumerNew c = new ConsumerNew(q,lock);
		
		new Thread(p,"Producer").start();
		new Thread(c,"Consumer").start();
	}

}

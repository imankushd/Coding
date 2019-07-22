import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantLock;

class PrintJob implements Runnable{
    
	private PrintQueue pq; 
	
	PrintJob(PrintQueue pq)
	{
		this.pq=pq;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" is going to start its job");
		pq.printJob();
	}
	
}

class PrintQueue
{
	Lock lock=new ReentrantLock();
	public void printJob()
	{
		try {
		lock.lock();
		System.out.println(Thread.currentThread().getName()+" started printing the document");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println(Thread.currentThread().getName()+" printed the document.\nJob done.");
			lock.unlock();
		}
	}
}


public class LockApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  PrintQueue printerQueue = new PrintQueue();
	      Thread thread[] = new Thread[10];
	      for (int i = 0; i < 10; i++)
	      {
	         thread[i] = new Thread(new PrintJob(printerQueue), "Thread " + i);
	      }
	      for (int i = 0; i < 10; i++)
	      {
	         thread[i].start();
	      }
	}

}

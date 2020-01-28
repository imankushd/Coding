import java.util.concurrent.CountDownLatch;

class Worker extends Thread
{
	private int delay;
	private CountDownLatch latch;
	
	public Worker(int delay, CountDownLatch latch,String name) {
		super(name);
		this.delay = delay;
		this.latch = latch;
	}
	
	public void run()
	{
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println(Thread.currentThread().getName()+" finished.");
	}
	
}

public class CountDownLatchExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		CountDownLatch latch = new CountDownLatch(3);
		
		Worker w1 = new Worker(2000, latch, "A");
		Worker w2 = new Worker(3000, latch, "B");
		Worker w3 = new Worker(3000, latch, "C");
		
		w1.start();
		w2.start();
		w3.start();
		
		latch.await();
		
		// Main thread has started 
        System.out.println(Thread.currentThread().getName() + 
                           " has finished"); 
	}

}

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Computation1 implements Runnable
{
public static int sum=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Number of parties involved at this point of time (Computation 1): "+CyclicBarrierExample.barrier.getNumberWaiting());
		sum=10+3;
		try {
				CyclicBarrierExample.barrier.await(3000,TimeUnit.SECONDS);
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(TimeoutException t)
		{
			t.printStackTrace();
		}
	}
	
}

class Computation2 implements Runnable
{
	public static int product=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Number of parties involved at this point of time (Computation 2): "+CyclicBarrierExample.barrier.getNumberWaiting());
		product=3*6;
		try {
			CyclicBarrierExample.barrier.await(3000,TimeUnit.SECONDS);
	} catch (InterruptedException | BrokenBarrierException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(TimeoutException t)
	{
		t.printStackTrace();
	}
	}
	
}

public class CyclicBarrierExample implements Runnable {

	static CyclicBarrier barrier = new CyclicBarrier(3);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Thread t = new Thread(new CyclicBarrierExample());
		
		t.start();
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Number of parties involved at this point of time (Main): "+barrier.getNumberWaiting());
		
		/*Computation1 c1 = new Computation1();
		Computation2 c2 = new Computation2();*/
		
		Thread t1= new Thread(new Computation1());
		Thread t2= new Thread(new Computation2());
		
		t1.start();
		
		t2.start();
		
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Number of parties involved at this point of time (After Main barrier await): "+barrier.getNumberWaiting());
		
		System.out.println("Sum of product and sum from comptation 1 and computation 2: "+(Computation1.sum+Computation2.product));
		
		barrier.reset();
		
		System.out.println("Barrier is reset now.");
		
	}

}

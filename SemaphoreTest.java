package snippet;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	
	static Semaphore sm=new Semaphore(4);

	static class MyATMMachine implements Runnable
	{
              
               
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try{
				System.out.println(Thread.currentThread().getName() + " : acquiring lock...");
				System.out.println(Thread.currentThread().getName() + " : available Semaphore permits now: " 
								+ sm.availablePermits());
				
				sm.acquire();
				System.out.println(Thread.currentThread().getName() + " : got the permit!");
			for(int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+" is working on "+i+" : available semaphores now : "+sm.availablePermits());
				Thread.sleep(1000);
			}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				System.out.println(Thread.currentThread().getName() + " : releasing lock...");
				System.out.println(Thread.currentThread().getName() + " : available Semaphore permits now: " 
								+ sm.availablePermits());
				
				sm.release();
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyATMMachine m1=new MyATMMachine();
		Thread t1=new Thread(m1,"A");
		t1.start();
		
		MyATMMachine m2=new MyATMMachine();
		Thread t2=new Thread(m2,"B");
		t2.start();
		
		MyATMMachine m3=new MyATMMachine();
		Thread t3=new Thread(m3,"C");
		t3.start();
		
		MyATMMachine m4=new MyATMMachine();
		Thread t4=new Thread(m4,"D");
		t4.start();
		
		MyATMMachine m5=new MyATMMachine();
		Thread t5=new Thread(m5,"E");
		t5.start();
		
		MyATMMachine m6=new MyATMMachine();
		Thread t6=new Thread(m6,"f");
		t6.start();
		
		MyATMMachine m7=new MyATMMachine();
		Thread t7=new Thread(m7,"G");
		t7.start();
	}

}

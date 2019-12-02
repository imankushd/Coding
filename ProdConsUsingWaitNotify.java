import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Producer implements Runnable {
	Queue<Integer> q;

	Producer(Queue<Integer> q) {
		this.q = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
		synchronized (q) {
			try {
				if (q.size() == 5) {
					System.out.println("Queue is full. W8ng for consumer to consume.");
					q.wait();
				}
			} catch (InterruptedException e) {
			}
			Random r=new Random();
			int n=r.nextInt(10);
			System.out.println(Thread.currentThread().getName()+" produced: "+n);
			q.add(n);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			q.notify();
		}
		}
	}

}

class Consumer implements Runnable {

	Queue<Integer> q;

	Consumer(Queue<Integer> q)
		{
			this.q=q;
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
		synchronized (q) {
			try {
				if (q.isEmpty()) {
					System.out.println("Queue is empty. W8ng for producer to produce");
					q.wait();
				}
			} catch (InterruptedException e) {
			}
			
			System.out.println(Thread.currentThread().getName() + " consumed : " + q.remove());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			q.notify();
		}
		}
	}

}

public class ProdConsUsingWaitNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q =new LinkedList<Integer>();	
		
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		new Thread(p,"Producer").start();
		new Thread(c,"Consumer").start();
		
	}

}

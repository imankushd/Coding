package snippet;

import java.util.*;


class Producer implements Runnable{
	Queue<Integer> q;
	int maxSize;
	public Producer(Queue<Integer> q,int maxSize) {
		this.q = q;
		this.maxSize=maxSize;
	}
	public void run(){
		while(true)
		{
			synchronized (q) {
				while(q.size()==maxSize)
				{
					try{
						System.out.println("Queue is full");
						q.wait();
					}catch(Exception e){
						
					}
				}
				Random r=new Random();
				int n=r.nextInt(100);
				q.add(n);
				System.out.println(Thread.currentThread().getName()+" Produced: "+n);
				q.notify();
			}
			
		}
	}
}

class Consumer implements Runnable{
	Queue<Integer> q;
	int maxSize;
	public Consumer(Queue<Integer> q,int maxSize) {
		this.q = q;
		this.maxSize=maxSize;
	}
	public void run(){
		while(true)
		{
			synchronized (q) {
				while(q.isEmpty())
				{
					try{
						System.out.println("Queue is empty");
						q.wait();
					}catch(Exception e){}
				}
				int c=(int)q.poll();
				System.out.println(Thread.currentThread().getName()+" Consumed: "+c);
				q.notify();
			}
			
		}
	}
}
public class ProducerConsumerTest {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Queue<Integer> q=new LinkedList<Integer>(); 
		Thread t=new Thread(new Producer(q, 4),"Producer");
		Thread t1=new Thread(new Consumer(q, 4),"Consumer");
		t.start();
		t1.start();

	}

}

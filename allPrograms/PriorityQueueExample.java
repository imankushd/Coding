import java.util.Comparator;
import java.util.PriorityQueue;

class MyRun implements Runnable, Comparator<Thread> {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " is executed.");
	}

	@Override
	public int compare(Thread o1, Thread o2) {
		// TODO Auto-generated method stub
		if (o1.getPriority() > o2.getPriority()) {
			return -1;
		} else if (o1.getPriority() < o2.getPriority()) {
			return 1;
		} else
			return 0;
	}
}

public class PriorityQueueExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    PriorityQueue<Thread> pq = new PriorityQueue<Thread>(new MyRun());
    
    Thread t = new Thread(new MyRun(),"Ankush");
    Thread t1 = new Thread(new MyRun(),"Ankush1");
    
    t.setPriority(Thread.MAX_PRIORITY);
    t1.setPriority(Thread.MIN_PRIORITY);
	
    pq.add(t);
    pq.add(t1);
    
    while(!pq.isEmpty())
    {
    	synchronized (pq) {
    		pq.poll().start();
    		Thread.sleep(2000);
		}
    }

}

}

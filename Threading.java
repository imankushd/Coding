import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++)
			sum+=i;
		System.out.println("Thread "+Thread.currentThread().getName()+" is computing sum.");
		return sum;
	}
	
}

class MyThread1 implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int diff=0;
		for(int i=1;i<12;i++)
			diff+=i;
        System.out.println("Thread "+Thread.currentThread().getName()+" is computing difference.");
		return diff;
	}
	
}

public class Threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newFixedThreadPool(2);
		Callable<Integer> c=new MyThread();
		Callable<Integer> c1= new MyThread1();
		Future<Integer> f = executor.submit(c);
		Future<Integer> f1 = executor.submit(c1);
		
		try {
			System.out.println(f.get()-f1.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.shutdown();
	}

}

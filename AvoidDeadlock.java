import java.util.concurrent.BlockingQueue;

class TestThread1 extends Thread {

	TestThread1() {
		super("TestThread1");
	}

	public void run() {
		synchronized (Integer.class) {

			System.out.println("Hello TestThread1");

			synchronized (String.class) {
				System.out.println("Hello TestThread1 TestThread1");
			}

		}
	}
}

class TestThread2 extends Thread {

	TestThread2() {
		super("TestThread2");
	}

	public void run() {
		synchronized (Integer.class) {

			System.out.println("Hello TestThread2");

			synchronized (String.class) {
				System.out.println("Hello TestThread2 TestThread2");
			}

		}
	}
}

public class AvoidDeadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestThread1 t = new TestThread1();
		TestThread2 t1 = new TestThread2();
		
		t.start();
		t1.start();
		
	}

}

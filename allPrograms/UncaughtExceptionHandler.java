



class TestThread implements Runnable{
 
    @Override
    public void run() {
        throw new RuntimeException();
         
    }
}
    
class UncaughtExceptionHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread myThread = new Thread(new TestThread());
        myThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
 
            public void uncaughtException(Thread myThread, Throwable e) {
                System.out.println(myThread.getName() + " throws exception: " + e);
                new Thread(new TestThread()).start();
            }
        });
        // this will call run() function
        myThread.start();

	}

}

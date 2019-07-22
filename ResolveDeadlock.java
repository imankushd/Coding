
public class ResolveDeadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Object a=new Object();
       Object b=new Object();
       
       Runnable r=new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (a) {
				System.out.println("Inside 1");
				try {
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				synchronized (b) {
					System.out.println("Inside 11");
				}
			}
		}
	};
	
	Runnable r1 = new Runnable() {
        public void run() {
            synchronized (a) {
                // Thread-2 have B but need A also
            	System.out.println("Inside 2");
            	try {
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
                synchronized (b) {
                    System.out.println("In block 2");
                }
            }
        }
    };
		
    new Thread(r1).start();
    new Thread(r).start();
    
		
	}

}

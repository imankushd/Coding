
public class StaticExample {
	private static int i=0;
	StaticExample()
    {
    System.out.println("In constructor");
    }
    static
	{
		System.out.println("Hii Here");
		i=11;
	}
    {
    	System.out.println("Hii Here1");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticExample i=new StaticExample();
		System.out.println("Hii There: "+i);
		i=12;
		System.out.println("Hii There1: "+i);
	}

}


public class TestConcepts {
	
	int a;
	String d;

	TestConcepts()
	{
		
		this(1,"Ankush");
		System.out.println("Default Cons");
	}
	TestConcepts(int a,String d)
	{
		this.a=a;
		this.d=d;
		System.out.println("Para Cons");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * TestConcepts t=new TestConcepts(); //A a=new A(); t.disp();
		 * System.out.println(t.sayHello());
		 */	
	 	TestConcepts t=new TestConcepts();
	 	
	
	}
}

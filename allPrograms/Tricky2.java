class A
{
private static void A()
{
	System.out.println("Base");
}
}

class B extends A
{
	public static void A()
	{
		System.out.println("Derived");
	}
}

public class Tricky2 {
	public static void main(String args[]) {
		B b=new B();
		
	}
}
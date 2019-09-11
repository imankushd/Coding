interface f1
{
	default void m1()
	{
		System.out.println("Here");
	}
}
interface f2
{
	default void m1()
	{
		System.out.println("There");
	}
}
public class Test implements f1,f2 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t =new Test();
        t.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		f1.super.m1();
	}

}

package InterviewPrepare;

class TestNotNew
{
	public TestNotNew testNotNew;
	
	String name;
	
	private TestNotNew(String name)
	{
		this.name=name;
	}
	
	public static TestNotNew getInstance(String name)
	{
		return new TestNotNew(name);
	}
}

public class NewNotUsed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestNotNew t = TestNotNew.getInstance("Ankush");
		System.out.println("t: "+t.name);
		
		TestNotNew t1 = TestNotNew.getInstance("Dish");
		System.out.println("t1: "+t1.name);
	}

}

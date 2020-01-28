
final class TestImmu implements Cloneable{
	
	final String name;
	final int id;
	TestImmu(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	protected TestImmu getTestImmu() throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		return (TestImmu) super.clone();
	}
 }

public class AnkushImmu
{
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		 TestImmu am=new TestImmu("Ankush", 3152); System.out.println(am.getId());
		 System.out.println(am.getName());
		  
		 TestImmu amm=new TestImmu("Disha", 1390);
		 TestImmu amm1=amm.getTestImmu();
		 System.out.println(amm1.getId()); System.out.println(amm1.getName());
		 
		 
		 TestImmu am1=am.getTestImmu(); TestImmu am2=am.getTestImmu();
		 System.out.println(am1.getId()); System.out.println(am1.getName());
		 System.out.println(am2.getId()); System.out.println(am2.getName());
		 //System.out.println(am1.hashCode()+" >>>>>> "+am2.hashCode());
		 System.out.println(am1+" >>>>>> "+am2);
		 
	    
	    String s=new String("Hello");
	    System.out.println("First reference>>>>>>>>>>>>>> "+s.hashCode());
	    
	    //System.out.println("First reference after nullify>>>>>>>>>>>>>> "+s.hashCode());
	    //String s1="Hello World";
	    String s2="Hello";
	    System.out.println("Second reference after nullify>>>>>>>>>>>>>> "+s2.hashCode());
	    System.out.println(s2.hashCode());
	    System.out.println(s2==s);
	    System.out.println(s2.equals(s));
	}
}
import java.io.IOException;
import java.util.Arrays;
class A
{
   public void display() throws NullPointerException 
   {
	   System.out.println("Hello parent");	  
   }
}

class B extends A{
	public void display() throws RuntimeException
	   {
		   System.out.println("Hello Child");	  
	   }
}
public class CoreJavaConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
    	 System.out.println(Math.multiplyExact(2, 3));
    	 System.out.println(1.0/0.0);
    	 System.out.println(Double.MIN_VALUE);
    	 
    	 char[] chars = new char[] {'\u0097'};
         String str = new String(chars);
         byte[] bytes = str.getBytes();
         System.out.println(Arrays.toString(bytes));
         
         
         A a=new B();
         a.display();
	}

}

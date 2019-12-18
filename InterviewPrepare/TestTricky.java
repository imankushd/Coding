package InterviewPrepare;

import java.util.Arrays;


public class TestTricky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="ankush dhingra";
      int[] a = new int[150];
      
      for(int i=0;i<s.length();i++)
    	  a[s.charAt(i)]++;
      for(int i=97;i<130;i++)
      {
    	  if(a[i]>0)
    	  {
    		  //System.out.println((char)i+" and its frequency is "+a[i]);
    		  System.out.print((char)i+" ");
    	  }
    	 
      }
      System.out.println();
      //System.out.println(0^0);
      
      char[] charArray = new char[1];
      Arrays.fill(charArray, '0');
      String str = new String(charArray);
      
      System.out.println("str: "+str);
      
      //Bit Manipulation
      byte val = 100;
      val = (byte) (val >> 1);
      System.out.println(val);
     
      
      //Tricky Question
      if((Integer)127==(Integer)127)
      {
    	  System.out.println("Heeee");
      }
      else
    	  System.out.println("Yeeeee");
      
      //Tricky
      System.out.println("j" + 'a' + 'v' + 'a'); 
      
      //tricky
      int $_ = 5; 
      System.out.println($_);
      
   // \u000d System.out.println("comment executed"); 
      
      //used inside loop or switch
      /*if (true) 
          break; */
      
      //tricky
      System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
      
      //TRICKY
      System.out.println(1.0/0.0);
      
      //tricky
      double x=Double.NaN;
      //System.out.println(x==Double.NaN);
      System.out.println(Double.isNaN(x));
      
      //Tricky
      char[] chars = new char[] {'\u0097'};
      String st = new String(chars);
      byte[] bytes = st.getBytes();
      System.out.println(Arrays.toString(bytes));
      
      //ways to create objects
      //https://www.geeksforgeeks.org/different-ways-create-objects-java/
      /*1)- new keyword;
      2)- newInstance() method using Class.forName(className);
      3)- clone() method;
      4)- deserialisation;
      5)- newInstance() method of constuctor class*/
      
	}
	
}

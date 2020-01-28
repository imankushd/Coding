import java.util.*;
public class CodeProblems {
   public static void main(String args[])
   {
		/*
		 * Scanner sc=new Scanner(System.in); int t=sc.nextInt(); for(int i=0;i<t;i++) {
		 * int n=sc.nextInt(); int[] a=new int[n];
		 * 
		 * HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>(); for(int
		 * q=0;q<n;q++) { a[i]=sc.nextInt(); if(hm.containsKey(a[i])) { continue; } else
		 * { hm.put(a[i],1); } } }
		 */
	   
	  System.out.println('j' + 'a' + 'v' + 'a'); //1 Question 
	  
	  //2nd Question
	  Integer num1 = 100; 
      Integer num2 = 100; 
      Integer num3 = 500; 
      Integer num4 = 500; 
        
      if(num1==num2){ 
          System.out.println("num1 == num2"); 
      } 
      else{ 
          System.out.println("num1 != num2"); 
      } 
      if(num3 == num4){ 
          System.out.println("num3 == num4"); 
      } 
      else{ 
          System.out.println("num3 != num4"); 
      }
      
      //4th Question
   // \u000d System.out.println("comment executed"); 
      
      //5th Question
      System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
      
      //6th question--finally will execute if we put return or System.exit()
      main(2);
      } 
   
   //3rd Question-- 2 main method
   public static int main(int a)
   {
	   try {
		   return 2;
         }
	   catch(Exception e)
	   {
	   }
	   finally {
		   System.out.println("abc");
	   }
	return a;
   }
}

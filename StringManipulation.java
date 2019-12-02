
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="ROCKSTARCKS";
         String ss="rockstar";
         
         String sss=s+ss;
         System.out.println("sss: "+sss);
         
         int n=s.compareTo(ss);
         System.out.println("Comparing string with case: "+n);
         
         n=s.compareToIgnoreCase(ss);
         System.out.println("Comparing string without case: "+n);
         
         System.out.println(s.indexOf('K'));
         
         System.out.println(s.charAt(4));
         
         System.out.println(s.contains("CKS"));
         
         String s1=s.replaceFirst("CKS", "r");
         System.out.println("s1: "+s1+" and s:"+s);
         
         s=s.replaceAll("CKS", "r");
         System.out.println("Now s: "+s);
         
         
	}

}

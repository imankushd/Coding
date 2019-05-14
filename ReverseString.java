package snippet;
import java.util.*;
public class ReverseString {
public static void main(String args[])
{
	//Scanner sc=new Scanner(System.in);
	String s="Hello World";
	char[] c1=s.toCharArray();
	char[] c=new char[1000];
	for(int i=0;i<s.length();i++)
		c[i]=c1[s.length()-i-1];
	String s1=new String(c);
	System.out.println("Reverse String is "+s1);
}
}

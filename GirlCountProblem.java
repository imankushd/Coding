package snippet;
import java.util.*;

public class GirlCountProblem {
	public static void main(String args[])
	{
		int n=1;
		int c=0;
		c=n%5;
		if(c==1)
			System.out.println("thumb");
		else if(c==2)
			System.out.println("index finger");
		else if(c==3)
			System.out.println("middle finger");
		else if(c==4)
			System.out.println("ring finger");
		else if(c==0)
			System.out.println("little finger");
	}
}

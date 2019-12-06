package CodeChefCerticiation;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class LargeIntegerComparsionArray implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.length()==o2.length())
		{
			if(o1.compareTo(o2)>0)
				return 1;
			else if(o1.compareTo(o2)<0)
				return -1;
			else
				return 0;
		}
		if(o1.length()<o2.length())
		{
			return -1;
		}
		
		return 1;
	}
}

class LargeIntegerComparsion implements Comparator<BigIntCompare>
{

	@Override
	public int compare(BigIntCompare o1, BigIntCompare o2) {
		// TODO Auto-generated method stub
		if(o1.toString().length()==o2.toString().length())
		{
			if(o1.compareTo(o2)>0)
				return 1;
			else if(o1.compareTo(o2)<0)
				return -1;
			else
				return 0;
		}
		if(o1.toString().length()<o2.toString().length())
		{
			return -1;
		}
		
		return 1;
	}
}

class BigIntCompare extends BigInteger
{

	public BigIntCompare(String val) {
		super(val);
		// TODO Auto-generated constructor stub
	}
	
}


public class BigIntegerComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]={"100000000000000000","200000000000","5000000000000","10000000001000000","20000000001000000","5000000001"};
		
		BigIntCompare b = new BigIntCompare("100000000000000000");
		BigIntCompare b1 = new BigIntCompare("200000000000");
		BigIntCompare b2 = new BigIntCompare("5000000000000");
		BigIntCompare b3 = new BigIntCompare("10000000001000000");
		BigIntCompare b4 = new BigIntCompare("20000000001000000");
		BigIntCompare b5 = new BigIntCompare("5000000001");
		
		List<BigIntCompare> l = new ArrayList<BigIntCompare>();
		l.add(b);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		
		//Using Custom Array sort Implementation
		System.err.println("Using Custom Implementation");
		System.out.println();
		
		System.out.println("Before sorting. . .");
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+" ");
		System.out.println();
        Arrays.sort(s, new LargeIntegerComparsionArray());
        
        System.out.println();
        
        System.out.println("After sorting. . .");
        for(int i=0;i<s.length;i++)
			System.out.print(s[i]+" ");
		
        System.out.println();
		System.out.println();
		
		//Using BigInteger Collection sort Implementation
		System.err.println("Using BigInteger Implementation");
		System.out.println();
		
		System.out.println("Before List sorting. . .");
		
		for(BigIntCompare i : l)
			System.out.print(i+" ");
		System.out.println();
		
		Collections.sort(l, new LargeIntegerComparsion());
		
		System.out.println();
		
		System.out.println("After List sorting. . .");
		
		for(BigIntCompare i : l)
			System.out.print(i+" ");
		System.out.println();
		
	}

}

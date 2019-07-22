import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

@FunctionalInterface
interface Square
{
	//only one abstact method in functional interface
	public int calculate(int x);
	default int disp()
	{
		return 0;
	}
	default int disp1()
	{
		return 0;
	}
}
public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //new Thread(()->{System.out.println("New Thread created");}).start();
        
		int a=5;
		Square s=(int x)->x*x;
		
		int area=s.calculate(a);
		System.out.println("Area is "+area);
		
		//Predicate functional interface use
		
		List<String> names=Arrays.asList("Dishank","Ankush","Disha");
		
		Predicate<String> p=(s1)->s1.startsWith("D");
		
		for(String st:names)
		{
			if(p.test(st))
				System.out.println(st);
		}
		
		//Binary Operator functional interface use
		
		BinaryOperator<String> b=BinaryOperator.maxBy((a1,b1)->(a1.compareTo(b1)>1)?1:((a1.compareTo(b1))==0?0:-1));
		System.out.println(b.apply("Ankush", "Ankur"));
	}

}
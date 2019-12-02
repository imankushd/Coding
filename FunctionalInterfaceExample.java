import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class AddThree implements Function<Integer, Integer>
{

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class NullOrNotNull implements Predicate<Integer>
{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

class MyConsumer1 implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
	}
	
}

class MySupplier implements Supplier<Integer>
{

	@Override
	public Integer get() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(3);

		//Function interface
		Function<Integer, Integer> a = (value) ->  value+3;
		Integer result = a.apply(2);
		System.out.println("Function : "+result);
		
		//Predicate Interface
		Predicate<Integer> p = (t) -> t!=null;
		boolean b = p.test(null);
		System.out.println("Predicate Test: "+b);
		
		//Consumer Interface
		Consumer<Integer> c = (s) -> System.out.println(s);
		l.forEach(c);
		
		//Supplier Interface
		Supplier<Integer> s= () -> 6;
		System.out.println(s.get());
	}

}

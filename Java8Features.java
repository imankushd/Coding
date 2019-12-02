import java.net.InterfaceAddress;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

//default and static methods
interface I1
{
	public void method1(String str);
	
	default void log1()
	{
		System.out.println("I1 log1");
	}
	
	static void print()
	{
		System.out.println("I1 print");
	}
}

interface I2
{
	public void method2();
	
	default void log1()
	{
		System.out.println("I2 log1");
	}
}

public class Java8Features implements I1,I2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0;i<100;i++)
			myList.add(i);
		
		//forEach() Method in Iterable interface using Anonymous Class
		/*
		 * myList.forEach(new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) { // TODO Auto-generated method stub
		 * System.out.println("Consumer : "+t); } });
		 */
		//forEach() Method in Iterable interface using MyConsumer Class		
		System.out.println("forEach() Method in Iterable interface using MyConsumer Class");
		MyConsumer m=new MyConsumer();
		myList.forEach(m);
		
		//default n static methods
		System.out.println("default n static methods");
		Java8Features j=new Java8Features();
		j.log1();
		
		//Functional Interface (Interface having only one abstract method.)  and Lambda Expressions 
		System.out.println("Functional Interface (Interface having only one abstract method.) and Lambda Expressions");
		  
		  Runnable r=new Runnable() {
		  
		  @Override public void run() { // TODO Auto-generated method stub
		  System.out.println("Anonymous run called"); } };
		 
		
		/*
		 * Runnable r = () -> {
		 * System.out.println("run method called using Lambda Expression"); };
		 */
		  
		  //Lambda Expressions
		  System.out.println("Lambda Expressions");
		I1 i=(s) -> System.out.println("Lambda :"+s);
		i.method1("Ankush");
		
		System.out.println("Stream API");
		
		//Sequencial Stream
		Stream<Integer> seqStream=myList.stream();
        //seqStream.forEach(p -> System.out.print(", Seq Stram : "+p));
        System.out.println();
		
        //parallel Stream
        Stream<Integer> parallelStream=myList.parallelStream();
		parallelStream.forEach(s -> System.out.print(", Parallel Stream: "+s));
		System.out.println();
        
		//Thread.sleep(20000);
		//using filter function
		  Stream<Integer> highNums = seqStream.filter(p -> p > 90); 
		  highNums.forEach(q -> System.out.println("high Nums : "+q));
		 
		LocalDateTime localDT=LocalDateTime.now();
		System.out.println("Current Date Time :"+localDT);
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log1() {
		// TODO Auto-generated method stub
		System.out.println("Overrided Log method");
		I1.print();
	}

	
}

class MyConsumer implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("MyConsumer Accept Impl: "+t);
	}
	
}

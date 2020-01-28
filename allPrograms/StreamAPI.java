import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer> number=Arrays.asList(2,3,4,5,6,8);
         
         List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList()); 
          System.out.println(square); 
          
          Set<Integer> squareSet=number.stream().map(x->x*x).collect(Collectors.toSet());
          System.out.println(squareSet);
          
          
          List<String> names=Arrays.asList("Disha","Ankush","Ankur","Deep");
          List<String> ans=names.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
          System.out.println(ans);
          
          List<String> ans1=names.stream().sorted().collect(Collectors.toList());
          System.out.println(ans1);

          //forEach
          //square.stream().map(x -> x*x).forEach(y->System.out.println(y));
          
          int even = number.stream().filter(x->x%2==0).reduce(0,(answer,i)-> answer+i); 
        	  
        	    System.out.println(even); 
	}

}

package snippet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
      
	  private String name;
	  private int age;
	
	  Employee(String name, int age)
	  {
		  this.name=name;
		  this.age=age;
	  }
	  
	  
	  
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee e1=new Employee("Rohit",24);
         Employee e2=new Employee("Ankush",24);
         Employee e3=new Employee("Tanvir",30);
         Employee e4=new Employee("Ankur",26);
         
         List<Employee> ll=new ArrayList<Employee>();
         ll.add(e1);
         ll.add(e2);
         ll.add(e3);
         ll.add(e4);
         for(Employee e:ll)
        	 System.out.println(e.getName()+" "+e.getAge());
         
         
         System.out.println();
         System.out.println();
         
         Collections.sort(ll);
         for(Employee e:ll)
        	 System.out.println(e.getName()+" "+e.getAge());
        		
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		 if(this.age<o.age)
			 return -1;
		 else if(this.age>o.age)
			 return 1;
		 else
		 {
			 if(this.name.compareTo(o.name)<0)
				 return -1;
			 else if(this.name.compareTo(o.name)>0)
				 return 1;
			 else
			return 0;
		 }
		 
/*		 if(this.name.compareTo(o.name)<0)
			 return -1;
		 else if(this.name.compareTo(o.name)>0)
			 return 1;
		 else
		return 0;*/
	}

}

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class Employee implements Comparable<Employee>
{
	private int age;
	private String name;
	
	Employee(int age,String name)
	{
		this.age=age;
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(this.getAge()>e.age)
			return 1;
		else if(this.getAge()<e.age)
		{return -1;}
		else
		{
			if(this.getName().compareTo(e.getName())>0)
				return 1;
			else if(this.getName().compareTo(e.getName())<0)
				return -1;
			else 
				return 0;
				
		}
	}
}

class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getName().compareTo(o2.getName())>0)
			return 1;
		else if(o1.getName().compareTo(o2.getName())<0)
			return -1;
		else
		return 0;
	}
	
}

public class TreeMapSort {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e=new Employee(25, "Ankush");
       Employee e1=new Employee(25, "Disha");
       Employee e2=new Employee(23, "Ankur");
       Employee e3=new Employee(22, "DJ");
       
       TreeSet<Employee> ts=new TreeSet<Employee>(new NameComparator());
       ts.add(e);
       ts.add(e1);
       ts.add(e2);
       ts.add(e3);
       
       Iterator<Employee> itr=ts.iterator();
       
       System.out.println("TreeSet Sorting:\n\n");
       
       while(itr.hasNext())
       {
    	   Employee ee=itr.next();
    	   System.out.println("Age: "+ee.getAge()+", Name: "+ee.getName());
       }
       
       TreeMap<Employee,Integer> tm=new TreeMap<Employee,Integer>(new NameComparator());
       tm.put(e, 1);
       tm.put(e1, 2);
       tm.put(e2, 3);
       tm.put(e3, 4);
       
       System.out.println("TreeMap Sorting:\n\n");
       
       for(Map.Entry<Employee, Integer> ee:tm.entrySet())
       {
    	   System.out.println("Age: "+ee.getKey().getAge()+", Name:"+ee.getKey().getName()+" >>>> "+ee.getValue());
       }
	}

}

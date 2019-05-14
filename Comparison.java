package snippet;

import java.util.ArrayList;
import java.util.Comparator;

class Student{
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


public class StudentComparison implements Comparable<Student>{
	
	Student b;
	public int compareTo(Object o)
	{
		if(b.getId()>)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"Ankush"));
		al.add(new Student(2,"Rohit"));
		al.add(new Student(3,"Bhupesh"));
		
		
		

	}

}

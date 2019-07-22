// Java code for serialization and deserialization 
// of a Java object 
import java.io.*; 

class Demo implements java.io.Serializable 
{ 
	public int a; 
	public String b; 
	private static final long serialVersionUID = 1L;
	
	public static volatile Demo instance;

	// Default constructor 
	
	
	 public Object readResolve() { 
	    System.out.println("Executing readResolve");
	 return this; 
	 }

	public static Demo getInstance() {
		// TODO Auto-generated method stub
		if(instance==null)
		{
			synchronized(Demo.class)
			{
				if(instance==null)
				{
					System.out.println("here i m");
					return instance;
				}
			}
		}
		
		return instance;
	}
	 

} 

class SerialisationDemo 
{ 
	public static void main(String[] args) throws IOException
	{ 
		Demo object = Demo.getInstance();
		object.a=10;
		object.b="Ankush";
		String filename = "file.ser"; 
		
		// Serialization 
		try
		{ 
			//Saving of object in a file 
			FileOutputStream file = new FileOutputStream(filename); 
			ObjectOutputStream out = new ObjectOutputStream(file); 
			
			// Method for serialization of object 
			out.writeObject(object); 
			
			out.close(); 
			file.close(); 
			
			System.out.println("Object has been serialized "); 
			//System.out.println("a = " + object.a); 
			//System.out.println("b = " + object.b); 
			
			//System.out.println("Object has been serialized"); 

		} 
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 
		

		Demo object1 = null; 

		// Deserialization 
		try
		{ 
			// Reading the object from a file 
			FileInputStream file = new FileInputStream(filename); 
			ObjectInputStream in = new ObjectInputStream(file); 
			
			// Method for deserialization of object 
			object1 = (Demo)in.readObject(); 
			
			in.close(); 
			file.close(); 
			
			System.out.println("Object has been deserialized "); 
			//System.out.println("a = " + object1.a); 
			//System.out.println("b = " + object1.b); 
		} 
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 
		catch(ClassNotFoundException ex) 
		{ 
			System.out.println("ClassNotFoundException is caught"); 
		} 
		
		System.out.println(object.hashCode());
		System.out.println(object1.hashCode());

	} 
} 

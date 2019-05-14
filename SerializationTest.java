package snippet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo implements java.io.Serializable
{
	int a;
	String b;
	Demo(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
}

class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Demo object=new Demo(1,"Ankush");
       String filename="/home/ankush/Desktop/File.txt";
       
       //Serialization
     try{
    	 FileOutputStream file=new FileOutputStream(filename);
    	 ObjectOutputStream out=new ObjectOutputStream(file);
    	 
    	 out.writeObject(object);
    	 
    	 out.close();
    	 file.close();
    	 
     }
     catch(IOException e)
     {
    	 System.out.println("Exception caught");
     }
     Demo object1=null;
     try{
    	FileInputStream file=new FileInputStream(filename);
    	ObjectInputStream in=new ObjectInputStream(file);
    	
    	object1=(Demo)in.readObject();
    	
    	in.close();
    	file.close();
    	
    	System.out.println("Deserialized a: "+object1.a+" & Deserialized b: "+object1.b);
     }
     catch(IOException ex){
    	 
     }
     catch(ClassNotFoundException e){
     }
     }
       
       
	}


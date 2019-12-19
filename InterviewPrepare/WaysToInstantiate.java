package InterviewPrepare;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToInstantiate implements Cloneable,Serializable{
	
	String name="Ankush";

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		//1st way
		WaysToInstantiate w1 = new WaysToInstantiate();
		System.out.println("1)- Using new keyword: "+w1.name);
		
		//2nd way
		Class c  = Class.forName("testclassloader.WaysToInstantiate");
		WaysToInstantiate w2 = (WaysToInstantiate) c.newInstance();
		System.out.println("2)- Using Class.forname() method: "+w2.name);
		
		//3rd Way
		WaysToInstantiate w3 = (WaysToInstantiate) w1.clone();
		System.out.println("3)- Using Cloneable interface: "+w3.name);
		
		//4th way
		String file="test.txt";
		FileOutputStream fo = new FileOutputStream(file);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(w1);   //Serialisation
		oo.close();
		fo.close();
		
		WaysToInstantiate w4 = null;
		FileInputStream fi = new FileInputStream(file);
		ObjectInputStream oi = new ObjectInputStream(fi);
		w4=(WaysToInstantiate) oi.readObject(); //Deserialisation
		oi.close();
		fi.close();
		
		System.out.println("4)- Using Deserialisation: "+w4.name);
		
		//5th Way (using newInstance() method of Constructor class)
		Constructor<WaysToInstantiate> constructor = WaysToInstantiate.class.getDeclaredConstructor();
		WaysToInstantiate w5 = constructor.newInstance();
		System.out.println("5)- Using newInstance() method of Constructor class: "+w5.name);
		
	}

}


//Code to illustrate Soft reference 
import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.util.concurrent.TimeUnit; 
class Gfg 
{ 
	//code.. 
	public void x() 
	{ 
		System.out.println("GeeksforGeeks"); 
	} 
} 

//We have talked about SoftReference only, there are three more references- Strong, Weak and Phantom
public class TypesOfReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Strong Reference 
				Gfg g = new Gfg(); 
				g.x(); 
				
				// Creating Soft Reference to Gfg-type object to which 'g' 
				// is also pointing. 
				SoftReference<Gfg> softref = new SoftReference<Gfg>(g); 
				
				// Now, Gfg-type object to which 'g' was pointing 
				// earlier is available for garbage collection. 
				g = null; 
							
				// You can retrieve back the object which 
				// has been weakly referenced. 
				// It succesfully calls the method. 
				g = softref.get(); 
				
				g.x(); 
		
	}

}

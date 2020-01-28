import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ConcurrentHashMap<Integer,String> hm=new ConcurrentHashMap<Integer,String>();
         hm.put(2,"");
         hm.put(1,"Disha");
        // hm.put(null, "Ankush Disha");
         
         Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
         ht.put(1, "Ankush");
         
         for(Map.Entry<Integer, String> e:hm.entrySet())
        	 System.out.println(e.getKey()+" "+e.getValue());
         
         for(Map.Entry<Integer, String> e:ht.entrySet())
        	 System.out.println(e.getKey()+" "+e.getValue());
	}

}

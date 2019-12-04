import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;


public class WeakHashMapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		WeakHashMap<Integer, Integer> wh = new WeakHashMap<Integer,Integer>();
		
		Integer i=new Integer(1);
		Integer j=new Integer(2);
		Integer k=3;
		
		//hashmap put operation
		hm.put(k, 1);
		hm.put(j, 2);
		
		//weakhashmap put operation
		wh.put(i, 1);
		wh.put(j, 2);
		
		System.out.println("Current Weak Map Size: "+wh.size());
		System.out.println("Current hash Map Size: "+hm.size());
			
		i=null;
		k=null;
	    System.gc();
		
	    System.out.println("After gc");
	    try {
			TimeUnit.SECONDS.sleep(9);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Weak Contains Key 1: "+wh.containsKey(1));
		System.out.println("Weak Map size now : "+wh.size());
		System.out.println("Hash Map Size now: "+hm.size());
	}

}


public class GernericArrayPrint {

	public static <E> void printArray(E[] inputArray) {
	    // display array elements
	    for (E element : inputArray)
	      System.out.printf("%s ", element);

	    System.out.println();
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] i = new Integer[]{1,2,3,4,5};
		
		String[] s = new String[]{"Ankush","Aditya","Vansh","Pranav"};
		
		printArray(i);
		printArray(s);
		
	}

}

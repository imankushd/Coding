package StringManipulation;

public class StringReverseUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Ankush Dhingra";
		
		String ss=reverseString(s);
		
		System.out.println(ss);
		
	}

	private static String reverseString(String s) {
		// TODO Auto-generated method stub
		
		if(s.length()<2)
			return s;
		
		return reverseString(s.substring(1))+s.charAt(0);
	}

	
}

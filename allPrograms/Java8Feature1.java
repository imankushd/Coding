package snippet;

interface MyData {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface MyData Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}

interface MyData1 {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface MyData1 Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}

public class Java8Feature1 implements MyData,MyData1 {
    
	
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	@Override
	public void print(String str) {
		// TODO Auto-generated method stub
		System.out.println("123");
	}

	public static void main(String args[]){
		Java8Feature1 obj = new Java8Feature1();
		obj.print("");
		obj.isNull("abc");
		MyData1.isNull("123");
	}
}
package StringManipulation;

final class OwnImmutableClass {

	final String name;
	final int id;
	
	OwnImmutableClass(String name,int id)
	{
		this.name= name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
}

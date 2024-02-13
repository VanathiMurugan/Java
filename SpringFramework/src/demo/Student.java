package demo;

public class Student {
	
	private String name;
	private int id;
	private Address a;
	
//	Getter and Setter name
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


//	Getter and Setter ID	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


//	Getter and Setter Address	
	public Address getA() {
		return a;
	}


	public void setA(Address a) {
		this.a = a;
	}

//	display info
	public void displayInfo() {
		
		System.out.println("Hello : "+name+" with Id : "+id );
		System.out.println("Address : "+a.getCity()+", "+a.getState()+", "+a.getLocation());
		
	}

}

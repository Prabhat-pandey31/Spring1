package in.pp.beans;

public class Student {
	
	private int rollno;
	private String name;
	private Address address;
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name :" +name);
		System.out.println("RollNo :" +rollno);
		System.out.println("Address :" +address);
	}

}

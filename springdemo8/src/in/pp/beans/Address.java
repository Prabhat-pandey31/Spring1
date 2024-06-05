package in.pp.beans;

public class Address {
	
	private int houseno;
	private String city;
	private float zipcode;
	
	
	public Address(int houseno, String city, float zipcode) {
		this.houseno = houseno;
		this.city = city;
		this.zipcode = zipcode;
	}


	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
	

}

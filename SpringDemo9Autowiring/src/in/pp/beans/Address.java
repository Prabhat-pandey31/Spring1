package in.pp.beans;

public class Address {
	private int houseno;
	private String city;
	private float zipcode;
	
	


	public int getHouseno() {
		return houseno;
	}




	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public float getZipcode() {
		return zipcode;
	}




	public void setZipcode(float zipcode) {
		this.zipcode = zipcode;
	}




	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	


}

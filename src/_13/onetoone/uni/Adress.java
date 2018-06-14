package _13.onetoone.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int addressId;

	private String street;

	private String city;

	private int postalCode;

	public Adress(String street, String city, int postalCode) {
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}

	public Adress() {
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

}

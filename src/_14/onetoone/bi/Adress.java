package _14.onetoone.bi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int addressId;

	private String street;

	private String city;

	private int postalCode;

	// @OneToOne(mappedBy = "address")
	
	@OneToOne(mappedBy = "address")
	private Customer customer;

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Adress [addressId=" + addressId + ", street=" + street + ", city=" + city + ", postalCode=" + postalCode
				+ ", customer=" + customer + "]";
	}

}

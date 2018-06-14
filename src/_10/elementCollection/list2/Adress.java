package _10.elementCollection.list2;

import javax.persistence.Embeddable;

//@Embeddable
public class Adress {

	// @Column(name = "sehir")
	private String city;

	// @Column(name = "sokak")
	private String street;
	
	// @Column(name = "ulke")
	private String country;

	public Adress(String city, String street, String country) {
		this.city = city;
		this.street = street;
		this.country = country;
	}

	public Adress() {
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Adress [city=" + city + ", street=" + street + ", country=" + country + "]";
	}
}

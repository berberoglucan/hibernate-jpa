package _09.elementCollection.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity
public class Personel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Temporal(TemporalType.DATE)
	@Column(name = "birth_of_date")
	private Date birthOfDate;

	@ElementCollection(fetch = FetchType.LAZY)
	// olusacak tablo adi ve primary_key adi
	@CollectionTable(name = "personel_phoneNumbers", joinColumns = @JoinColumn(name = "personel_id"))
	// kendi column adi
	@Column(name = "phone_number")
	private List<String> phoneNumbers = new ArrayList<>();

	public Personel() {
	}

	public Personel(String firstName, String lastName, Date birthOfDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
	}

	public void addPhoneNumber(String... phoneNumbers) {

		if (phoneNumbers != null) {
			for (String phoneNumber : phoneNumbers) {
				if (phoneNumber != null && phoneNumber.length() > 0)
					this.phoneNumbers.add(phoneNumber);
			}
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	@Override
	public String toString() {
		return "Personel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthOfDate="
				+ birthOfDate + ", phoneNumbers=" + phoneNumbers + "]";
	}

}

package _11.elementCollection.map;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
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

	@ElementCollection
	@CollectionTable(name = "personel_phoneNumbers2" ,joinColumns = @JoinColumn(name = "id"))
	@MapKeyColumn(name = "phone_type")
	private Map<String, String> phoneNumbers = new HashMap<>();
	
	public Personel() {
	}

	public Personel(String firstName, String lastName, Date birthOfDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
	}
	
	public void addPhoneNumber(String phoneType, String phoneNumber) {
		this.phoneNumbers.put(phoneType, phoneNumber);
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

package _14.onetoone.bi;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int customerId;

	private String firstName;

	private String lastName;

	@Temporal(TemporalType.DATE)
	private Date birthOfDate;

	@OneToOne
	@JoinColumn(name = "addressId", unique = true)
	private Adress address;

	public Customer() {
	}

	public Customer(String firstName, String lastName, Date birthOfDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public Adress getAddress() {
		return address;
	}

	public void setAddress(Adress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthOfDate=" + birthOfDate + ", address=" + address + "]";
	}

}

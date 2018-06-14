package _07.generatedvalue;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity
public class Student {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @GeneratedValue(strategy = GenerationType.TABLE)
	// @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	private String firstName;

	private String lastName;

	@Temporal(TemporalType.DATE)
	@Column(name = "birth_of_date")
	private Date birthOfDate;

	public Student() {
	}

	public Student(String firstName, String lastName, Date birthOfDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
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
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthOfDate="
				+ birthOfDate + "]";
	}

}

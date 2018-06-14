package _00.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

//@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "id", unique = true, length = 10)
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	// date -> sadece tarih
	// time -> sadece saat
	// timestamp -> tarih ve saat

	@Temporal(TemporalType.DATE)
	@Column(name = "birth_of_date")
	private Date birthOfDate;

	private String employeeNumber;

	@Lob
	private String about;

	@Transient // es gecer
	private double salary;

	public Employee() {
	}

	public Employee(int id, String firstName, String lastName, Date birthOfDate, String employeeNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.employeeNumber = employeeNumber;
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

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthOfDate="
				+ birthOfDate + ", employeeNumber=" + employeeNumber + ", about=" + about + ", salary=" + salary + "]";
	}

}

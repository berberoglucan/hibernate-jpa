package _17.manytoone.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String derpartmentName;

	private double minSalary;

	private double maxSalary;

	public Department(String derpartmentName, double minSalary, double maxSalary) {
		this.derpartmentName = derpartmentName;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public Department() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDerpartmentName() {
		return derpartmentName;
	}

	public void setDerpartmentName(String derpartmentName) {
		this.derpartmentName = derpartmentName;
	}

	public double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

}

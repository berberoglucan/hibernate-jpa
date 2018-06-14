package _15.onetomany.uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

//@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	private String firstName;

	private String lastName;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinTable(name = "user_products", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<Product> product = new ArrayList<>();

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

}

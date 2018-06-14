package _10.elementCollection.list2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity
@Table(name = "user_element_collection")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "user_name")
	private String userName;

	private String password;

	@Temporal(TemporalType.DATE)
	private Date birthOfDate;

	@ElementCollection
	@CollectionTable(name = "user_addresses", joinColumns = @JoinColumn(name = "user_id"))
	@AttributeOverrides({ @AttributeOverride(name = "city", column = @Column(name = "sokak")),
			@AttributeOverride(name = "country", column = @Column(name = "ulke")) })
	private List<Adress> addresses = new ArrayList<>();

	public User(String userName, String password, Date birthOfDate) {
		this.userName = userName;
		this.password = password;
		this.birthOfDate = birthOfDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public List<Adress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Adress> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", birthOfDate=" + birthOfDate
				+ ", addresses=" + addresses + "]";
	}

}

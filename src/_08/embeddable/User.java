package _08.embeddable;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	private String userName;

	private String password;

	@Embedded
	@AttributeOverrides({
		 @AttributeOverride(name = "phoneNumber" , column = @Column(name = "phone_number", length = 11)),
		 @AttributeOverride(name = "email", column = @Column(name = "email", unique = true , nullable = false))
	})
	private Contact contact;

	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	public User(String userName, String password, Contact contact, Date creationDate) {
		this.userName = userName;
		this.password = password;
		this.contact = contact;
		this.creationDate = creationDate;
	}

	public User() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", contact=" + contact
				+ ", creationDate=" + creationDate + "]";
	}

 }

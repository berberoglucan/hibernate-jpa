package _18.manytomany.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String universityName;

	@ManyToMany(mappedBy = "universities")
	private List<Student> students = new ArrayList<>();

	public University(String universityName) {
		this.universityName = universityName;
	}

	public University() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public University(int id, String universityName) {
		this.id = id;
		this.universityName = universityName;
	}

}

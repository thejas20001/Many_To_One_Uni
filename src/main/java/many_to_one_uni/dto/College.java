package many_to_one_uni.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GeneratorType;

@Entity

public class College {
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", address=" + address + ", college=" + college + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String name;
	private String address;
	@ManyToOne
	private College college;

	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}

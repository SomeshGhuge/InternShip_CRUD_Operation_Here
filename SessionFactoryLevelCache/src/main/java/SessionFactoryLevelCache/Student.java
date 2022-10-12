package SessionFactoryLevelCache;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="Session_Factory_Level_Cache")

public class Student {

	@Id
	@Column(name ="Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="FirstName")//required for column name
	private String FirstName;
	
	@Column(name="LastName")// required for column name
	private String LastName;
	
	@Column(name="City")
	private String City;
	
	@Column(name="Mobile_no")
	private String Mobile_No;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public String getMobile_No() {
		return Mobile_No;
	}

	public void setMobile_No(String mobile_No) {
		this.Mobile_No = mobile_No;
	}

	




}

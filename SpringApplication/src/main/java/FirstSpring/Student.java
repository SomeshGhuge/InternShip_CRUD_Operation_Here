package FirstSpring;

public class Student {
	private String FirstName;
	private String LastName;
	private String Age;
	private String City;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + ", City=" + City + "]";
	}
	
	

}

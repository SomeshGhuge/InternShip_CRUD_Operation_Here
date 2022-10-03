package Encapsulation;

public class Use_of_Setter_Getter {
	// This is how we initialise the setter or getter info
	private int salary;
	public void setSalary(int sal) {
		if (sal>0) {
			salary=sal;
		}else {
			salary=0;
		}
	}
	public int getsalary() {
		return salary;
	}

}

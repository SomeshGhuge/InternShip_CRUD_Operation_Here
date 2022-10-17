package Simple;

public class Employee {
	private int balance;
	private Address Address;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Balance--------->"+balance);
		System.out.println("Adress pincode-->"+Address.getPincode());
		
	}
	


}

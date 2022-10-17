package Objects;
public class Employee {
		private int balance;
		private String City;
		private Address address;
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public int getBalance() {
			return balance;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public Address getAddress() {
			return address;
		}
		
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public void getAllEmployee() {
			System.out.println("City----->"+City);
			System.out.println("balance--->" + balance);
			System.out.println("Address>>" + address.getPincode());
	}}


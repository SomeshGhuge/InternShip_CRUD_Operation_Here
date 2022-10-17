package ByConstructor;

public class Categories {

	private String Name;
	private Policy Policy;
	
	public Categories(String Name,Policy Policy) {
		this.Name=Name;
		this.Policy=Policy;
	}
	
	@Override
	public String toString() {
		return "Categories [Name=" + Name + ", Policy=" + Policy + "]";
	}

	public void show() {
		System.out.println("Categories Name----->"+Name);
		System.out.println("Policy Name--------->"+Policy.getPlanName());
		System.out.println("Policy Amount------->"+Policy.getPlanAmount());
	}
}

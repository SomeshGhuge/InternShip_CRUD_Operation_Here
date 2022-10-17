package ByConstructor;

public class Policy {
	private String PlanName;
	private String PlanAmount;
	
	public String getPlanName() {
		return PlanName;
	}
	
	public String getPlanAmount() {
		return PlanAmount;
	}

	
	public Policy(String PlanName,String PlanAmount) {
		this.PlanAmount=PlanAmount;
		this.PlanName=PlanName;
	}

	@Override
	public String toString() {
		return "Policy [PlanName=" + PlanName + ", PlanAmount=" + PlanAmount + "]";
	}
	
	

}

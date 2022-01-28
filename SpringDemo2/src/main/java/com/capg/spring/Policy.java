package com.capg.spring;



public class Policy {
	
	
	private int policyId;
	private String policyName;
	private int sumAssured;
	private int premiumAmount;
	
	
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", sumAssured=" + sumAssured
				+ ", premiumAmount=" + premiumAmount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + policyId;
		result = prime * result + ((policyName == null) ? 0 : policyName.hashCode());
		result = prime * result + premiumAmount;
		result = prime * result + sumAssured;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Policy other = (Policy) obj;
		if (policyId != other.policyId)
			return false;
		if (policyName == null) {
			if (other.policyName != null)
				return false;
		} else if (!policyName.equals(other.policyName))
			return false;
		if (premiumAmount != other.premiumAmount)
			return false;
		if (sumAssured != other.sumAssured)
			return false;
		return true;
	}
	
	
	

}
package com.myspace.ccd_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CreditCardHolder implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Age")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label(value = "Balance Ratio")
	private java.lang.Float balanceRatio;
	@org.kie.api.definition.type.Label(value = "Number of Previous Incidents")
	private java.lang.Integer incidentCount;
	@org.kie.api.definition.type.Label(value = "Risk Rating")
	private java.lang.Integer riskRating;
	@org.kie.api.definition.type.Label(value = "State Code")
	private java.lang.String stateCode;
	@org.kie.api.definition.type.Label(value = "Status")
	private java.lang.String status;

	public CreditCardHolder() {
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.Float getBalanceRatio() {
		return this.balanceRatio;
	}

	public void setBalanceRatio(java.lang.Float balanceRatio) {
		this.balanceRatio = balanceRatio;
	}

	public java.lang.Integer getIncidentCount() {
		return this.incidentCount;
	}

	public void setIncidentCount(java.lang.Integer incidentCount) {
		this.incidentCount = incidentCount;
	}

	public java.lang.Integer getRiskRating() {
		return this.riskRating;
	}

	public void setRiskRating(java.lang.Integer riskRating) {
		this.riskRating = riskRating;
	}

	public java.lang.String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(java.lang.String stateCode) {
		this.stateCode = stateCode;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public CreditCardHolder(java.lang.Integer age,
			java.lang.Float balanceRatio, java.lang.Integer incidentCount,
			java.lang.Integer riskRating, java.lang.String stateCode,
			java.lang.String status) {
		this.age = age;
		this.balanceRatio = balanceRatio;
		this.incidentCount = incidentCount;
		this.riskRating = riskRating;
		this.stateCode = stateCode;
		this.status = status;
	}

}
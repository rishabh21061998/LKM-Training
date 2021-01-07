package com.accenture.lkm.oop.associations.inhertitance;

public class ContractEmployee extends Employee {
	public String contractEmployeeRole() {
		return "Contract Employee Role be explained here!!";
	}
	public double calculateSalary(double basicSalary,double HRA) {
	    return basicSalary+HRA+7;
	}

}

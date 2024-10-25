package builderpattern;

public class Builder {
	private Integer employeeId;
	
	private  String employeeName;
	
	private Double employeeSalary;
	
	public Builder employeeId(Integer employeeId) {
		this.employeeId=employeeId;
		return this;
	}
	
	public Builder employeeName(String employeeName) {
		this.employeeName=employeeName;
		return this;
	}
	
	public Builder employeeSalary(Double employeeSalary) {
		this.employeeSalary=employeeSalary;
		return this;
	}
	
	

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}	
	
	public Employee build() {
		return new Employee(this);
	}

}

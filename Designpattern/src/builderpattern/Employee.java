package builderpattern;

public class Employee {
	private Integer employeeId;
	
	private String employeeName;
	
	private Double employeeSalary;
	
	public Employee(Builder builder) {
		this.employeeId=builder.getEmployeeId();
		this.employeeName=builder.getEmployeeName();
		this.employeeSalary=builder.getEmployeeSalary();
		
		
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
}
	
	

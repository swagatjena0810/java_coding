package test;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private double basicSalary;
	private int noOfWorkingDays;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}
	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}
	public Employee(int empId, String name,  double basicSalary, int noOfWorkingDays) {
		super();
		this.empId = empId;
		this.name = name;
		
		this.basicSalary = basicSalary;
		this.noOfWorkingDays = noOfWorkingDays;
	}
	
}

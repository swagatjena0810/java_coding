package Workset;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private Integer empId;
	private String empName;
	private Double empSalary;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public Employee(Integer empId, String empName, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
}
public class Compa {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"swagat",30000.0);
		Employee e2=new Employee(2,"swagat",20000.0);
		Employee e3=new Employee(3,"Abhi",25000.0);
		List<Employee> empList=Arrays.asList(e1,e2,e3);
		empList.stream().sorted((emp1,emp2)->{
			int comparebyname=emp1.getEmpName().compareTo(emp2.getEmpName());
			if(comparebyname!=0) {
				return comparebyname;
			}
			else {
				return emp1.getEmpId().compareTo(emp2.getEmpId());
			}
		}).collect(Collectors.toList()).forEach(System.out::println);
	}

}

package builderpattern;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e=new Builder()
					.employeeId(1)
					.employeeName("swagat")
					.employeeSalary(27880.0)
					.build();
		
		System.out.println(e);
	}
}

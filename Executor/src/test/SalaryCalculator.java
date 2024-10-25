package test;

public class SalaryCalculator implements Runnable{
	private Employee e;
	public SalaryCalculator(Employee e) {
		this.e=e;
	}
	@Override
	public void run() {
		double salary=e.getBasicSalary()*e.getNoOfWorkingDays();
		e.setSalary(salary);
	}
	 
}

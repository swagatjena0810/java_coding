package test;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
	public static void main(String[] args) {
		
		
		Employee e1=new Employee(1,"e1",1000,24);
		Employee e2=new Employee(2,"e2",900,22);
		Employee e3=new Employee(3,"e3",950,26);
		Employee e4=new Employee(4,"e4",1009,24);
		Employee e5=new Employee(5,"e5",1200,25);
		Employee e6=new Employee(6,"e6",920,22);
		Employee e7=new Employee(7,"e7",1100,23);
		Employee e8=new Employee(8,"e8",800,24);
		9
		List<Employee> empList=Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
		
		ExecutorService ex=Executors.newFixedThreadPool(3);
		for(int i=0;i<empList.size();i++) {
			SalaryCalculator s=new SalaryCalculator(empList.get(i));
			ex.submit(s);
		}
		ex.shutdown();
	}
}

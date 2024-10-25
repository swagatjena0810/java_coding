package dependencyInversion;

public class CreditCard implements Payment{
	 public void doPayment(Long amount) {
		 System.out.println(amount+" payment using credit card");
	 }
}

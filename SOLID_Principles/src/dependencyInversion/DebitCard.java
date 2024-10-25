package dependencyInversion;

public class DebitCard implements Payment{
	 public void doPayment(Long amount) {
		 System.out.println(amount+" payment using debit card");
	 }
}

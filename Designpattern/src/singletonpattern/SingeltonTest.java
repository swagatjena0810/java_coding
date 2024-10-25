package singletonpattern;

public class SingeltonTest {
	public static void main(String[] args) {
		Singelton s=Singelton.getInstance();
		System.out.println(s.hashCode());
		Singelton s2=Singelton.getInstance();
		System.out.println(s2.hashCode());
	}
}

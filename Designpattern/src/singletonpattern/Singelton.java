package singletonpattern;

public final class Singelton {
	private static Singelton s;
	private Singelton() {};
	
	public static Singelton getInstance() {
		if(s==null) {
			s=new Singelton();
		}
		return s;
	}
}

package Test;

public class ThreadExample extends Thread{
	
	@Override
	public void run() {
		System.out.println("Running");
	}
	 public static void main(String[] args) {
		ThreadExample t=new ThreadExample();
		t.setName("Test thread");
		t.start();
	}
}

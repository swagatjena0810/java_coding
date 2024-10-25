package stream;

public class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println(" Daemon thread is running");
	}
	public static void main(String[] args) {
		Thread t=new Thread(new MyThread());
		t.setDaemon(true);
		if(t.isDaemon()) {
			t.start();
		}
		else {
			System.out.println("no daemon thread");
		}
	}
}

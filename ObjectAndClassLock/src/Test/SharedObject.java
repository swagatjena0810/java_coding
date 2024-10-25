package Test;

public class SharedObject {
    private boolean ready = false;

    public synchronized void waitForReady() throws InterruptedException {
        while (!ready) {
        	System.out.println("waiting");
            wait(); // Thread waits until ready is true
        }
    }

    public synchronized void setReady() {
        ready = true;
        notifyAll(); // Notify all waiting threads that ready is true
    }
}


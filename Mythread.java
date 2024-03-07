
class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("thread1 is running");
        } catch (Exception e) {
            System.out.println("exception is raised");
        }
    }
}

class Thread2 implements Runnable {
    public void run() {
        try {
            System.out.println("thread2 is running");
        } catch (Exception e) {
            System.out.println("EXCEPTION IS RAISED");
        }
    }
}

public class Mythread {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            Thread1 t1 = new Thread1();
            t1.start();
            Thread t2 = new Thread(new Thread2());
            t2.start();
            
        }
    }
}

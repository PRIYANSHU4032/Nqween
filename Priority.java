class Newthread extends Thread{
    public void run(){
        System.out.println("1 is running important one");
    }
}
class Newthread1 extends Thread{
    public void run(){
        System.out.println("1 is running normal one");
    }
}
class Newthread2 extends Thread{
    public void run(){
        System.out.println("1 is running other one");
    }
}
class Newthread3 extends Thread{
    public void run(){
        System.out.println("1 is running least one");
    }
}



public class Priority {
    public static void main(String[] args) {
        for(int i =0;i<400;i++){
            Newthread t1 = new Newthread();
        t1.start();
        try {
             t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t1.setPriority(Thread.MAX_PRIORITY);
        Newthread1 t2 = new Newthread1();
        t2.start();
        try {
            t2.sleep(400);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t2.setPriority(Thread.NORM_PRIORITY);
        Newthread2 t3 = new Newthread2();
        t3.start();
        Newthread3 t4 = new Newthread3();
        t4.start();
        t4.setPriority(Thread.MIN_PRIORITY);
        }
    }
}



class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        System.out.println("1 is running");
    }
}

public class Con{
    public static void main(String[] args) {
        Mythr t1 = new Mythr("priyanshu");
        t1.start();
        System.out.println(t1.getName());
    }
    
}

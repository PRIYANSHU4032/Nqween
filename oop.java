

public class oop {
    public static void main(String[] args) {
       // Father f = new Father();
        Son s =  new Son();
    }
}

class Father{
    Father(){
        System.out.println("I am father constructor");
    }
}

class Son extends Father{
    Son(){
        System.out.println("I am son constructor");
    }
}

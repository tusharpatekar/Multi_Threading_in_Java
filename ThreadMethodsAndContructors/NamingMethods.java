package ThreadMethodsAndContructors;

public class NamingMethods {
    public static void main(String[] args) {
        System.out.println("Hello world");
        //System.out.println(Thread.currentThread().getName()); // current thread returns object of current thread and using that thread object we can call thread class methods
        Thread.currentThread().setName("JusPay"); // here we set the name to the main thread as jusPay.
        System.out.println(10/0);

    }
}

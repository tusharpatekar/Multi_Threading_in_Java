package ThreadMethodsAndContructors;

public class UserDefineNamingThread  extends Thread{

    @Override
    public void run(){
//      System.out.println(Thread.currentThread().isAlive());
        System.out.println("Thread task is printed by " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        UserDefineNamingThread t = new UserDefineNamingThread();
        t.setName("Custom thread");
        t.start();
        System.out.println(" hello this thread is Printed by " + Thread.currentThread().getName());
//      System.out.println(t.getName());
        UserDefineNamingThread t1 = new UserDefineNamingThread();
        t1.start();
        System.out.println(t1.isAlive());  // this will return ture because this thread will execute first
    }
}

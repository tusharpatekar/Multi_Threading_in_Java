package ThreadMethodsAndContructors;

public class DaemonThreadExample extends Thread{
    @Override
    public void run(){

        if (Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        } else {
            System.out.println("child Thread");
        }
    }
    public static void main(String[] args) {
       // System.out.println("Main Thread");

        DaemonThreadExample t = new DaemonThreadExample();
        t.setDaemon(true);
        t.start();
        //t.setDaemon(true); // this will give runtime exception illegal thread
    }
}

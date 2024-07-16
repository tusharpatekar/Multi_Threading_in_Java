package ThreadMethodsAndContructors;

public class InterruptMethodExample extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e){
            System.out.println("Interrupted by method");
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        InterruptMethodExample t = new InterruptMethodExample();
        t.start();
        t.interrupt();   // it interrupts thread of obj t , whenever it goes in sleep
                         // if thread is not in sleeping or waiting then thread will not be interrupted.
    }
}

package ThreadMethodsAndContructors;

public class InterruptedMethodExample extends Thread{
    public void run(){
        System.out.println("A :" + Thread.interrupted()); // this will return status and change it into opposite only it convert true -> false
        System.out.println("isInterrupted :" + Thread.currentThread().isInterrupted()); // it is not going to change any status it only shows status
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("child thread" + " " + i);
                Thread.sleep(1000);
                System.out.println("B :" + Thread.interrupted());
            }
        } catch (Exception e){
            System.out.println("Interrupted with error " + " " + e);
        }
        //System.out.println(Thread.interrupted());
    }

    public static void main(String[] args) {
        InterruptedMethodExample t = new InterruptedMethodExample();
        t.start();
        t.interrupt();
    }
}

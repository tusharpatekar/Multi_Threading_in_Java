package ThreadMethodsAndContructors;

public class JoinMethod extends Thread {
    @Override
    public void run(){
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Child Thread" + i);
                    Thread.sleep(1000);
                }
            }catch (Exception e){
                System.out.println(e);
            }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethod t = new JoinMethod();
        t.start();
        t.join();  // it executes first child thread of obj t
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("main Thread" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

}

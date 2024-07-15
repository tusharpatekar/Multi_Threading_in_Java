package ThreadMethodsAndContructors;

public class JoinMethodWithMainThreadFirst extends Thread {
    static Thread mainMethodObj;
    @Override
    public void run() {

        try {
            mainMethodObj.join();
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread" + i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        mainMethodObj = Thread.currentThread();
        JoinMethodWithMainThreadFirst t = new JoinMethodWithMainThreadFirst();
        t.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("main Thread" + i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
/*

            main Thread0
            main Thread1
            main Thread2
            main Thread3
            main Thread4
            Child Thread0
            Child Thread1
            Child Thread2
            Child Thread3
            Child Thread4

 */
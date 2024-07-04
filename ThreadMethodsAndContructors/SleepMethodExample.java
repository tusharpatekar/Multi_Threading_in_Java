package ThreadMethodsAndContructors;

public class SleepMethodExample extends Thread {

    @Override
    public void run() {  // throw can be written as these or using try-catch

        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 6; i++) {
//            try {
//                Thread.sleep(1000);
//                System.out.println(i);
//            }catch (Exception e){
//                System.out.println(e);
//            }
//        }
        SleepMethodExample t = new SleepMethodExample();
        t.start();
    }
}

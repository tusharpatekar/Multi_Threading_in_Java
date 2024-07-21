package CoOperationSynchronization;

class TotalEarning extends Thread{
    int total = 0;
    @Override
    public void run(){
        try {
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                total += 100;
                Thread.sleep(1000);
            }
            this.notify();
        }
        } catch (Exception e){
            System.out.println(e);
        }


    }
}
public class WaitNotifyExample {

    public static void main(String[] args) throws InterruptedException {
        TotalEarning te = new TotalEarning();
        te.start();
        synchronized (te){
            te.wait(1000);
            System.out.println("Total Earning is :" + te.total + " Rs");
        }
    }

}

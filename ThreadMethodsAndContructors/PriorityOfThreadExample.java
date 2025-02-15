package ThreadMethodsAndContructors;
//windows does not support priority in threading
public class PriorityOfThreadExample extends Thread{
    @Override
    public void run(){
       // System.out.println("Priority of Child Thread is(before set or default) : " + " " + Thread.currentThread().getPriority());
        System.out.println("Set Priority is : " + " " + Thread.currentThread().getPriority());
        System.out.println("THis is Thread");

    }

    public static void main(String[] args) {
        PriorityOfThreadExample t = new PriorityOfThreadExample();
        System.out.println("The Priority of Main thread is :" + " " + Thread.currentThread().getPriority());  // default priority is 5.
        t.setPriority(10);
        t.start();

        System.out.print("Available priority are :" + " 1.MIN_PRIORITY -> " + MIN_PRIORITY + " " + "2.NORM_PRIORITY ->" + NORM_PRIORITY + " " + "3.MAX_PRIORITY->" + MAX_PRIORITY);

    }
}

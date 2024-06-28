package ThreadCases;


// case 4 -> Multiple task using Multiple Thread

class MyThread extends Thread
{
    public void run(){
        System.out.println(" This MyThread 1");
    }
}
class MyThread1 extends Thread
{
    public void run(){
        System.out.println("This My Thread 2");
    }
}

public class CaseMTMT {
    public static void main(String[] args) {
        MyThread t2 = new MyThread();
        t2.start();
        MyThread1 t1 = new MyThread1();
        t1.start();

        // here which thread is going to execute first or finished there task it depends on JVM scheduler
    }
}

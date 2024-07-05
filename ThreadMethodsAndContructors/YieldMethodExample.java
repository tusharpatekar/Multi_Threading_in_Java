package ThreadMethodsAndContructors;

public class YieldMethodExample extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.print(Thread.currentThread().getName() + " " + i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        YieldMethodExample t = new YieldMethodExample();
        t.start();  // thread starting

        //Thread.yield();   // executing yield before main thread loop
        for (int i = 0; i < 5; i++) {
            System.out.print(Thread.currentThread().getName() + " " + i);
            System.out.println();
        }
    }
}
/*

output -> with yield()   every run output will be different  here it is ignoring yield methods
            main 0
            main 1
            main 2
            main 3
            main 4
            Thread-0 0
            Thread-0 1
            Thread-0 2
            Thread-0 3
            Thread-0 4

output -> without yield method
            Thread-0 0  it is different
            main 0
            main 1
            main 2
            main 3
            main 4
            Thread-0 1
            Thread-0 2
            Thread-0 3
            Thread-0 4

 */
package simplethreadprograms;
import java.lang.*;
public class SimpleThreadProgramUsingRunnableInterface implements Runnable
{

    public void run(){
        System.out.println("Thread using Runnable");
    }

    public static void main(String[] args) {
        SimpleThreadProgramUsingRunnableInterface t = new SimpleThreadProgramUsingRunnableInterface();
        // here we required Thread class because without start() we can not invoke thread
        Thread th = new Thread(t);
        th.start();
        //th.start(); this will through the runtime error
    }
}

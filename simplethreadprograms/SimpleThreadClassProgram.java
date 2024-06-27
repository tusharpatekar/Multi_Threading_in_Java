package simplethreadprograms;

public class SimpleThreadClassProgram extends Thread
{

    public void run(){
        System.out.print("First threading");
    }

    public static void main(String[] args) {
        SimpleThreadClassProgram t = new SimpleThreadClassProgram();
        t.start();
    }
}

package ThreadCases;


// case 1 -> performing a single task from single thread

class CaseOne extends Thread
{
    @Override
    public void run(){
        System.out.println("Thread Created");
    }
}
public class CaseSTST {

    public static void main(String[] args) {
        CaseOne th = new CaseOne();
        th.start();;
    }
}

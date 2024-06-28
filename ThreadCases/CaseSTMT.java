package ThreadCases;
// case 2 -> single task Multiple Thread



class CaseTwo extends Thread
{
    @Override
    public void run(){
        System.out.println("Task by Two Thread");
    }
}
public class CaseSTMT {
    public static void main(String[] args) {
        CaseTwo t1 = new CaseTwo();
        t1.start();
        CaseTwo t2 = new CaseTwo();
        t2.start();
    }

}

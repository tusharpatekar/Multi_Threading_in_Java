package Synchronization;


class BookSeat2{
    static int total_seat = 20;
    static synchronized void bookSeat(int seat){

            if (total_seat >= seat) {
                total_seat -= seat;
                System.out.println(seat + " Seat booked Successfully");
                System.out.println("Seat remain is :" + total_seat);
            } else {
                System.out.println("Seat not Sufficient");
                System.out.println("Seat remain is :" + total_seat);
            }

    }
}

class MyThread1 extends Thread{
    BookSeat2 obj;
    int seat;
    MyThread1(BookSeat2 obj, int s){
        this.obj = obj;
        this.seat = s;
    }
    @Override
    public void run(){
        obj.bookSeat(seat);
    }
}
class MyThread2 extends Thread{
    BookSeat2 obj;
    int seat;
    MyThread2(BookSeat2 obj, int s){
        this.obj = obj;
        this.seat = s;
    }
    @Override
    public void run(){
        obj.bookSeat(seat);
    }
}

public class SynchronizedStatic {
    public static void main(String[] args) {
        BookSeat2 b = new BookSeat2();
        MyThread1 tushar = new MyThread1(b, 6);
        tushar.start();
        MyThread2 pratik = new MyThread2(b, 9);
        pratik.start();


        BookSeat2 c = new BookSeat2();
        MyThread1 yash = new MyThread1(c, 5);
        yash.start();

        MyThread2 tus = new MyThread2(c, 6);
        tus.start();
    }
}

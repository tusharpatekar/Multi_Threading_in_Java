package Synchronization;

 class BookSeat{
     int total_seat = 10;
     void bookSeat(int seat){
         synchronized (this) {
             if (total_seat >= seat) {
                 total_seat -= seat;
                 System.out.println("Seat booked Successfully");
                 System.out.println("Seat remain is :" + total_seat);
             } else {
                 System.out.println("Seat not Sufficient");
                 System.out.println("Seat remain is :" + total_seat);
             }
         }
    }
}


public class SynchronizedBlocks  extends Thread{

     static BookSeat b;
     int seat;
     @Override
     public void run() {
         b.bookSeat(seat);
     }

    public static void main(String[] args) {
          b = new BookSeat();
        SynchronizedBlocks tushar = new SynchronizedBlocks();
        tushar.seat = 9;
        tushar.start();
        SynchronizedBlocks pratik = new SynchronizedBlocks();
        pratik.seat = 6;
        pratik.start();
    }

}

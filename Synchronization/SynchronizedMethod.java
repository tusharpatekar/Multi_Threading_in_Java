package Synchronization;




class BookTheaterSeatNew{
        int total_seats = 10;
        synchronized void bookSeat(int seat){
            System.out.println(Thread.currentThread().getName());
            if(total_seats >= seat){

                System.out.println("Seat booked successfully");
                total_seats -= seat;
                System.out.println("Seat left :" + " " + total_seats);
            } else {
                System.out.println("Seat cannot be booked !!");
                System.out.println("Seat Left  :" + " " + total_seats);
            }
        }
    }
public class SynchronizedMethod extends Thread{

        static Synchronization.BookTheaterSeatNew b;
        int seats;
        @Override
        public void run(){
            //System.out.println(Thread.currentThread().getName());
            b.bookSeat(seats);
        }

        public static void main(String[] args) {
            b = new BookTheaterSeatNew();
            // user 1
            SynchronizedMethod tushar = new SynchronizedMethod();
            tushar.seats = 7;
            tushar.start();

            // user 2
            SynchronizedMethod pratik = new SynchronizedMethod();
            pratik.seats  = 6;
            pratik.start();
        }
    }
/*
                Thread-0
                Seat booked successfully
                Seat left : 3
                Thread-1
                Seat cannot be booked !!
                Seat Left  : 3

                now due to synchronized method it sync the resource allocation
 */


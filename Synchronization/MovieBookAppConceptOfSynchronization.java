package Synchronization;


class BookTheaterSeat{
    int total_seats = 10;
     void bookSeat(int seat){
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
public class MovieBookAppConceptOfSynchronization extends Thread{

     static BookTheaterSeat b;
    int seats;
    @Override
    public void run(){
        //System.out.println(Thread.currentThread().getName());
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();
        // user 1
        MovieBookAppConceptOfSynchronization tushar = new MovieBookAppConceptOfSynchronization();
        tushar.seats = 7;
        tushar.start();

        // user 2
        MovieBookAppConceptOfSynchronization pratik = new MovieBookAppConceptOfSynchronization();
        pratik.seats  = 6;
        pratik.start();
    }
}
/*
            Thread-0
            Thread-1
            Seat booked successfully
            Seat booked successfully
            Seat left : 4
            Seat left : -3

            it wrong output because thread are executing simultaneously
            that why here data is inconsistent
 */
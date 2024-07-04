public class WhyThreadingExample extends Thread{

    @Override
    public void run(){
        try{
            for (int i = 0; i < 5; i++) {
                System.out.print(i + " " + " : " + " " + Thread.currentThread().getName());
                System.out.println();
                Thread.sleep(1000);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        WhyThreadingExample t1 = new WhyThreadingExample();  // let we have created t1 obj
        t1.run(); // it directly call run methods
        WhyThreadingExample t2 = new WhyThreadingExample();
        t2.run();

        // it give out put like
        /*
                    0  :  main
                    1  :  main
                    2  :  main
                    3  :  main
                    4  :  main
                    0  :  main
                    1  :  main
                    2  :  main
                    3  :  main
                    4  :  main

               Here it's not executing simultaneously

         */

        // now using threading

        t1.start();
        t2.start();
        //output is
        /*

            0  :  Thread-0
            0  :  Thread-1
            1  :  Thread-0
            1  :  Thread-1
            2  :  Thread-1
            2  :  Thread-0
            3  :  Thread-0
            3  :  Thread-1
            4  :  Thread-0
            4  :  Thread-1

            so here threads are executing simultaneously
         */
    }
}

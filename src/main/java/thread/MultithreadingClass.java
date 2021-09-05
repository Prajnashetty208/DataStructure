package thread;

public class MultithreadingClass {

    public static void main(String[] args) {
        Multithreading mt= new Multithreading();
        Thread t = new Thread(mt);
        t.setName("First thread");

        Thread t2 = new Thread(() -> {
            mt.printSt();
        });
        t2.setName("Second thread");
//        t.start();
//        t2.start();


        Thread t3 = new Thread(() -> {
            synchronized ("m"){
                for(int i=0;i<100;i++){
                    System.out.println(Thread.currentThread().getName()+" ->"+ i);
                }
            }

        });

        Thread t4 = new Thread(() -> {
            synchronized ("m"){
                for(int i=0;i<100;i++){
                    System.out.println(Thread.currentThread().getName()+" ->"+ i);
                }
            }
        });

        t3.start();
        t4.start();
    }

}

class Multithreading implements Runnable {
    //int balance = 1000;
    @Override
    public  void run(){
        //balance = balance - 100;
        printSt();
    }

    public synchronized void printSt(){
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" ->"+ i);
        }
    }
}
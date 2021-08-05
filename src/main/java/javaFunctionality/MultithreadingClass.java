package javaFunctionality;

public class MultithreadingClass {

    public static void main(String[] args) {
        Multithreading mt= new Multithreading();
        Thread t = new Thread(mt);
        t.setName("First thread");

        Thread t2 = new Thread(mt);
        t2.setName("Second thread");
        t.start();
        t2.start();
    }

}

class Multithreading implements Runnable {
    //int balance = 1000;
    @Override
    public  void run(){
        //balance = balance - 100;
        for(int i=0;i<30;i++){
            System.out.println(Thread.currentThread().getName()+" ->"+ i);
        }

    }
}
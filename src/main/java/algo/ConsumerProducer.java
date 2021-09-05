package algo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ConsumerProducer {
    public static void main(String[] args) throws InterruptedException {
        Producer p = new Producer();
        Consumer c = new Consumer(p);

        Thread t = new Thread(p);
        Thread t2 = new Thread(c);

        t2.start();
        Thread.sleep(1000);
        t.start();


    }

}

class  Producer extends Thread{
    List<Integer> li1 = new ArrayList<>();
    //boolean read = false;
    public void run(){
        synchronized (this) {
            for(int i=0;i<10;i++){
                System.out.println(i);
                li1.add(i);
            }
            System.out.println("read set");
            this.notify();
            //read = true;
        }

    }
}

class Consumer extends Thread{
    Producer po;
    Consumer(Producer p){
        po=p;
    }
    public void run(){
        synchronized (po){
            System.out.println("Producer still producing");
            try {
                //sleep(10);
                po.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("consuming");
    }
}

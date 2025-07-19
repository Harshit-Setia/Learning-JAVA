// when multiple threads acces same data at same time leading in uexpected behaviour
class Counter{
    int counter;
    Counter(){
        counter=0;
    }
    public void inc(){
        counter++;
    }
}

public class RaceCondition {
    public static void main(String[] args) {
        Counter c=new Counter();

        Thread t1=new Thread(){
            public void run(){
                for(int i=0;i<10000;i++)c.inc();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                for(int i=0;i<10000;i++)c.inc();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c.counter);
    }
}

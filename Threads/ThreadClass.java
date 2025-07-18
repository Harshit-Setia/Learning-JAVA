class T1 extends Thread{ // thread using thread class
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("T1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class T2 implements Runnable{ // thread using runnable interface
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("T2");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        T1 obj1=new T1();
        obj1.start();// executes run method

        T2 obj2=new T2();
        Thread t1=new Thread(obj2);// runnable is SAM so we pass it to Thread obj then call start
        t1.start();

        Runnable obj3=()->{ // lambda expretion for runnable interface
            for(int i=0;i<5;i++){
                System.out.println("T3");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2=new Thread(obj3);
        t2.start();
    }
}

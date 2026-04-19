//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
           DBConnection obj = DBConnection.getInstance();
            System.out.println("Thread: " + Thread.currentThread().getName() + " : " + obj);
        });

        Thread t2  = new Thread(()->{
           DBConnection obj = DBConnection.getInstance();
            System.out.println("Thread: " + Thread.currentThread().getName() + " : " + obj);
        });

        t1.start();
        t2.start();

//        Now synchronized, hence thread-safe
//        But Suppose 1000 concurrent threads are there, only 1st one creates object
//        from 2nd thread onwards, it will use the lock even after object is created -> repeated locking
//        hence expensive
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*DBConnection obj = DBConnection.getInstance();
        DBConnection obj2 = DBConnection.getInstance();
        System.out.println(obj == obj2);*/

        Thread t1 = new Thread(() -> {
            DBConnection obj = DBConnection.getInstance();
            System.out.println("Thread: " + Thread.currentThread().getName() + " : " + obj);
        });
        Thread t2 = new Thread(() -> {
            DBConnection obj = DBConnection.getInstance();
            System.out.println("Thread: " + Thread.currentThread().getName() + " : " + obj);
        });
        t1.start();
        t2.start();

//        Lazy initialization is not thread safe.
    }
}
package Singleton_Design_Pattern;

public class Client {
    public static void main(String[] args) {
       Runnable task =()->{
           DbConnection dbConnection = DbConnection.getInstance();
           System.out.println(Thread.currentThread().getName() + " - " + dbConnection);
       };

       Thread thread1 = new Thread(task);
       Thread thread2 = new Thread(task);
       Thread thread3 = new Thread(task);

       thread1.start();
       thread2.start();
       thread3.start();

    }
}

package Singleton_Design_Pattern;

public class Client {
    public static void main(String[] args) {
       Runnable task =()->{
           DbConnection dbConnection = DbConnection.getInstance();
           System.out.println(Thread.currentThread().getName() + " - " + dbConnection);
       };

       for(int i=0; i<5; i++){
           Thread thread = new Thread(task);
           thread.start();
       }

    }
}

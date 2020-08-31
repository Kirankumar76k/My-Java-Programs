
package Multithreading;

public class ThreadMethods extends Thread {
    public void run()
    {
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadMethods obj=new ThreadMethods();
        obj.start();
    }
}

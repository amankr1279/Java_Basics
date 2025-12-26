public class Main {
    public static void main(String[] args) {
        System.out.println("Thread demonstration");

        // Thread implementation using Runnable interface
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);

        // Thread implementation using Thread class
        MyAnotherThread anotherThread = new MyAnotherThread();
        thread.start();
        anotherThread.start();
    }
}
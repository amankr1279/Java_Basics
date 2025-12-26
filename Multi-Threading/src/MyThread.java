public class MyThread implements Runnable{

    @Override
    public void run() {
        // task for thread
        for (int i = 1; i <= 10; i++) {
            System.out.println(STR."Value of i = \{i}");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

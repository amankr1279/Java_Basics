public class MyAnotherThread extends Thread{

    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(STR."Value of j = \{i}");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

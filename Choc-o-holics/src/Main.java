import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chocolate factory for Singleton demo");

        /**
         * in the logs, the hashcode for every instance of Chocolate boiler
         * is the same, indicating Singleton framework.
         */

        try {
            ExecutorService service = Executors.newFixedThreadPool(10);
            for (int i = 0; i < 10; i++) {
                Runnable task = () -> {
                    ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
                    chocolateBoiler.fill();
                    chocolateBoiler.boil();
                    chocolateBoiler.drain();
                };
                service.submit(task);
            }

            service.shutdown();
            boolean isTerminated = service.awaitTermination(100, TimeUnit.MILLISECONDS);
            if (!isTerminated ) {
                service.shutdownNow();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Another way of keeping things Singleton
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        System.out.println(singleton);
    }
}
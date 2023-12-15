package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrencyTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        Runnable task1 = () -> {
            for (int i = 0; i < 2; i++) {
                System.out.println("Task1 - Iniciando iteração " + (i + 1));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task1 - Concluindo iteração " + (i + 1));
            }
            System.out.println(Thread.currentThread().getName() + " - Task1 - Concluída");
        };

        try {
            service = Executors.newFixedThreadPool(2);
            service.submit(task1);
            service.submit(task1);
            service.submit(task1);
        } finally {
            if (service != null)
                service.shutdown();
        }
        service.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Finished");
    }
}


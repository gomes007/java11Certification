package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Ex01 {

    public static void main(String[] args) {
        AtomicInteger x = new AtomicInteger();

        Runnable incrementTask = () -> {
            for (int i = 0; i < 10000; i++) {
                x.getAndIncrement();
            }
            System.out.println(x);
        };

        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        thread1.start();
        thread2.start();

        // Qual é o valor de 'x' após a execução das threads?
        // A) 10000
        // B) 20000
        // C) Um valor imprevisível
        // D) 0
    }

}

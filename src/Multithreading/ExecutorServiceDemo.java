package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.currentThread;

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        ExecutorService ses = Executors.newSingleThreadExecutor();
        Runnable task1 = () -> System.out.println("Running task1..." + currentThread().getName() );
        Runnable task2 = () -> System.out.println("Running task2..." + currentThread().getName());

        ses.execute(task1);
        //it will execute task1, but after that executor is shut down, can't be called again so give error
        ses.shutdown();
        ses.execute(task2);
    }

}

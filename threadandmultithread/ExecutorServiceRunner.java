package threadandmultithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new ThreadBasicRunner.Task1());
        executorService.execute(new Thread(new ThreadBasicRunner.Task2()));

        executorService.shutdown();

    }
}

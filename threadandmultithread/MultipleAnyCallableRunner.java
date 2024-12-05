package threadandmultithread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask> tasks = List.of(new CallableTask("Aameen"),new CallableTask("Hussain"),
                new CallableTask("Khan"));
        String result = executorService.invokeAny(tasks);
        System.out.println(result);
        executorService.shutdown();
    }
}

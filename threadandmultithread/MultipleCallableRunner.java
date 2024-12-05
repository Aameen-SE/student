package threadandmultithread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask> tasks = List.of(new CallableTask("Hussain"),new CallableTask("Khan")
                            , new CallableTask("Adil"));
       List< Future<String>> results = executorService.invokeAll(tasks);

       for(Future<String> res : results){
           System.out.println(res.get());
       }
        executorService.shutdown();
    }
}

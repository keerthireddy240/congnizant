import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create a list to hold Future objects
        List<Future<String>> futures = new ArrayList<>();

        // Submit 5 Callable tasks
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            Callable<String> task = () -> {
                // Simulate some work with sleep
                Thread.sleep(1000);
                return "Task " + taskId + " completed.";
            };
            futures.add(executor.submit(task));
        }

        // Retrieve and print results
        for (Future<String> future : futures) {
            String result = future.get();  // blocks until result is available
            System.out.println(result);
        }

        // Shutdown executor service
        executor.shutdown();
    }
}

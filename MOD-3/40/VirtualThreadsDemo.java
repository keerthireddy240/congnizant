public class VirtualThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        final int numThreads = 100_000;

        System.out.println("Starting " + numThreads + " virtual threads...");

        long start = System.currentTimeMillis();

        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int threadNum = i;
            threads[i] = Thread.startVirtualThread(() -> {
                // Each virtual thread prints a message
                System.out.println("Hello from virtual thread " + threadNum);
            });
        }

        // Wait for all threads to complete
        for (Thread t : threads) {
            t.join();
        }

        long end = System.currentTimeMillis();
        System.out.println("Completed in " + (end - start) + " ms");
    }
}

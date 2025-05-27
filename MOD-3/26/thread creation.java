// Define a class that implements Runnable
class MessagePrinter implements Runnable {
    private String message;

    // Constructor
    public MessagePrinter(String message) {
        this.message = message;
    }

    // The run method prints the message multiple times
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message + " (" + i + ")");
            try {
                Thread.sleep(500); // Sleep to simulate delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Create Runnable instances
        Runnable task1 = new MessagePrinter("Hello from Thread 1");
        Runnable task2 = new MessagePrinter("Hello from Thread 2");

        // Create Thread objects
        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

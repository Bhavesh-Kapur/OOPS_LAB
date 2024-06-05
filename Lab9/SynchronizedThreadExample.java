public class SynchronizedThreadExample {
    private static int counter = 0;

    public static void main(String[] args) {
        // Create and start 10 threads
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new CounterIncrementer());
            thread.start();
        }

        // Wait for all threads to finish
        try {
            Thread.sleep(1000); // Adjust the time based on your needs
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final value of the counter
        System.out.println("Final counter value: " + counter);
    }

    // Runnable class that increments the counter in a synchronized manner
    static class CounterIncrementer implements Runnable {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                incrementCounter();
            }
        }

        private synchronized void incrementCounter() {
            counter++;
        }
    }
}

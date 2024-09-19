class Cookies{
    private int id;  // Unique identifier for each Cook

    // Constructor to initialize the Cook instance with a unique ID
    public Cook(int id) {
        this.id = id;
    }

    // Method to simulate marinating for 2 seconds
    public void marinate() {
        try {
            Thread.sleep(2000);  // Simulating time for marination
            System.out.println("Cook " + id + " finished marinating.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to simulate cooking for 4 seconds
    public void cook() {
        try {
            Thread.sleep(4000);  // Simulating time for cooking
            System.out.println("Cook " + id + " finished cooking.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to simulate serving for 1 second
    public void serve() {
        try {
            Thread.sleep(1000);  // Simulating time for serving
            System.out.println("Cook " + id + " finished serving.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Overridden run method where all the steps are performed in order
    @Override
    public void run() {
        marinate();
        cook();
        serve();
    }

    public static void main(String[] args) {
        // Simulating user input
        int numberOfCooks = 0;  // Example input: 2

        // List to keep track of Cook threads
        List<Cook> cooks = new ArrayList<>();

        // Creating and starting Cook threads
        for (int i = 1; i <= numberOfCooks; i++) {
            Cook cook = new Cook(i);
            cooks.add(cook);
            cook.start();  // Starting each thread
        }

        // Ensuring all threads have finished before printing the final message
        for (Cook cook : cooks) {
            try {
                cook.join();  // Wait for the thread to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print final message after all threads have completed their tasks
        System.out.println("All cooks have finished their tasks.");
    }
}
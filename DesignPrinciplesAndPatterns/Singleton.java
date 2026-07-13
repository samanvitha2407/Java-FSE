package DesignPrinciplesAndPatterns;

public class Singleton {

    // Private constructor prevents instantiation from other classes
    private Singleton() {
        System.out.println("Database Connection Manager Initialized.");
    }

    // Static inner class responsible for holding the singleton instance
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Global access point
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }

    // Optional: You can add a main method right here to test it
    public static void main(String[] args) {
        Singleton db = Singleton.getInstance();
        db.executeQuery("SELECT * FROM users");
    }
}
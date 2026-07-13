package SingletonPatternExample;

public class SingletonTest {
    public static void main(String[] args) {
        // Retrieve the single instance of Logger
        Logger logger1 = Logger.getInstance();
        logger1.log("Testing first log reference.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Testing second log reference.");

        // Verify that only one instance is created and used
        if (logger1 == logger2) {
            System.out.println("Verification Success: Both logger instances are identical.");
        } else {
            System.out.println("Verification Failure: Multiple instances exist.");
        }
    }
}
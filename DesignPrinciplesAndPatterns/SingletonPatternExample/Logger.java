package SingletonPatternExample;

public class Logger {
    // Private static instance of itself
    private static Logger instance;

    // Ensure the constructor of Logger is private
    private Logger() {
        System.out.println("Logger Instance Created.");
    }

    // Public static method to get the instance of the Logger class
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
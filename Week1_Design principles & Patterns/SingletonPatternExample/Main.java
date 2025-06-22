import SingletonPatternExample.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Kinshuk Ganguly's first log message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Kinshuk Ganguly's first log message");

        if (logger1 == logger2) {
            System.out.println("Logger instances found to be same");
        } else {
            System.out.println("Logger instances found to be different");
        }
    }
}

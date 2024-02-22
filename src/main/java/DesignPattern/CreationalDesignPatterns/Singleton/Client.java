package DesignPattern.CreationalDesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        LoggerService logger = LoggerService.getLogger();
        LoggerService logger2 = LoggerService.getLogger();
        System.out.println(logger2==logger);
        logger.log("Hello World!");

    }
}

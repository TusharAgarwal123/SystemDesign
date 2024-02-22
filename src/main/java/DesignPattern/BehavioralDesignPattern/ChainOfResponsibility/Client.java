package DesignPattern.BehavioralDesignPattern.ChainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(3,"Exception happens");
        logger.log(2,"Need to debug this");
        logger.log(1,"Just log this");

    }
}

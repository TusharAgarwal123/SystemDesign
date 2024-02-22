package DesignPattern.CreationalDesignPatterns.Singleton;

public class LoggerService {

    private static LoggerService logger = null;

    private LoggerService(){}

    synchronized public static LoggerService getLogger(){
        if(logger == null){
            logger = new LoggerService();
        }

        return logger;
    }
    public void log(String message) {
        System.out.println(message);
    }

}

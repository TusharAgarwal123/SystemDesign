package DesignPattern.BehavioralDesignPattern.ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int level, String message){
        if(level==3){
            System.out.println("ERROR: "+message);
        }else{
            super.log(level,message);
        }
    }
}

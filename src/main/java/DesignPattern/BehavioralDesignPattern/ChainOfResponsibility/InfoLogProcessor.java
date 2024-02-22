package DesignPattern.BehavioralDesignPattern.ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int level, String message){
        if(level==1){
            System.out.println("INFO: "+message);
        }else{
            super.log(level,message);
        }
    }
}

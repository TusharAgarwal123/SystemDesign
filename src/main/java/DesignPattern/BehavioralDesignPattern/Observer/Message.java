package DesignPattern.BehavioralDesignPattern.Observer;

public class Message {

    private String message;

    Message(String message){
        this.message = message;
    }

    String getMessage(){
        return this.message;
    }
}

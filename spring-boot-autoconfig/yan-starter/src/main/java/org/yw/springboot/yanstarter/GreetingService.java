package org.yw.springboot.yanstarter;

public class GreetingService {


    private String message;

    private boolean display = true;

    public String sayHello()
    {
        return display ? "Hello，" + message : "Hidden";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }
}

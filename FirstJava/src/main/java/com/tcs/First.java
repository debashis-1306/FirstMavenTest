package main.java.com.tcs;

public class First
{

    private final String message = "Welcome to TCS iON RIO Projects";

    public First() {}

   private final String getMessage() {
        return message;
    }


    public static void main(String[] args) {
        System.out.println(new Test().getMessage());
    }

    
}

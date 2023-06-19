package Review12;

public class InsufficientBalance extends RuntimeException{
//custom exceptions that we create our ownselves. We always have to create a class of the exception
    public InsufficientBalance(String Message){
        super(Message);
        //to create your own exception you will have to make a class with that exception and then extend it
        // with any exception and create a matching contructor.

    }

}

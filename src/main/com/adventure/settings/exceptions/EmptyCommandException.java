package main.com.adventure.settings.exceptions;

public class EmptyCommandException extends Exception {

    public EmptyCommandException() {
        super("You did not enter a command.\n");
    }

    public EmptyCommandException(String message) {
        super(message);
    }

}

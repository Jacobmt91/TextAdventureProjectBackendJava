package main.com.adventure.settings.exceptions;

public class InvalidCommandException extends Exception {

    public InvalidCommandException() {
        super("That entry was invalid.\n");
    }

    public InvalidCommandException(String message) {
        super(message);
    }
}

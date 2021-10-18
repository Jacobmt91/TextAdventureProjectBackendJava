package main.com.adventure.settings;

import main.com.adventure.settings.exceptions.EmptyCommandException;
import main.com.adventure.settings.exceptions.InvalidCommandException;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;

    /**
     * Takes a users input and determines which verb to include in the command.
     *
     * @param verbString - the users input.
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) throws EmptyCommandException, InvalidCommandException {
        if (verbString == null || verbString.isEmpty() || verbString.trim().isEmpty()) {
            throw new EmptyCommandException();
        } else if (!(validVerbBool(verbString))) {
            throw new InvalidCommandException();
        } else {
            return CommandVerb.valueOf(verbString.toUpperCase());
        }
    }

    /**
     * Checks if string input matches an enum name value.
     * @param input - input to check
     * @return - a boolean that represents if input is valid
     */
    public static boolean validVerbBool(String input) {
        for ( CommandVerb verb : CommandVerb.values()) {
            if (verb.name().equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }

}
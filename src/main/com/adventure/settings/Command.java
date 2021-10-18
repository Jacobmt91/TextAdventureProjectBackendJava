package main.com.adventure.settings;

import main.com.adventure.settings.exceptions.EmptyCommandException;
import main.com.adventure.settings.exceptions.InvalidCommandException;

public class Command {

    public static final String TAKE = "take";
    public static final String MOVE = "move";
    public static final String USE = "use";
    public static final String DIG = "dig";
    public static final String EXAMINE = "examine";
    public static final String LOOK = "look";
    public static final String INVENTORY = "check items";
    public static final String FIGHT = "fight";
    public static final String HELP = "help";

    private CommandVerb verb;
    private String objectName;

    /**
     * Creates a command.
     * @param verb - the verb of the command
     * @param objectName - the object(s) to which the command is directed.
     */
    public Command(CommandVerb verb, String objectName) {
        this.verb = verb;
        this.objectName = objectName;
    }

    /**
     * Creates a command with no direct object (e.g. "help").
     * @param verb - the verb of the command
     */
    public Command(CommandVerb verb) {
        this.verb = verb;
        this.objectName = "";
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public CommandVerb getVerb() {
        return this.verb;
    }

    public void setVerb(String newVerb) {
        try {
            this.verb = CommandVerb.getVerb(newVerb);
        } catch (EmptyCommandException | InvalidCommandException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Command{" +
                "verb='" + verb + '\'' +
                ", objectName='" + objectName + '\'' +
                '}';
    }
}

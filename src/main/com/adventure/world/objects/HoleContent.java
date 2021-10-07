package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {

    private Key content;
    private boolean isCovered;

    /**
     * Default constructor.
     */
    public HoleContent() {}

    /**
     * Constructor to pass Key object.
     * @param content - a Key object
     */
    public HoleContent(Key content) {
        this.content = content;
        this.isCovered = true;
    }

    public void setCovered(boolean covered) {
        isCovered = covered;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public Key getKey() {
        return content;
    }

}

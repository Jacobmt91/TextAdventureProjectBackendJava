package main.com.adventure.world.objects.holes;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private Key content;
    private boolean isCovered = true;

    /**
     * Default constructor.
     */
    public HoleContent() {
    }

    /**
     * Creates a holes given content.
     * @param key - Saves a Key object to content
     */
    public HoleContent(Key key) {
        this.content = key;
    }

    public void setCovered(boolean covered) {
        this.isCovered = covered;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public Key getKey() {
        return content;
    }
}

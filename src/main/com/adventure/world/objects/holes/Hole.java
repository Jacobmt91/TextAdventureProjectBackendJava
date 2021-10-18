package main.com.adventure.world.objects.holes;

import main.com.adventure.world.objects.Tangible;
import main.com.adventure.world.objects.keys.Key;

public class Hole {
    private HoleContent content;

    /**
     * Creates a hole with the given content.
     * @param content - the item that is covered by the hole.
     */
    public Hole(Key content) {
        this.content = new HoleContent(content);
    }

    /**
     * Uncovers the hole. If applicable, the contents are now revealed.
     */
    public void dig() {
        if (content.isCovered()) {
            content.setCovered(false);
        }
    }

    public boolean isCovered() {
        return content.isCovered();
    }

    /**
     * if the HoleContent is uncovered, return the content. Otherwise, return null.
     * @return - the content if the hole is uncovered.
     */
    public Tangible getContent() {
        if (!content.isCovered()) {
            return content.getKey();
        }
        return null;
    }
}

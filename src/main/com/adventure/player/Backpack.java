package main.com.adventure.player;

import main.com.adventure.world.objects.Tangible;

/**
 * Stores any Tangible item up to the MAX_CAPACITY.
 */
public class Backpack {

    private static final int MAX_CAPACITY = 5;

    private final Tangible[] items = new Tangible[MAX_CAPACITY];

    /**
     * Sorts a Tangible array with null elements first.
     */
    private void nullFirstSort(Tangible[] array) {
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            if (array[i] != null) {
                items[i] = array[i];
            } else {
                items[j] = array[i];
                j++;
            }
        }
    }

    /**
     * Shift every index in the array by 1 to the left
     */
    private void arrayShift() {
        if (items[0] == null){
            for (int i = 1; i < items.length; i++) {
                items[i - 1] = items[i];
            }
            items[items.length - 1] = null;
        }

    }

    /**
     * Add an item to the end of the backpack array and only if there's enough room in the backpack.
     * @param item - item to add to the backpack array.
     * @return - true if the item is added. Otherwise, false.
     */
    public boolean addItem(Tangible item) {
//        TODO Complete the function
        arrayShift();
        if (items[MAX_CAPACITY-1] == null) {
            items[MAX_CAPACITY-1] = item;
        }
        return item == items[MAX_CAPACITY-1];
    }

    /**
     * Checks each backpack item's name to see if it matches the given name.
     * @param name - the name of the item to search for.
     * @return - the item if it exists. Otherwise, null.
     */
    public Tangible getItem(String name) {
        //TODO Complete the function
        for (Tangible item : items) {
            if (item != null) {
                if (name.equalsIgnoreCase(item.getName())) {
                    return item;
                }
            }
        }
        return null;
    }

    /**
     * Checks if the given item exists in the backpack and removes it if it is.
     * @param item - item to remove
     * @return - true if the item was removed. Otherwise, false.
     */
    public boolean removeItem(Tangible item) {
        //TODO Complete the function
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                items[i] = null;
                nullFirstSort(items);
                return true;
            }
        }
        return false;
    }

    /**
     * Prints the contents of the backpack. Before printing the contents, the following line should
     * be printed:
     *
     *          "Here are the items in your backpack:"
     *
     * Then each item should be printed with " - " before it.
     */
    public void printItems() {
        //TODO Complete the function
        System.out.println("Here are the items in your backpack: ");
        for (Tangible item : items) {
            try {
                System.out.printf(" - %s\n", item.getName());
            } catch (NullPointerException e) {
                System.out.printf(" - %s\n", item);
            }
        }
    }
}


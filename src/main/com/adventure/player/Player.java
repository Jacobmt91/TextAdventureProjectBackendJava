package main.com.adventure.player;

import main.com.adventure.settings.AppSettings;
import main.com.adventure.world.objects.Tangible;
import main.com.adventure.world.objects.Weapon;

public class Player {

    public int level = 5;
    //TODO Add name variable here
    private String name = "";
    private int currentLocationIndex = AppSettings.getStartingLocation();
    private int power = 1;
    private int health = 10;
    private Backpack backpack = new Backpack();;

    /**
     * Sprint 2 Module 1
     * Saves the player's name. This file should store the name so it can be referenced later. After setting the name,
     * inform the user that the name has been changed by saying "Your name is now {name}".
     * Initialize backpack.
     * @param newName - the player's name that will be saved
     */
    public void setName(String newName) {
        name = newName;
        System.out.printf("Your name is now %s\n", name);
    }

    /**
     * Sprint 2 Module 1
     * Retrieves the name of this player. The name of the player should be stored in this file, so we should reference
     * that value here.
     * @return The name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Sprint 2 Module 1
     * The canOpenDoor is calculated by taking the player's level and dividing it by 2. If the result is greater than
     * 2, theplayer can open doors.
     * @return true if the player's level is enough to open the door.
     */
    public boolean canOpenDoor() {
        return (double) level / 2 > 2;
    }

    /**
     * Sprint 2 Module 2
     * The move function will take two parameters: a direction and a list of possible directions. It will be up to this
     * function to determine if the direction is valid. If it is, the currentLocationIndex will increment (EAST) or
     * decrement (WEST) based on the direction. If the direction is invalid for any reason, the program should print
     * "{DIRECTION} is not a valid direction" to the console.
     *
     * You should also return true if the move is executed. Otherwise, return false.
     *
     * @param direction - the direction the player wishes to go
     * @param isValid - the possible directions
     * @return true if the move is executed. Otherwise, false.
     */
    public boolean move(String direction, boolean isValid) {
        if (direction.equalsIgnoreCase("east") && isValid) {
            currentLocationIndex++;
        } else if (direction.equalsIgnoreCase("west") && isValid) {
            currentLocationIndex--;
        } else {
            System.out.printf("%s is not a valid direction\n", direction);
            return false;
        }
        return true;
    }

    /**
     * Sprint 3 Module 2
     * Will increase the players power based on the item that is passed in.
     * @param item - the weapon that will be used to adjust the player's power.
     */
    public void setWeapon(Weapon item) {
        //TODO Complete this function in Sprint 3 Module 2
        power += item.getPower();
    }

    /**
     * Sprint 3 Module 3
     * Retrieves the item in the backpack.
     * @param itemName - the name af the item, given by the user
     * @return the item or null if the item does not exist
     */
    public Tangible getItem(String itemName) {
        //TODO Complete this function in Sprint 3 Module 3
        return backpack.getItem(itemName);
    }

    /**
     * Sprint 3 Module 3
     * Removes the item from the backpack and returns that item.
     * @param item - the item you want to remove
     * @return the removed item
     */
    public boolean removeItem(Tangible item) {
        //TODO Complete this function in Sprint 3 Module 3
        return backpack.removeItem(item);
    }

    /**
     * Sprint 3 Module 3
     * Prints the inventory.
     */
    public void printItems() {
        //TODO Complete this function in Sprint 3 Module 3
        backpack.printItems();
    }

    /**
     * Sprint 3 Module 3
     * Stores an item into the backpack.
     * @param item - item to add.
     */
    public void addItem(Tangible item) {
        //TODO Complete this function
        backpack.addItem(item);
    }

    public void setKey(Tangible item) {
        addItem(item);
    }

    public Tangible getKey() {
        return backpack.getItem("key");
    }

    public void setShovel(Tangible item) {
        addItem(item);
    }

    public Tangible getShovel() {
        return backpack.getItem("shovel");
    }

    //////// DON'T CHANGE THE CODE BELOW. ///////////

    public int getCurrentLocation() {
        return currentLocationIndex;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }
}

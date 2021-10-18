package main.com.adventure;

import main.com.adventure.player.Player;
import main.com.adventure.world.Monster;

public class CombatController {

    private Player player;
    private Monster monster;

    /**
     * Processes a combat situation between the player and a monster.
     * @param player - the game's player.
     * @param monster - the monster who the player is trying to defeat.
     */
    public CombatController(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    /**
     * Runs through the combat of the player and monster until either the monster's
     * or the player's health is 0. The player always goes first.
     */
    public void autosimulateCombat() {
        // Loop runs until either player or monster health reaches 0
        while (player.getHealth() > 0 && monster.getHealth() > 0) {

            // Calculates the players and monsters attacks
            int playerAttack = monster.getHealth() - player.getPower();
            int monsterAttack = player.getHealth() - monster.getPower();

            // Sets the health value for player and monster if health is above 0
            monster.setHealth(playerAttack);
            if (monster.getHealth() > 0) {
                player.setHealth(monsterAttack);
            }
        }
    }

    public boolean isPlayerDefeated() {
        // Returns true if players health is 0 or less
        return player.getHealth() <= 0;
    }

    /**
     * Resets the health of the monster and player back to 10.
     */
    public void reset() {
        player.setHealth(10);
        monster.setHealth(10);
    }
}

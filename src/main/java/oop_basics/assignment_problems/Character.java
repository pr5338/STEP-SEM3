package oop_basics.assignment_problems;
public class Character {
    private final int maxHealth;
    private int currentHealth;

    // Constructor to set maximum health and initialize current health
    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    // Method to apply damage (health cannot fall below 0)
    public void takeDamage(int amount) {
        if (amount > 0) {
            this.currentHealth = Math.max(0, this.currentHealth - amount);
        }
    }

    // Method to apply healing (health cannot exceed maxHealth)
    public void heal(int amount) {
        if (amount > 0) {
            this.currentHealth = Math.min(this.maxHealth, this.currentHealth + amount);
        }
    }

    // Read-only getter for current health
    public int getHealth() {
        return this.currentHealth;
    }

    // Read-only getter for max health
    public int getMaxHealth() {
        return this.maxHealth;
    }
}

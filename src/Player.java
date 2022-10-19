/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
 * Assignment: Monopoly, Player Class
 * Date due: 10/26
 */

// By Arjun

public class Player {
    int balance;
    BoardSpace properties[];
    char icon;
    boolean inJail;

    public Player(int balance, BoardSpace[] properties, char icon, boolean inJail) {
        this.balance = balance;
        this.properties = properties;
        this.icon = icon;
        this.inJail = inJail;
    }

    public boolean isInJail() {
        return inJail;
    }

    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BoardSpace[] getProperties() {
        return properties;
    }

    public void setProperties(BoardSpace[] properties) {
        this.properties = properties;
    }

    public char getIcon() {
        return icon;
    }

    public void setIcon(char icon) {
        this.icon = icon;
    }
}

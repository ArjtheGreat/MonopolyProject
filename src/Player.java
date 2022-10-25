import java.util.ArrayList;
import java.util.Properties;

/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
 * Assignment: Monopoly, Player Class
 * Date due: 10/26
 */

// By Arjun

public class Player {
    int balance;
    ArrayList<BoardSpace> properties;
    char icon;
    boolean inJail;
    int currentSpace;

    public Player(int balance, ArrayList<BoardSpace> properties, char icon, boolean inJail) {
        this.balance = balance;
        this.properties = properties;
        this.icon = icon;
        this.inJail = inJail;
    }

    public int getCurrentSpace() {
        return currentSpace;
    }

    public void setCurrentSpace(int currentSpace) {
        this.currentSpace = currentSpace;
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

    public ArrayList<BoardSpace> getProperties() {
        return properties;
    }

    public void addProperty(BoardSpace property) {
        properties.add(property);
    }

    public char getIcon() {
        return icon;
    }

    public void setIcon(char icon) {
        this.icon = icon;
    }

    public String toString() {
        return icon + "";
    }
}

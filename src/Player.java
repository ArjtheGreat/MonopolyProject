import java.util.ArrayList;
import java.util.Properties;

/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
 * Assignment: Monopoly, Player Class
 * Date due: 10/26
 */

// By Maitra
public class Player {
    int balance;
    ArrayList<BoardSpace> properties;
    char icon;
    boolean inJail;
    int currentSpace;

    String colorName = "\u001B[37m";


    // Constructor
    public Player(int balance, ArrayList<BoardSpace> properties, char icon, boolean inJail, String color) {
        this.balance = balance;
        this.properties = properties;
        this.icon = icon;
        this.inJail = inJail;
        this.colorName = color;
    }

    // Various Accessors and Mutators
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

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    // Prints out the icon as a String
    public String toString() {
        return icon + "";
    }
}

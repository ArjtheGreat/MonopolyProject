/*********************
 *
 * Author: Arjun Maitra and Elliott Duke
 * Assignment: Monopoly, BoardSpace Class
 * Date due: 10/26
 */

// By Maitra
public class BoardSpace {
    Player owner;
    int cost;
    int tax;
    String name;
    boolean isPurchasable;
    Player[] currentPlayers;
    String colorStr = "\u001B[37m";
    boolean hasBeenMortgaged;

    // Constructor
    public BoardSpace(Player owner, int cost, int tax, String name, boolean isPurchasable) {
        this.owner = owner;
        this.cost = cost;
        this.tax = tax;
        this.name = name;
        this.isPurchasable = isPurchasable;
        currentPlayers = new Player[6]; //Keeps track of players on the space
        hasBeenMortgaged = false;
    }

    // Accessors and Mutators
    public Player[] getCurrentPlayers() {
        return currentPlayers;
    }

    // Find an open space in the board to add player
    public void addPlayer(Player player) {
        for(int i = 0; i<getCurrentPlayers().length; i++) {
            if(getCurrentPlayers()[i] == null) {
                getCurrentPlayers()[i] = player;
                break;
            }
        }
    }

    public boolean isHasBeenMortgaged() {
        return hasBeenMortgaged;
    }

    public void setHasBeenMortgaged(boolean hasBeenMortgaged) {
        this.hasBeenMortgaged = hasBeenMortgaged;
    }


    public Player getOwner() {
        return owner;
    }
    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTax() {
        return tax;
    }
    public void setTax(int tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isPurchasable() {
        return isPurchasable;
    }
    public void setPurchasable(boolean purchasable) {
        isPurchasable = purchasable;
    }

    public String getColorStr() {
        return colorStr;
    }
    public void setColorStr(String colorStr) {
        this.colorStr = colorStr;
    }

    // Access name of space as a String
    public String toString() {
        return name;
    }


    public String firstTwoChars() {
        return name.substring(0,2);
    }
}

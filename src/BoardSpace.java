/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
 * Assignment: Monopoly, BoardSpace Class
 * Date due: 10/26
 */
public class BoardSpace {
    int cost;
    int tax;
    String name;
    boolean isPurchasable;

    public BoardSpace(int cost, int tax, String name, boolean isPurchasable) {
        this.cost = cost;
        this.tax = tax;
        this.name = name;
        this.isPurchasable = isPurchasable;
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
}

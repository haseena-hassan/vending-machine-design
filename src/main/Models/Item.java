package src.main.Models;

public class Item {
    private ItemType type;
    private int price;

    public Item(ItemType type, int price) {
        this.type = type;
        this.price = price;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}

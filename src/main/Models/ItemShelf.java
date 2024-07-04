package src.main.Models;

public class ItemShelf {
    private int code;
    private Item item;
    private int quantity;
    private boolean outOfStock;

    public ItemShelf(int code, Item item, int quantity, boolean outOfStock) {
        this.code = code;
        this.item = item;
        this.quantity = quantity;
        this.outOfStock = outOfStock;
    }

    public int getCode() {
        return code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        setOutOfStock(quantity > 0);
    }

    public boolean isOutOfStock() {
        return outOfStock;
    }

    private void setOutOfStock(boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    @Override
    public String toString() {
        return "ItemShelf{" +
                "code=" + code +
                ", item=" + item +
                ", quantity=" + quantity +
                ", outOfStock=" + outOfStock +
                '}';
    }
}

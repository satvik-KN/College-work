class ShoppingCart {
    Item[] items;
    int numItems;

    ShoppingCart() {
        items = new Item[10];
        numItems = 0;
    }

    class Item {
        String itemName;
        int quantity;
        double price;

        Item(String itemName, int quantity, double price) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
        }

        double getTotalPrice() {
            return quantity * price;
        }

        void display() {
            System.out.println("Item: " + itemName + ", Quantity: " + quantity + ", Price: " + price + ", Total: " + getTotalPrice());
        }
    }

    void addItem(String itemName, int quantity, double price) {
        if (numItems < items.length) {
            items[numItems++] = new Item(itemName, quantity, price);
        }
    }

    double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < numItems; i++) {
            total += items[i].getTotalPrice();
        }
        return total;
    }

    void displayCart() {
        System.out.println("\n--- Shopping Cart Contents ---");
        for (int i = 0; i < numItems; i++) {
            items[i].display();
        }
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

public class L5q3 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 1, 1200.50);
        cart.addItem("Headphones", 2, 150.75);
        cart.addItem("Mouse", 3, 20.00);
        cart.displayCart();
    }
}

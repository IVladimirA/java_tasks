public class Shirt {
    int shirtId = 0;
    String description = "description";
    char colorCode = 'U';
    double price = 0.0;
    int quantityInStock = 0;
    public Shirt() {}
    public Shirt(int shirtId, String description, char colorCode, double price, int quantity) {
        this.shirtId = shirtId;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
        this.quantityInStock = quantity;
    }
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtId);
        System.out.println("Description: " + description);
        System.out.println("Color code: " + colorCode);
        System.out.println("Price: " + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}

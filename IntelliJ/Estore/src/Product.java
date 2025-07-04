public class Product {

    private String productID;

    private String productName;

    private double price;

    private String description;

    private ProductCategory category;



    public Product(String productID, String productName, double price, String description, ProductCategory category) {

        this.productID = productID;

        this.productName = productName;

        this.price = price;

        this.description = description;

        this.category = category;
    }


}

public class Product {

    //Private variables
    private String ID;
    private String manufacturer;
    private String name;
    private int quantity;
    private double price;
    private String type;
    private String code;


    // product constructor
    public Product(String ID, String manufacturer, String name, int quantity, double price, String type, String code) {
        this.ID = ID;
        this.manufacturer = manufacturer;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.code = code;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID='" + ID + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

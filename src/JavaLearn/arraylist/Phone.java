package JavaLearn.arraylist;

public class Phone {
    String brand;
    int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }
}

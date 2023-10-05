package JavaLearn.learn2;

public class car {
    private String brand;
    private int price;
    public car(){}
    public car(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

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
}

public class Car {
    String name;
    String color;
    int price;
    String volume;

    public Car(String name, String color, int price, String volume) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.volume = volume;
    }
    public Car(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}

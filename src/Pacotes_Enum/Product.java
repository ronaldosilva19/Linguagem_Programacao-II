package Pacotes_Enum;

public class Product {
    private float price;
    private Color color;

    public Product(float price, Color color){
        this.price = price;
        this.color = color;
    }

    public float getPrice(){
        return price;
    }

    public Color getColor(){
        return color;
    }
}

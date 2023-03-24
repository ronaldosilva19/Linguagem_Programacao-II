package Pacotes_Enum;

public class App {

    public static void main(String[] args){
        Product garrafa = new Product(50, Color.BLUE);
        Product guitarra = new Product(100, Color.BLACK);

        System.out.println("Price: " + garrafa.getPrice() + " Color: " + garrafa.getColor());
        System.out.println("Price: " + guitarra.getPrice() + " Color: " + guitarra.getColor());

        Color[] value = Color.values();
        for(Color color : value){
            System.out.println(color);
        }
    }
}

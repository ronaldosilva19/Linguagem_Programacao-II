package Animal.br.ufrn.imd;

public class Mamifero extends Animal{

    public void PesoMamifero(){
        this.peso = 5875.99;
        System.out.println("Peso do Mamifero: " + this.peso + " Kg.");
    }
    public void Locomover(){
        System.out.println("Mamifero...");
    }

    public void Comer(){
        System.out.println("Comendo...");
    }
}

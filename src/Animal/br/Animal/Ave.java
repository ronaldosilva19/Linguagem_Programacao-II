package Animal.br.Animal;

public class Ave extends Animal{

    public void PesoAve(){
        this.peso = 55.7;
        System.out.println("Peso da Ave: " + this.peso + " Kg.");
    }
    public void Locomover(){
        System.out.println("Ave...");
    }

    public void Voar(){
        System.out.println("Voando...");
    }
}

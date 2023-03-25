package Animal.br.ufrn.imd;

public class Reptil extends Animal{

    public void PesoReptil(){
        this.peso = 2764;
        System.out.println("Peso do Reptil " + this.peso + " Kg.");
    }
    public void Locomover(){
        System.out.println("Reptil...");
    }
    public void Nadar(){
        System.out.println("Nadando...");
    }
}

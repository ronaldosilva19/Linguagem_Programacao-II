package Animal.br.Animal;

public class App {
    public static void main(String[] args) {
        Mamifero animal = new Mamifero();
        Ave animal1 = new Ave();
        Reptil animal2 = new Reptil();

        animal.Locomover();
        animal.Comer();
        animal.PesoMamifero();

        animal1.Locomover();
        animal1.Voar();
        animal1.PesoAve();

        animal2.Locomover();
        animal2.Nadar();
        animal2.PesoReptil();
    }
}

package br.ufrn.imd.Abstract;

public class Bicicleta extends Veiculo{

    public Bicicleta(){
        System.out.println("Bicicleta...");
    }
    @Override
    public void CheckList() {
        System.out.println("Bicicleta.checklist");
    }

    @Override
    public void Adjust() {
        System.out.println("Bicicleta.adjust");
    }

    @Override
    public void CleanUp(){
        System.out.println("Bicicleta.CleanUp");
    }
}

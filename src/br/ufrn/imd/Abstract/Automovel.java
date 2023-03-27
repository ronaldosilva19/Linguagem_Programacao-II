package br.ufrn.imd.Abstract;

public class Automovel extends Veiculo{

    public Automovel(){
        System.out.println("Automovel...");
    }
    @Override
    public void CheckList() {
        System.out.println("Automovel.CheckList");
    }

    @Override
    public void Adjust() {
        System.out.println("Automovel.Adjust");
    }

    @Override
    public void CleanUp() {
        System.out.println("Automovel.CleanUp");
    }
}

package br.ufrn.imd.Abstract;

public abstract class Veiculo {
    public Veiculo(){
        System.out.println("Veiculo...");
    }
    public abstract void CheckList();
    public abstract void Adjust();
    public abstract void CleanUp();
}

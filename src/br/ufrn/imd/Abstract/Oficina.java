package br.ufrn.imd.Abstract;

public class Oficina {
    public Veiculo Proximo(){
        int code = (int) (Math.random() * 1000);
        if(code % 2 == 0){
            return new Bicicleta();
        }else{
            return new Automovel();
        }
    }

    public void Manter(Veiculo veiculo){
        veiculo.CheckList();
        veiculo.Adjust();
        veiculo.CleanUp();
    }
    public static void main(String[] args){
        Oficina oficina = new Oficina();
        for(int i = 0; i < 10; i++){
            Veiculo veiculo = oficina.Proximo();
            oficina.Manter(veiculo);
        }
    }
}

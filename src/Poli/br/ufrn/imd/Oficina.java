package Poli.br.ufrn.imd;

public class Oficina {
    public Veiculo Proximo(){
        double code = (Math.random() * 1000);
        if(code >= 0 && code <= 333){
            return new Automovel();
        }else if(code >= 334 && code <= 666){
            return new Bicicleta();
        }else{
            return new Aviao();
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

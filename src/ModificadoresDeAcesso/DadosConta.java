package ModificadoresDeAcesso;

public class DadosConta {
    private double saldo;
    private String cpf;

    DadosConta(double saldo, String cpf){
        this.saldo = saldo;
        this.cpf = cpf;
    }

    public void Dados(){
        System.out.println(this.cpf);
        System.out.println(this.saldo);
    }
}

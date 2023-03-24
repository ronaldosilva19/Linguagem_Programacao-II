package ModificadoresDeAcesso;

public class Main {
    public static void main(String[] args){
        DadosConta dadosConta = new DadosConta(1456.67, "113.875.494-30");
        System.out.println(Main.class.getCanonicalName());

        dadosConta.Dados();
    }
}

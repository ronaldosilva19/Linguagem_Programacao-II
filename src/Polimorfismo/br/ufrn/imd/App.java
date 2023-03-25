package Polimorfismo.br.ufrn.imd;

public class App {
    public static void main(String[] args){
        Operation operation = new Operation();
        operation.Operate(10);
        operation.Operate("Ronaldo");
        operation.Operate(10, 20);
    }
}

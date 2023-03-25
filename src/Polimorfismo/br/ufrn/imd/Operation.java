package Polimorfismo.br.ufrn.imd;

public class Operation {
    public void Operate(int op){
        System.out.println("Operating int..." + op);
    }

    public String Operate(String op){
        System.out.println("Operating String..." + op);
        return op;
    }

    public int Operate(int op1, int op2){
        System.out.println("Operating two arguments int..." + (op1 + op2));
        return op1 + op2;
    }
}

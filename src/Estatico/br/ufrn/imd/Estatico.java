package Estatico.br.ufrn.imd;

public class Estatico {
    // criando metodos estaticos e chamando-os sem instancia-los.

    public static double PI = 3.14;

    public static void Change(){
        PI = Math.random();
    }

    public static void PrintPI(){
        System.out.println(PI);
    }
}

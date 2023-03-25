package Static.br.ufrn.imd;

public class Static {
    public static double PI = 3.14;

    public void Change(){
        PI = Math.random();
    }

    public void PintPI(){
        System.out.println(PI);
    }
}

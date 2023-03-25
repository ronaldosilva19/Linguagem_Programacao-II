package Static.br.ufrn.imd;

public class App {
    public static void main(String[] args){
        Static st1 = new Static();
        Static st2 = new Static();

        st1.PintPI();
        st2.PintPI();

        st1.Change();

        st1.PintPI();
        st2.PintPI();

        st2.Change();

        st1.PintPI();
        st2.PintPI();
    }
}

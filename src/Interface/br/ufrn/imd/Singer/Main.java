package Interface.br.ufrn.imd.Singer;
public class Main {

    public void MakeToSing(Singer singer){
        System.out.println(singer.Sing());
    }

    public void MakeToDance(Dancer dancer){
        System.out.println(dancer.toDance());
    }
    public static void main(String[] args){
       Main m = new Main();
       PolinaGagarina polina = new PolinaGagarina();
       m.MakeToSing(polina);
       m.MakeToDance(polina);
    }
}

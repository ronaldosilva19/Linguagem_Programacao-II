package Interface.br.ufrn.imd.Singer;

public class PolinaGagarina implements Singer, Dancer {
    @Override
    public String Sing(){
        return "Russian Singer!\n";
    }

    @Override
    public void Dance(){
        System.out.println("Dancing like a Polina\n");
    }

    @Override
    public String toDance(){
        return ("Dancing like a Polina Gagarin\n");
    }
}

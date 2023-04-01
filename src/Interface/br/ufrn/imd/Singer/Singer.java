package Interface.br.ufrn.imd.Singer;

public interface Singer {
    String Sing();
    default void Dance(){
        System.out.println("Dancing in a standard way\n");
    }
}

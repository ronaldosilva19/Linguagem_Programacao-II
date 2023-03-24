package Scanner.br.ufrn.imd;

import java.util.Scanner;
public class App {
    public static void main(String[] args){
        int[] array = {10, 5, -6, 11, 4, 89, -100, 67};
        Scanner scannerInput = new Scanner(System.in);
        String value;
        value = scannerInput.nextLine();
        if(value.equals("sim")) {
            SortedVector sortedVector = new SortedVector(array);
            sortedVector.setArray(array);
            sortedVector.getArray();
        }else{
            System.out.println("Finalizando...");
        }
    }
}

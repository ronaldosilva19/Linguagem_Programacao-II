package Scanner.br.ufrn.imd;

public class SortedVector {
    private final int[] array;

    SortedVector(int[] array){
        this.array = array;
    }

    public void getArray(){
        for(int values : array){
            System.out.println(values + " ");
        }
    }

    public void setArray(int[] array){
       int aux;
       for(int i = 0; i < array.length; i++){
           for(int j = i + 1; j < array.length; j++){
               if(array[i] > array[j]){
                   aux = array[i];
                   array[i] = array[j];
                  array[j] = aux;
               }
           }
       }
    }
}

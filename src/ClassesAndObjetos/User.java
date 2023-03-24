package ClassesAndObjetos;

public class User {
    String name;
    String lastName;

   public static void main(String[] args){
       // Criando instancias da classe User.

       User user = new User();
       user.name = "Ronaldo";
       user.lastName = "Silva";

       System.out.println(user.name);
       System.out.println(user.lastName);
   }
}

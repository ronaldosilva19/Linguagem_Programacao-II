package Builder;

public class App {
    public static void main(String[] args){
        Aluno aluno = new AlunoBuilder()
                          .comNome("Ronaldo")
                          .comSobrenome("Silva")
                          .comCpf(1138754943)
                          .comMatricula("202035860")
                          .build();

    }
}

package Builder;

public class AlunoBuilder {
    private Aluno aluno = new Aluno();

    AlunoBuilder comNome(String nome){
        aluno.setNome(nome);
        return this;
    }

    AlunoBuilder comSobrenome(String sobrenome){
        aluno.setSobrenome(sobrenome);
        return this;
    }

    AlunoBuilder comMatricula(String matricula){
        aluno.setMatricula(matricula);
        return this;
    }

    AlunoBuilder comCpf(long cpf){
        aluno.setCpf(cpf);
        return this;
    }

    Aluno build(){
        return aluno;
    }
}

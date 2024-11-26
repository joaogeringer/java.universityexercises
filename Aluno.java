public class Aluno extends Pessoa {
    //Atributos
    private String matricula;
    //Metodos
    public Aluno(String nome, Calendar data_nascimento, long cpf, Endereco endereco) {
        super(nome,data_nascimento, cpf, endereco);
    }
}

//ex herança

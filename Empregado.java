public class Empregado extends Pessoa {
    //Atributos
    protected String matricula;
    private Calendar data_admissao , data_demissao;
    //Metodos
    public Empregado(Sring nome, Calendar data_nascimento, long cpf, Endereco endereco) {
        super(nome, data_nascimento, cpf, endereco);
        this.matricula = gerarMatricula();
        data_admissao = Calendar.getInstance();
    }
    public void demitirEmpregado() {
        data_demissao = Calendar.getInstance();
    }
}

//ex herança

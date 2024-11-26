import java.util.Calendar;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private Long cpf;
    private Endereco endereco;
    //Metodos
    public Pessoa(String nome, Calendar data_nascimento, long cpf, Endereco endereco){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
    }

//Exercicio herança

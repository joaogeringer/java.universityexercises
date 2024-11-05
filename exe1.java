import java.util.Random;
import java.util.random.RandomGenerator;
        // Classe
        public class Pessoa {
        // Atributos
        private String  nome;
        private double codigo_identificador;
        private Random aleatorio;
        //Métodos
        public Pessoa (String nome) {
            aleatorio = new Random();
            this.setNome(nome);
            this.codigo_identificador = aleatorio.nextDouble();
        }
        private void setNome (String nome) {
            this.nome = nome;
        }
        public String getNome () {
            return this.nome;
        }
        public double getCodigo_identificador () {
            return this.codigo_identificador;
        }
        public static void main(String ARGS[]) {
            Pessoa p1 = new Pessoa("Teste A");
            System.out.println("Pessoa 1: "+p1.getNome());
        }
        }

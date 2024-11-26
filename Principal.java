Public class Principal {
    //Atributos
    private static Aluno aluno;
    public static Endereco endereco;
    //Metodo main
    public static void main (String args[]) {
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        endereco = new Endereco();
        endereco.definirPais("Brasil");
        endereco.definirUF("RJ");
    }
}

// ex herança

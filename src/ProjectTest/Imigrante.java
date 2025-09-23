package ProjectTest;

public class Imigrante {
    private String nome;
    private int idade;
    private String nacionalidade;
    private boolean imigranteLegal;

    public Imigrante(String nome, int idade, String nacionalidade, boolean imigranteLegal) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setNacionalidade(nacionalidade);
        this.setImigranteLegal(imigranteLegal);
    }


    public void dialogo() {
        System.out.println("Olá, meu nome é " + nome +
                ", tenho " + idade + " anos " +
                "e sou de " + nacionalidade + ".");
    }


    public boolean verificarLegalidade() {
        return imigranteLegal;
    }


    public void verificarRegras() {
        if (nacionalidade.equalsIgnoreCase("argentino") ||
                nacionalidade.equalsIgnoreCase("mexicano")) {
            System.out.println("ATENÇÃO: Não aceitamos imigrantes da nacionalidade "
                    + nacionalidade.toUpperCase() + ".");
            System.out.println("O imigrante se suicidou com 15 tiros!!!");
            System.exit(1);
        }

        if (idade < 18) {
            System.out.println("ATENÇÃO: O imigrante " + nome + " tem apenas " + idade +
                    " anos. Menores de idade não são aceitos.");
            System.out.println("Fim da imigração");
            System.exit(1);
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public boolean isImigranteLegal() {
        return imigranteLegal;
    }

    public void setImigranteLegal(boolean imigranteLegal) {
        this.imigranteLegal = imigranteLegal;
    }
}

package ProjectTest.Imigrantes;

import ProjectTest.Documentos.Identidade;

public class Imigrante {
    private String nome;
    private int idade;
    private String nacionalidade;
    private boolean imigranteLegal;

    public Imigrante(String nome, int idade, String nacionalidade) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setNacionalidade(nacionalidade);
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

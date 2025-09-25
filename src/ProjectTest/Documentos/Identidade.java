package ProjectTest.Documentos;

import ProjectTest.Imigrantes.Imigrante;

import java.time.LocalDate;

public class Identidade extends Documento{
    private LocalDate dataNascimento;

    public Identidade(String nomeCompleto, LocalDate validade, LocalDate dataNascimento) {
        super(nomeCompleto, validade);
        this.dataNascimento = dataNascimento;
    }


    //Insere o imigrante instanciado. caso a validade não esteja vencida e o nome e a idade coincidam com os ditos, retorna true. Se não, false
    @Override
    public boolean verificarLegalidade(Imigrante dadosImigrante) {
        if(estaValido() && dadosImigrante.getNome().equals(getNomeCompleto()) && dadosImigrante.getIdade() == calcularIdade()){
            return true;
        } else {
            return false;
        }
    }


    //Diminui o ano atual, pelo ano de nascimento presente na identidade, resultando na idade
    public int calcularIdade(){
        return LocalDate.now().getYear() - getDataNascimento().getYear();
    }




    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public void exibirDocumentos() {

    }
}

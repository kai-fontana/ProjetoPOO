package ProjectTest.Documentos;

import ProjectTest.Imigrantes.Imigrante;

import java.time.LocalDate;

public class Identidade extends Documento{
    private LocalDate dataNascimento;

    public Identidade(String nomeCompleto, LocalDate validade, LocalDate dataNascimento) {
        super(nomeCompleto, validade);
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean verificarLegalidade(Imigrante dadosImigrante) {
        if(estaValido() && dadosImigrante.getNome().equals(getNomeCompleto()) && dadosImigrante.getIdade() == calcularIdade()){
            return true;
        } else {
            return false;
        }
    }
    //


    public int calcularIdade(){
        return 2025 - getDataNascimento().getYear();
    }
    //



    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}

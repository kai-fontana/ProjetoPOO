package ProjectTest.Documentos;

import ProjectTest.Imigrantes.Imigrante;

import java.time.LocalDate;

public class Passaporte extends Documento{

    private String numeroDoPassaporte;
    private String paisDeOrigem;

    public Passaporte(String nomeCompleto, LocalDate validade, String numeroDoPassaporte, String paisDeOrigem) {
        super(nomeCompleto, validade);
        this.numeroDoPassaporte = numeroDoPassaporte;
        this.paisDeOrigem = paisDeOrigem;
    }


    @Override
    public boolean verificarLegalidade(Imigrante dadosImigrante) {
        return false;
    }

    public String getNumeroDoPassaporte() {
        return numeroDoPassaporte;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }
}


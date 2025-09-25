package ProjectTest.Documentos;

import ProjectTest.Imigrantes.Imigrante;

import java.time.LocalDate;

public class VistoDeTrabalho extends Documento{

    private String profissao;
    private String empresa;
    private int diasDeTrabalho;


    public VistoDeTrabalho(String nomeCompleto, LocalDate validade, String profissao, String empresa, int diasDeTrabalho) {
        super(nomeCompleto, validade);
        this.profissao = profissao;
        this.empresa = empresa;
        this.diasDeTrabalho = diasDeTrabalho;
    }



    @Override
    public boolean verificarLegalidade(Imigrante dadosImigrante) {
        return false;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getDiasDeTrabalho() {
        return diasDeTrabalho;
    }

    @Override
    public void exibirDocumentos() {

    }
}


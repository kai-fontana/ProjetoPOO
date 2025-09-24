package ProjectTest.Documentos;

import java.time.LocalDate;

public class VistoDeTrabalho extends Documento{

    private String profissao;
    private String empresa;
    private int diasDeTrabalho;

    public VistoDeTrabalho(String nome, LocalDate dataNascimento, LocalDate validade, String profissao, String empresa, int diasDeTrabalho ){

        super(nome, dataNascimento, validade);
        this.profissao = profissao;
        this.empresa = empresa;
        this.diasDeTrabalho = diasDeTrabalho;
    }
    @Override
    public boolean estaValido() {
        return !LocalDate.now().isAfter(this.getValidade());
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
}


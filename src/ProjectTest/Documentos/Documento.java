package ProjectTest.Documentos;

import ProjectTest.Imigrantes.Imigrante;

import java.time.LocalDate;

public abstract class Documento {
    private String nomeCompleto;
    private LocalDate validade;
    //2025-05-20

    public Documento(String nomeCompleto, LocalDate validade) {
        this.nomeCompleto = nomeCompleto;
        this.validade = validade;
    }


    public boolean estaValido(){
        LocalDate hoje = LocalDate.now();
        //.isBefore significa que tudo que for antes da data de validade é válido.
        if (hoje.isBefore(getValidade())) {
            System.out.println("O documento ainda está válido (vence em " + getValidade() + ").");
            return true;
        }
        //.isEqual significa tudo que for NO DIA da data de validade é válido.
        else if (hoje.isEqual(getValidade())) {
            System.out.println("O documento vence HOJE (" + getValidade() + ").");
            return true;
        }
        //Tudo que passar da data de validade é inválido
        else {
            System.out.println("O documento está EXPIRADO (venceu em " + getValidade() + ").");
            return false;
        }
    }

    public abstract boolean verificarLegalidade(Imigrante dadosImigrante);


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public LocalDate getValidade() {
        return validade;
    }
}
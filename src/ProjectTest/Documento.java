package ProjectTest;

import java.time.LocalDate;

public class Documento {
    private String nomeConstante;
    private LocalDate dataNascimento;
    private LocalDate validade;

    public Documento(String nomeConstante, LocalDate dataNascimento, LocalDate validade) {
        this.nomeConstante = nomeConstante;
        this.dataNascimento = dataNascimento;
        this.validade = validade;
    }


    public boolean estaValido() {
        LocalDate hoje = LocalDate.now();

        //Tudo que for antes da data de validade é válido.
        if (hoje.isBefore(validade)) {
            System.out.println("O documento ainda está válido (vence em " + validade + ").");
            return true;
        }
        //Tudo que for NO DIA da data de validade é válido.
        else if (hoje.isEqual(validade)) {
            System.out.println("O documento vence HOJE (" + validade + ").");
            return true;
        }
        //Tudo que passar da data de validade é inválido
        else {
            System.out.println("O documento está EXPIRADO (venceu em " + validade + ").");
            return false;
        }
    }


    public String getNomeConstante() {
        return nomeConstante;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate getValidade() {
        return validade;
    }
}
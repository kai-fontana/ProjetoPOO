package ProjectTest.Documentos;

import java.time.LocalDate;

public abstract class Documento {
    private String nomeConstante;
    private LocalDate dataNascimento;
    private LocalDate getValidade;

    public Documento(String nomeConstante, LocalDate dataNascimento, LocalDate validade) {
        this.nomeConstante = nomeConstante;
        this.dataNascimento = dataNascimento;
        this.getValidade = validade;
    }

    public Documento() {
    }


    public abstract boolean estaValido();


    public String getNomeConstante() {
        return nomeConstante;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate getValidade() {
        return getValidade;
    }
}
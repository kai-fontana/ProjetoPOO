package ProjectTest.Documentos;

import java.time.LocalDate;

public class Passaporte extends Documento{

    private String numeroDoPassaporte;
    private String paisDeOrigem;

    public Passaporte(String nome, LocalDate dataNascimento, LocalDate validade, String numeroDoPassaporte, String paisDeOrigem){

        super(nome, dataNascimento,validade);

        this.numeroDoPassaporte = numeroDoPassaporte;
        this.paisDeOrigem = paisDeOrigem;
    }

    @Override
    public boolean estaValido() {
        return !LocalDate.now().isAfter(this.getValidade());

    }

    public String getNumeroDoPassaporte() {
        return numeroDoPassaporte;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }
}


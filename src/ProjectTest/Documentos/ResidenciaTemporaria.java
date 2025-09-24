package ProjectTest.Documentos;

import java.time.LocalDate;

public class ResidenciaTemporaria extends Documento{

    private String motivo; // estudos,trabalho,turismo e etc...
    private int diasDeResidencia;

    public ResidenciaTemporaria(String nome, LocalDate dataNascimento, LocalDate validade, String motivo , int diasDeResidencia){
        super(nome,dataNascimento,validade);
        this.motivo = motivo;
        this.diasDeResidencia = diasDeResidencia;
    }
    @Override
    public boolean estaValido() {
        return !LocalDate.now().isAfter(this.getValidade());
    }

    public String getMotivo() {
        return motivo;
    }

    public int getDiasDeResidencia() {
        return diasDeResidencia;
    }
}

package ProjectTest.Documentos;

import ProjectTest.Imigrantes.Imigrante;

import java.time.LocalDate;

public class ResidenciaTemporaria extends Documento{

    private String motivo; // estudos,trabalho,turismo e etc...
    private int diasDeResidencia;

    public ResidenciaTemporaria(String nomeCompleto, LocalDate validade, String motivo, int diasDeResidencia) {
        super(nomeCompleto, validade);
        this.motivo = motivo;
        this.diasDeResidencia = diasDeResidencia;
    }



    @Override
    public boolean verificarLegalidade(Imigrante dadosImigrante) {
        //O máximo de tempo em residência será de 90 dias (pode ser mudado)
        if(diasDeResidencia <= 90){
            return true;
        } else {
            return false;
        }
    }

    public String getMotivo() {
        return motivo;
    }

    public int getDiasDeResidencia() {
        return diasDeResidencia;
    }

    @Override
    public void exibirDocumentos() {

    }
}

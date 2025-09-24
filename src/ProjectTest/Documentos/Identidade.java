package ProjectTest.Documentos;

import java.time.LocalDate;

public class Identidade extends Documento{
    @Override
    public boolean estaValido() {
        LocalDate hoje = LocalDate.now();

        //Tudo que for antes da data de validade é válido.
        if (hoje.isBefore(getValidade())) {
            System.out.println("O documento ainda está válido (vence em " + getValidade() + ").");
            return true;
        }
        //Tudo que for NO DIA da data de validade é válido.
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
}

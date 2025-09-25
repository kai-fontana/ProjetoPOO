package ProjectTest;

import ProjectTest.Documentos.Identidade;
import ProjectTest.Imigrantes.Imigrante;

import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("""
                Você inicia mais uma rotina de trabalho. Ao entrar em sua cabine
                e organizar sua mesa, você clica o alarme para a análise do primeiro imigrante
                que possivelmente poderá adentrar em seu país.""");

        //Após isso, já pode haver um metodo de exibição/introdução do imigrante junto de uma lista de ações

        Imigrante imigrante1 = new Imigrante("Kai", 20, "Brasileira");

        Identidade identidade1 = new Identidade("Kai", LocalDate.of(2027, 07,24), LocalDate.of(2004, 12, 14));

        if(identidade1.verificarLegalidade(imigrante1)){
            System.out.println("aaa");
        } else {
            System.out.println("bbb");
        }


    }
}

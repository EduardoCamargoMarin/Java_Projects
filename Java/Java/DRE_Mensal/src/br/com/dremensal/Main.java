
package br.com.dremensal;

import Orcamento.OrcamentoMensal;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("DEMONSTRACAO DE RESULTADO DO EXERCICIO");
        System.out.print("MÊS DA D.R.E:\n1. JANEIRO\n2. FEVEREIRO\n3. MARÇO\n4. ABRIL\n5. MAIO\n6. JUNHO\n7. JULHO\n8. AGOSTO\n9. SETEMBRO\n10. OUTUBRO\n11. NOVEMBRO\n12. DEZEMBRO\n99.ENCERRAR\n\nCOMANDO: ");
        Scanner inputMonthIndex = new Scanner(System.in);
        int monthChoice = inputMonthIndex.nextInt();

        if (monthChoice == 1){
            System.out.println("================\nJANEIRO SELECIONADO\n================");

            //Orçamento inicial

            OrcamentoMensal initialBudget = new OrcamentoMensal();
            initialBudget.getBudget();




            Scanner inputBudget = new Scanner(System.in);
            System.out.print(">> ORCAMENTO INICIAL:R$ ");


            //Impostos
            Scanner inputIPTU = new Scanner(System.in);
            System.out.println("\n================\n>> IMPOSTO IPTU:R$ ");
            double outputIPTU = inputIPTU.nextDouble();

        }




    }
}
//Precisa finalizar""
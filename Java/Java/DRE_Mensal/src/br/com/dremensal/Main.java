
package br.com.dremensal;

import Custos.CustoFixo;
import Custos.CustoVariavel;
import Imposto.Iptu;
import Imposto.Ipva;
import Orcamento.OrcamentoMensal;
import Periodo.Mes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("DEMONSTRACAO DE RESULTADO DO EXERCICIO");
        System.out.print("MÊS DA D.R.E:\n1. JANEIRO\n2. FEVEREIRO\n3. MARÇO\n4. ABRIL\n5. MAIO\n6. JUNHO\n7. JULHO\n8. AGOSTO\n9. SETEMBRO\n10. OUTUBRO\n11. NOVEMBRO\n12. DEZEMBRO\n99.ENCERRAR\n\nCOMANDO: ");
        Scanner inputMonthIndex = new Scanner(System.in);
        int monthChoice = inputMonthIndex.nextInt();

        if (monthChoice == 1){
            Mes monthEntrance = new Mes();
            monthEntrance.getMensal();
            monthEntrance.setMensal("JANEIRO");

            System.out.println("================\n" + monthEntrance.getMensal() +" SELECIONADO\n================");

            //Orçamento inicial

            OrcamentoMensal initialBudget = new OrcamentoMensal();
            initialBudget.getBudget();

            Scanner inputBudget = new Scanner(System.in);
            System.out.print(">> ORCAMENTO INICIAL:R$ ");
            double outputBudget = inputBudget.nextDouble();
            initialBudget.setBudget(outputBudget); //Orçamento inicial


            //IPTU
            Iptu initialIptu = new Iptu();
            initialIptu.getIPTU();

            Scanner inputIPTU = new Scanner(System.in);
            System.out.println("\n================\n>> IMPOSTO MENSAL IPTU:R$ ");
            double outputIPTU = inputIPTU.nextDouble();
            initialIptu.setIPTU(outputIPTU);

            //IPVA
            Ipva initialIpva = new Ipva();
            initialIpva.getIPVA();

            Scanner inputIPVA = new Scanner(System.in);
            System.out.println("\n================\n>> IMPOSTO MENSAL IPVA:R$ ");
            double outputIPVA = inputIPVA.nextDouble();
            initialIpva.setIPVA(outputIPVA);


            //Custo Fixo
            CustoFixo initialFixedBillCost = new CustoFixo();
            initialFixedBillCost.getFixedBillCost();

            Scanner inputFixedBillCost = new Scanner(System.in);
            System.out.print("\n================\n>> CUSTO FIXO MENSAL:R$ ");
            double outputFixedBillCost = inputFixedBillCost.nextDouble();
            initialFixedBillCost.setFixedBillCost(outputFixedBillCost);


            //Custo Variavel
            CustoVariavel initialVariableBillCost = new CustoVariavel();
            initialVariableBillCost.getVariableBillCost();

            Scanner inputVariableBillCost = new Scanner(System.in);
            System.out.print("\n================\n>> CUSTO VARIAVEL MENSAL:R$ ");
            double outputVariableBillCost = inputVariableBillCost.nextDouble();
            initialVariableBillCost.setVariableBillCost(outputVariableBillCost);





        }


    }
}

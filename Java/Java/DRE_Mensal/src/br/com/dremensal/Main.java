
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


            ArrayList <String> mes = new ArrayList<String>();
        mes.add(1, "JANEIRO");
        mes.add(2, "FEVEREIRO");
        mes.add(3, "MARÇO");
        mes.add(4, "ABRIL");
        mes.add(5, "MAIO");
        mes.add(6, "JUNHO");
        mes.add(7, "JULHO");
        mes.add(8, "AGOSTO");
        mes.add(9, "SETEMBRO");
        mes.add(10, "OUTUBRO");
        mes.add(11, "NOVEMBRO");
        mes.add(12, "DEZEMBRO");  // Vincular a escolha com a lista de meses.




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
            System.out.print("\n================\n>> IMPOSTO MENSAL IPTU:R$ ");
            double outputIPTU = inputIPTU.nextDouble();
            initialIptu.setIPTU(outputIPTU);

            //IPVA
            Ipva initialIpva = new Ipva();
            initialIpva.getIPVA();

            Scanner inputIPVA = new Scanner(System.in);
            System.out.print("\n================\n>> IMPOSTO MENSAL IPVA:R$ ");
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

            //Lucro do final do exercicio
            double budgetFinal = (outputBudget-outputIPTU-outputIPVA-outputVariableBillCost-outputFixedBillCost);
            
            //Apresentação do D.R.E
            System.out.print("\n\n================\nDEMONSTRAÇÃO DE RESULTADOS DO EXERCICIO DE " + monthEntrance.getMensal());
            System.out.print("\n================\n ORCAMENTO BRUTO: R$ " + outputBudget + "\n");
            System.out.print("================\n IPTU: R$ " + outputIPTU + "\n");
            System.out.print("================\n IPVA: R$ " + outputIPVA + "\n");
            System.out.print("================\n ORCAMENTO LIQUIDO: R$ " + (outputBudget - outputIPTU - outputIPVA) + "\n");
            System.out.print("================\n CUSTO FIXO: R$ " + outputFixedBillCost + "\n");
            System.out.print("================\n CUSTO VARIAVEL: R$ " + outputVariableBillCost + "\n");
            System.out.print("================\n LUCRO FINAL: R$ " + budgetFinal + "\n");

            //Condição de deposito e investimento --- Apresenta inconsistência, precisa checar
            if (budgetFinal == 0 || budgetFinal <= 250) {
                double depositBudget = budgetFinal * 0.7;
                double investBudget = budgetFinal * 0.3;
                System.out.println("PELO SEU LUCRO FINAL, RECOMENDO DEPOSITAR: R$" + depositBudget + " E INVESTIR: R$" + investBudget);

                System.out.print("================\n DESEJA PROSSEGUIR COM O PLANEJAMENTO FINANCEIRO? [SIM] [NAO] ->");
                Scanner planningChoice = new Scanner(System.in);
                String financialPlanningChoice = planningChoice.next();

                if (financialPlanningChoice.equals("SIM") || financialPlanningChoice.equals("sim")) {
                    System.out.println("\nDEPOSITO de R$ " + depositBudget + " E INVESTIMENTO DE R$ " + investBudget + " CONCLUIDOS");
                }if (financialPlanningChoice.equals("NAO") || financialPlanningChoice.equals("nao")){
                    Scanner diffFinancialPlanningChoice = new Scanner(System.in);
                    Scanner diffInvestimentChoice = new Scanner(System.in);

                    System.out.print("\n QUANTO DESEJA DEPOSITAR?");
                    double inputFinancialPlanningChoice = diffFinancialPlanningChoice.nextDouble();


                    System.out.print("\n==============\nQUANTO DESEJA INVESTIR?");
                    double inputinvestimentChoice = diffInvestimentChoice.nextDouble();

                    System.out.println("\n================\n TRANSAÇÃO CONCLUIDA \n================\n"); // Criar condição de evitar qualquer valor fora do parametro
                }

            } else if (budgetFinal >= 251 || budgetFinal <=500) {
                double depositBudget = budgetFinal * 0.6;
                double investBudget = budgetFinal * 0.4;
                System.out.println("PELO SEU LUCRO FINAL, RECOMENDO DEPOSITAR: R$" + depositBudget + " E INVESTIR: R$" + investBudget);
            } else if (budgetFinal >=501 || budgetFinal <= 800) {
                double depositBudget = budgetFinal * 0.5;
                double investBudget = budgetFinal * 0.5;
                System.out.println("PELO SEU LUCRO FINAL, RECOMENDO DEPOSITAR: R$" + depositBudget + " E INVESTIR: R$" + investBudget);
            } else if (budgetFinal >= 801 || budgetFinal <= 1000) {
                double depositBudget = budgetFinal * 0.4;
                double investBudget = budgetFinal * 0.6;
                System.out.println("PELO SEU LUCRO FINAL, RECOMENDO DEPOSITAR: R$" + depositBudget + " E INVESTIR: R$" + investBudget);
            } else if (budgetFinal >=1001 || budgetFinal <= 1500) {
                double depositBudget = budgetFinal * 0.3;
                double investBudget = budgetFinal * 0.7;
                System.out.println("PELO SEU LUCRO FINAL, RECOMENDO DEPOSITAR: R$" + depositBudget + " E INVESTIR: R$" + investBudget);
            } else if (budgetFinal >= 1501 || budgetFinal <= 3000) {
                double depositBudget = budgetFinal * 1.0;
                double investBudget = budgetFinal * 1.0;
                System.out.println("PELO SEU LUCRO FINAL, RECOMENDO DEPOSITAR: R$" + depositBudget + " E INVESTIR: R$" + investBudget);
            } else if ( budgetFinal >= 3001 || budgetFinal <= 6000) {
                double depositBudget = budgetFinal * 0.2;
                double investBudget = budgetFinal * 0.8;
                System.out.println("PELO SEU LUCRO FINAL, RECOMENDO DEPOSITAR: R$" + depositBudget + " E INVESTIR: R$" + investBudget);
            } else if (budgetFinal > 6001) {
                double depositBudget = budgetFinal * 0.1;
                double investBudget = budgetFinal * 0.9;
                System.out.println("PELO SEU LUCRO FINAL, RECOMENDO DEPOSITAR: R$" + depositBudget + " E INVESTIR: R$" + investBudget);
            }

        }



    }
}

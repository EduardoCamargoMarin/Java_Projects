package br.com.rendimentotaxa;
import Orcamento.OrcamentoReal;
import Selic.TaxaSelic;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("ANALISE DE INVESTIMENTO 2023 SOBRE TAXA SELIC");

        OrcamentoReal budget = new OrcamentoReal();
        budget.setInitialBudget(21000);

        TaxaSelic selic = new TaxaSelic();
        selic.getSelic();

        double valorPorcentagem = selic.getSelic() * 100;
        double calculoRentabilidade =  (budget.getInitialBudget() * selic.getSelic()) + budget.getInitialBudget();
        Double lucro = calculoRentabilidade - budget.getInitialBudget();




        System.out.println("INVESTIMENTO APLICADO:R$ " + budget.getInitialBudget() + "\nRENDIMENTO PELA TAXA SELIC:" + valorPorcentagem + "%");

        System.out.println("RENDIMENTO AO ANO: R$ " + calculoRentabilidade);
        System.out.println("LUCRO NO FINAL DO PERIODO: R$ " + lucro);



    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //==========================================================================================
        EletronicComponents.componentAND ANDLogic = new EletronicComponents.componentAND();
        EletronicComponents.componentOR ORLogic = new EletronicComponents.componentOR();
        EletronicComponents.componentNAND NANDLogic = new EletronicComponents.componentNAND();
        EletronicComponents.componentNOR NORLogic = new EletronicComponents.componentNOR();
        EletronicComponents mathBoolean = new EletronicComponents();

        //==================================INSIRA OS DADOS=========================================
        int bitA = mathBoolean.getA();
        int bitB = mathBoolean.getB();

            mathBoolean.setA(1); //Insira 0 ou 1 na contagem de bit
            mathBoolean.setB(1); //Insira 0 ou 1 na contagem de bit

            ANDLogic.setLogicMathAND(mathBoolean.getA() * mathBoolean.getB());

            ORLogic.setLogicMathOR(mathBoolean.getA() + mathBoolean.getB());

            NANDLogic.setLogicMathNAND(mathBoolean.getA() * mathBoolean.getB());

            NORLogic.setLogicMathNOR(mathBoolean.getA() + mathBoolean.getB());

        //==================================VARIAVEIS=========================================
            int andComponent = ANDLogic.getLogicMathAND();
            int orComponent = ORLogic.getLogicMathOR();
            int nandComponent = NANDLogic.getLogicMathNAND();
            int norComponent = NORLogic.getLogicMathNOR();

        //==================================CONDIÇÃO=========================================
            if (mathBoolean.getA() > 1 || mathBoolean.getB() > 1) {
                System.out.println("Quantidade de bit incorreta");
            }
            else if (mathBoolean.getA() == 1 && mathBoolean.getB() == 1) {
                ORLogic.setLogicMathOR(1);
                NORLogic.setLogicMathNOR(1);

                //==================================RESULTADOS=================================
                System.out.println("COMPONENTE AND: " + ANDLogic.getLogicMathAND());
                System.out.println("COMPONENTE OR: " + ORLogic.getLogicMathOR());
                System.out.println("COMPONENTE NAND: " + NANDLogic.getLogicMathNAND());
                System.out.println("COMPONENTE NOR: " +NORLogic.getLogicMathNOR());

            }
            else {
                System.out.println("COMPONENTE AND: " + ANDLogic.getLogicMathAND());
                System.out.println("COMPONENTE OR: " + ORLogic.getLogicMathOR());
                System.out.println("COMPONENTE NAND: " + NANDLogic.getLogicMathNAND());
                System.out.println("COMPONENTE NOR: " +NORLogic.getLogicMathNOR());
            }


            //========================Tabela Verdade=============================

            TrueTable bitTable = new TrueTable();

        int[][] tabelaVerdade = {
                {bitTable.getFalseBit(), bitTable.getFalseBit(), bitTable.getTrueBit(), bitTable.getTrueBit()},{bitTable.getFalseBit(), bitTable.getTrueBit(), bitTable.getFalseBit(), bitTable.getTrueBit(),}};

        System.out.println(Arrays.deepToString(tabelaVerdade));


    }
}






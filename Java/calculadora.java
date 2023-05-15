
import java.util.Scanner;

 class calculadora {

    public static void main(String[] args) {
           int escolha;
           float conta;

        
        System.out.println("==================================");
        System.out.println("Selecione um numero:");
        System.out.println("==================================");
     
        try (Scanner entrada01 = new Scanner(System.in)) {
            float num1 = entrada01.nextFloat();
            System.out.println("==================================");

            System.out.println("Selecione um segundo numero:");
            try (Scanner entrada02 = new Scanner(System.in)) {
                System.out.println("==================================");

                float num2 = entrada02.nextFloat();
                System.out.println("==================================");
                System.out.println("1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("Selecione a operação");
                System.out.println("==================================");
                try (Scanner operacao = new Scanner(System.in)) {
                    escolha = operacao.nextInt();
                }
                
                switch(escolha) {
                    case 1:
                        conta = num1 + num2;
                        System.out.println("A soma de " +num1+ " + " +num2+ " = " + conta);
                        break;
                        
                    case 2:
                        conta = num1 - num2;
                        System.out.println("A subtração de " +num1+ "-" +num2+ " = " + conta);
                        break;
                    case 3:
                        conta = num1 * num2;
                        System.out.println("A multiplicação de " +num1+ " X " +num2+ " = " + conta);
                        break;
                    case 4:
                        conta = num1 / num2;
                        System.out.println("A divisão de " +num1+ " / " +num2+ " = " + conta);
                        break;
                    default:
                        System.out.println("Ação invalida");
                }
            }
        }
     }
}
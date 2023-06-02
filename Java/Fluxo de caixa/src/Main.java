
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cadastro de fluxo de caixa");
        //Entrada dos dados da conta
        System.out.println("Tipo da conta:\nE - Entrada\nS - Saida\n99 - Sair");
        Scanner entradaConta = new Scanner(System.in);
        String inputConta = entradaConta.next();

            try{
                if (inputConta.equals("E") || inputConta.equals("e")) {
                    System.out.println("Fluxo de caixa - ENTRADA");
                    System.out.println("Nome da conta:");

                    Scanner nomeConta = new Scanner(System.in);
                    String inputNomeConta = nomeConta.next();

                    System.out.println("Valor de ENTRADA:");
                    Scanner valorConta = new Scanner(System.in);
                    float inputValorConta = valorConta.nextFloat();

                    System.out.println("==================\nINFORMATIVO\n==================");
                    System.out.println("ENTRADA\nConta: " + inputNomeConta + "\nValor: R$" +inputValorConta);
                }
                else if (inputConta.equals("S") || inputConta.equals("s")) {
                    System.out.println("Fluxo de caixa - SAIDA");
                    System.out.println("Nome da conta:");

                    Scanner nomeConta = new Scanner(System.in);
                    String inputNomeConta = nomeConta.next();


                    System.out.println("Valor de SAIDA:");
                    Scanner valorConta = new Scanner(System.in);
                    float inputValorConta = valorConta.nextFloat();

                    System.out.println("==================\nINFORMATIVO\n==================");
                    System.out.println("SAIDA\nConta: " + inputNomeConta + "\nValor: R$" +inputValorConta);

                }
            } catch (Exception e) {
                System.out.println("Erro ao inserir o valor");
            }

    }
}
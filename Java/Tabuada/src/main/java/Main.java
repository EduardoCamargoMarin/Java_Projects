import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);

        System.out.println("Digite um numero de 1 - 100 \n Caso queira sair do programa, pressione 101");

            try {
                int inputNumber = tabuada.nextInt();

                if (inputNumber >= 1 && inputNumber <= 100) {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + ") " + inputNumber + " x " + i + " = " + (inputNumber * i));
                    }
                } else if (inputNumber == 101) {
                    System.out.println("Encerrando o programa");
                    return;
                } else {
                    System.out.println("Entrada invalida - adicionar numeros inteiros apenas de 1 -100 ou 101 para sair.");
                }
            } catch (Exception e) {
                System.out.println("Numero não permitido, a entrada é apenas de numeros inteiros.");
            }finally {
                tabuada.close();
            }
        }
}
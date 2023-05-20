

package excecoes;
import java.util.Scanner;

public class main {
    public static void name() {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite um valor");

            int numero1 = entrada.nextInt();
    
            System.out.println(numero1);
        }
        catch(Exception ex){
                System.out.println("Valor não é um numero");
        }

    }



}

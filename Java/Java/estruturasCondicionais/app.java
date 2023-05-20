package estruturasCondicionais;

import java.util.Scanner;
import java.util.Random;

public class app {
    public static void name() {
        Random gerador = new Random();

        int numeroAleatorio =  gerador.nextInt(100);

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Advinhe o numero:");
            int numero = entrada.nextInt();

            if(numero == numeroAleatorio) {
                System.out.println("Acertou");
            }
            else{
                System.out.println("Errou");
            }
        }
    }
}

package repeticaowhile;

import java.util.Scanner;
 class main {
    
    public static void name() {
        int opcao = 0;
        while(opcao != 99) {
            System.out.println("Digite um valor ou 99 para sair");
            try (Scanner entrada = new Scanner(System.in)) {
                opcao = entrada.nextInt();
            }

        }

            

        }
        

    }


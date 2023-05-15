package aposta;
 import java.util.Scanner;
 
 class aposta {
    public static void name() {


            System.out.println("=============================");
            System.out.println("Jogo de apostas, Quanto você vai apostar?");
            System.out.println("=============================");
            System.out.println("R$ 2,00 - 5 digitos");
            System.out.println("R$ 4,00 - 3 digitos");
            System.out.println("R$ 6,00 - 2 digitos");
        int i,j,k,l,m;

            for(i = 0; i <= 96; i++);
                for( j = 0; j <= 97; j++);
                    for( k = 0; k <= 98; k++);
                        for( l = 0; l <= 99; l++);
                            for( m = 0; m <= 100; m++);


            try (Scanner apostas = new Scanner(System.in)) {
                int aposta = apostas.nextInt();


                if (aposta == 6) {
                    System.out.println("Você apostou" + aposta);
                    System.out.print(i);
                    System.out.print(j);

                } 
                else if(aposta == 4) {
                    System.out.println("Você apostou" + aposta);
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                }
                else if(aposta == 2) {
                    System.out.println("Você apostou" + aposta);
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    System.out.print(l);
                    System.out.print(m);
                }
                else {
                    System.out.println("Aposta invalida");
                }
            }
            


        
    }
}

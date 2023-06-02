import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("Doação de sangue, selecione seu tipo sanguinio");
        System.out.println("1 - AB");
        System.out.println("2 - A");
        System.out.println("3 - B");
        System.out.println("4 - O");
        System.out.println("5 - Sair");

        try (Scanner entradaSangue = new Scanner(System.in)) {
            int inputSangue = entradaSangue.nextInt();

            System.out.println("Qual o seu nome?");
            try (Scanner entradaNome = new Scanner(System.in)) {
                String nomeDoador = entradaNome.next();

                if (inputSangue == 1) {
                    Doador doadorAB = new Doador();
                    doadorAB.nome = nomeDoador;
                    doadorAB.sangueTipo = "AB";

                    System.out.println("Obrigado " + doadorAB.nome + " pela doação do sangue tipo " + doadorAB.sangueTipo);
                } 
                else if(inputSangue == 2) {
                   Doador doadorA = new Doador(); 
                   doadorA.nome = nomeDoador;
                   doadorA.sangueTipo = "A";

                   System.out.println("Obrigado " + doadorA.nome + " pela doação do sangue tipo " + doadorA.sangueTipo);
                }
                else if(inputSangue == 3) {
                    Doador doadorB = new Doador();
                    doadorB.nome = nomeDoador;
                    doadorB.sangueTipo = "B";

                    System.out.println("Obrigado " + doadorB.nome + " pela doação do sangue tipo" + doadorB.sangueTipo);
                }
                else if(inputSangue == 4) {
                    Doador doadorO = new Doador();
                    doadorO.nome = nomeDoador;
                    doadorO.sangueTipo = "O";

                    System.out.println("Obrigado " + doadorO.nome + " pela doação do sangue tipo" + doadorO.sangueTipo);
                }
                else{

                    System.out.println("Sistema encerrado");
                }
            }
        }
    }
}
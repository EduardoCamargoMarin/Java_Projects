import java.util.Scanner;
import java.util.ArrayList;


public class cadastroPessoa {
    public static void name() {


        System.out.println("Cadastro de funcionarios!");
        System.out.println("1 - Cadastro funcionário");
        System.out.println("2 - sair");

        


        Scanner entrada = new Scanner(System.in);

        
        int escolha = entrada.nextInt();



        if (escolha == 1) {
            ArrayList<String> cadastros = new ArrayList<String>();


            System.out.println("Nome do funcionário:");
            Scanner cadastro_nome = new Scanner(System.in);
            String nome = cadastro_nome.next();
            cadastros.add(nome);


            System.out.println("CPF do funcionário");
            Scanner cadastro_CPF = new Scanner(System.in);
            String cpf = cadastro_CPF.next();
            cadastros.add(cpf);

            System.out.println("Login:");
            Scanner cadastro_login = new Scanner(System.in);
            String login = cadastro_login.next();
            cadastros.add(login);

            System.out.println("Senha:");
            Scanner cadastro_senha = new Scanner(System.in);
            String senha = cadastro_senha.next();
            cadastros.add(senha);

            System.out.println("Funcionário cadastrado!");
            System.out.println(cadastros);
              
            
        }
        else if(escolha != 2) {
            System.out.println("Valor incorreto");
        }
        else {
            System.out.println("Sistema encerrado");
        }


        
    }
}
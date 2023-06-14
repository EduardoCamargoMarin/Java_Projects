
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(">>>>>>>>Diamond Bank<<<<<<<<");

                System.out.println("CADASTRO CLIENTE");

                //Insira as informações abaixo
                PessoaFisica cadastroPessoaFisica = new PessoaFisica();
                cadastroPessoaFisica.setName("Eduardo");
                cadastroPessoaFisica.setCpf("111.222.333-xx");
                cadastroPessoaFisica.setAccountType("Poupança"); //Poupança ou Conta corrente;
                cadastroPessoaFisica.setHomeAddress("Rua Queijo - Centro SP"); //Modelo: Rua/Avenida/Rodovia Queijo - Centro SP"
                cadastroPessoaFisica.setHomeNumber("233");
                cadastroPessoaFisica.setCEP("13-3123.363");
                cadastroPessoaFisica.setCellphone01("11912345678");
                cadastroPessoaFisica.setCellphone02("11912345678");

                //Criando as variaveis

                String nome = cadastroPessoaFisica.getName();
                String cpf = cadastroPessoaFisica.getCpf();
                String accountType = cadastroPessoaFisica.getAccountType();
                String homeAdress = cadastroPessoaFisica.getHomeAddress();
                String homeNumber = cadastroPessoaFisica.getHomeNumber();
                String CEP = cadastroPessoaFisica.getCEP();
                String cellphone01 = cadastroPessoaFisica.getCellphone01();
                String cellphone02 = cadastroPessoaFisica.getCellphone02();

                //Criando a Array

                String[][] informativo = {
                        {       "Nome:" +nome,
                                "Conta:" +accountType,
                                "CPF:" +cpf, "Endereço:" +homeAdress,
                                "CEP:" +CEP,
                                "Contato principal:" +cellphone01
                        },
                        {
                                "Conta:" +accountType,
                                "Numero:" +homeNumber,
                                "Contato reserva:" +cellphone02
                        }
                };

        System.out.println(Arrays.deepToString(informativo));








        }
    }

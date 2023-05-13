package CondicaoComposta;

class Main {
    public static void main(String[] args) {
  
        String login, senha;

        login = "Eduardo";
        senha = "Minh@S3nh@";

        if (login == "Eduardo" && senha == "Minh@S3nh@") {
            System.out.println("Acesso permitido");
        }
        else if(login == "Eduardo" || senha == "Minh@S3nh@"){
            System.out.println("Login ou Senha incorreta");
        }
        else{
            System.out.println("Campos vazios");
        }

  }
}

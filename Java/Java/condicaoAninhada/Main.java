package condicaoAninhada;

class Main {
    public static void main(String[] args) {
  
            float nota1,nota2, total;

            nota1 = 10;
            nota2 = 7;
    

        total = (nota1 + nota2) / 2;

        if (total >= 6 && total <= 10) {
            System.out.println("Aprovado");
        }
        else if(total == 5) {
            System.out.println("Recuperação");
        }
        else if(total < 5) {
            System.out.println("Reprovado");
        }
        else {
            System.out.println("Erro no sistema");
        }




    }
}


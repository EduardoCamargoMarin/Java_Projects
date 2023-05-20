package classe;

public class Cao {
    String nome;
    String cor;
    int idade;
    double peso;


    public Cao(){
        cor = "amarelo";

    }

    public Cao(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void Anda() { // não retorna
        System.out.println("Estou andando" + cor);
    }

    public void DadosCao() {
        System.out.println(nome+""+idade);
    }
}

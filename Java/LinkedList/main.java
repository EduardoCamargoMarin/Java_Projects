import java.util.LinkedList;


public class main {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList(); //elementos conectados no outro
        
        animals.add("Cachorro");
        animals.add("Cavalo");
        animals.add("Vaca");
        
        
        
        animals.add(1, "Gato"); //Adiciono na posição que eu quiser
        System.out.println(animals);
      
    }
    
}

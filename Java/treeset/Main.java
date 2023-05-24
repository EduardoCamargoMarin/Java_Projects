import java.util.TreeSet;


public class main {

    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        
        numeros.add(8);
        numeros.add(6);
        numeros.add(9);
        
        
        
       boolean result =  numeros.remove(6); // retorna true ou false
       System.out.println(numeros);
    }
    
}
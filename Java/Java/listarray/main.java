package listarray;

import java.util.ArrayList;

public class main {
    public static void name() {
        ArrayList<String> estados = new ArrayList<>();

        estados.add("Espirito Santo");
        estados.add("São Paulo");
        estados.add("Ceara");

        estados.remove("Ceara");

        estados.contains("Amazonas"); // boolean
        
    }
}

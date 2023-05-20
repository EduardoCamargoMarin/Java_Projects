package listarray;
import java.util.ArrayList;

public class app {
    public static void name() {
        ArrayList<String> bandas = new ArrayList<String>();

        bandas.add("Kiss");
        bandas.add("Beatles");
        bandas.add("Iron Maiden");

        bandas.add(bandas.indexOf("Kiss"), "Capital Inicial"); //troca o elemento

        bandas.remove("Kiss");

        bandas.clear(); //limpa tudo
    }
}

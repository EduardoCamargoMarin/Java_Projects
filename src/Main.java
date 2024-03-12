import Keyboard.Interfaces.KeyboardLayout;
import Keyboard.KeyboardTypes;
import Keyboard.MecanicKeyboard;
import Keyboard.MembraneKeyboard;

public class Main {
    public static void main(String[] args) {

        MecanicKeyboard mecanicModel01 = new MecanicKeyboard("switch blue", "Red dragon");


        mecanicModel01.typing();


        mecanicModel01.fortyPercent();
        mecanicModel01.sixtyPercent();
        mecanicModel01.hundredPercent();


        MembraneKeyboard membraneModel01 = new MembraneKeyboard("switch brown", "Red dragon");


        membraneModel01.typing();


        membraneModel01.fortyPercent();
        membraneModel01.sixtyPercent();
        membraneModel01.hundredPercent();
    }
}
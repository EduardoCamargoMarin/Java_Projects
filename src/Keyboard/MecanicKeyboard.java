package Keyboard;

import Keyboard.Interfaces.KeyboardLayout;

//Keyboard heritage
    public class MecanicKeyboard extends KeyboardTypes implements KeyboardLayout {

        public MecanicKeyboard(String type, String brand) {
            super(type, brand);
        }


        @Override
        public void fortyPercent() {

        }

        @Override
        public void sixtyPercent() {

        }

        @Override
        public void hundredPercent() {

        }
    }

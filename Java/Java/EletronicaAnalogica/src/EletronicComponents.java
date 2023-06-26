public class EletronicComponents {
    private int a, b; // 1 = true, 0 = false;


    //========== Componente AND =================


   public static class componentAND {
       private int logicMathAND;

        //==========Getter=========
        public int getLogicMathAND() {
            return logicMathAND;
        }
        //==========Setter=========

        public void setLogicMathAND(int newLogicMathAND) {
            this.logicMathAND = newLogicMathAND;
        }
    }

    //========== Componente OR =================
    public static class componentOR {
        private int logicMathOR;

        //==========Getter=========
        public int getLogicMathOR() {
            return logicMathOR;
        }
        //==========Setter=========

        public void setLogicMathOR(int newLogicMathOR) {
            this.logicMathOR = newLogicMathOR;
        }
    }

    //========== Componente NAND =================
    public static class componentNAND {
      private  int logicMathNAND;

        //==========Getter=========
        public int getLogicMathNAND() {
            return logicMathNAND;
        }
        //==========Setter=========

        public void setLogicMathNAND(int newLogicMathNAND) {
            this.logicMathNAND = newLogicMathNAND;
        }
    }

    //========== Componente NOR =================
    public static class componentNOR {
       private int logicMathNOR;

        //==========Getter=========
        public int getLogicMathNOR() {
            return logicMathNOR;
        }
        //==========Setter=========

        public void setLogicMathNOR(int newLogicMathNOR) {
            this.logicMathNOR = newLogicMathNOR;
        }
    }

    //======================Constructor========================

    public EletronicComponents() {

    }

    //======================Getter========================


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


    //======================Setter========================

    public void setA(int newA) {
        this.a = newA;
    }
    public void setB(int newB) {
        this.b = newB;
    }
}

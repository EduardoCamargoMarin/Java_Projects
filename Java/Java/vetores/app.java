package vetores;

public class app {
    public static void name() {
        
        int[] passarosPorDia = {2,5,0,7,4,1,3,0,2,5,0,1,3,1}; //vetor

        int totalPassaros = 0;
        int passarosPrimeiraSemana = 0;
        int passarosSegundaSemana = 0;


        for(int i=0;i<14;i++){
            totalPassaros = totalPassaros + passarosPorDia[i]; //soma os index
        }
        System.out.println(totalPassaros);

        for(int j = 0; j < 7; j++) {
            passarosPrimeiraSemana = passarosPrimeiraSemana + passarosPorDia[j];
            System.out.println(passarosPrimeiraSemana);
        }
        for(int k = 7; k < 14; k++) {
            passarosSegundaSemana = passarosSegundaSemana + passarosPorDia[k];
            System.out.println(passarosSegundaSemana);
        }



    }
}

package matriz;

public class main {
    public static void name() {
        int[][] dados = new int[3][3]; //matriz ixj

        for(int i=0;i<3;i++)
            for(int j = 0;j<3;j++)

            dados[i][j] = j;

            for(int i=0;i<3;i++)
            for(int j = 0;j<3;j++)
            System.out.println(dados[i][j]);

    }
}

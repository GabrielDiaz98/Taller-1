
public class DiagMatriz {

    public static void main(String args[]) {
        int valores[][] = new int[][]{{8, -4, 1}, {3, -5, 7}, {2, 15, 81}};
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if ((i - j) == 0) {
                    diag1 += valores[i][j];
                }
                if ((i + j) == (valores.length - 1)) {
                    diag2 += valores[i][j];
                }
            }
        }
        Diagonal diag = new Diagonal(diag1, diag2);
        System.out.println("Diferencia entre la suma de la matriz 3x3");
        System.out.println("");
        System.out.println("Resultado: " + diag.resultado());
    }
}

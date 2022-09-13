package process;

import static generator.Generator.matriz;

public class PlayerPosition {
    private static final String positionEmpity = " ";

    //Encontrado a posição do positionEmpity dentro da matriz
    public static int[] getPosition() {
        for (int row = 0; row != 3; row++) {
            for (int col = 0; col != 3; col++) {
                if (matriz[row][col].equals(positionEmpity)) {
                    return new int[] {row, col};
                }
            }
        }
        return null;
    }
}
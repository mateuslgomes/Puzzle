package move;

import static generator.Generator.matriz;
import static process.PlayerPosition.getPosition;

public class Move {

    //Lógica que desenvolvi para movimentar os número;
    public static void moveTop() {
        int[] position = getPosition();
        assert position != null;
        matriz[position[0]][position[1]] = matriz[position[0] - 1][position[1]];
        matriz[position[0] - 1][position[1]] = " ";
    }
    public static void moveBottom() {
        int[] position = getPosition();
        assert position != null;
        matriz[position[0]][position[1]] = matriz[position[0] + 1][position[1]];
        matriz[position[0] + 1][position[1]] = " ";
    }

    public static void moveRight() {
        int[] position = getPosition();
        assert position != null;
        matriz[position[0]][position[1]] = matriz[position[0]][position[1] + 1];
        matriz[position[0]][position[1] + 1] = " ";
    }

    public static void moveLeft() {
        int[] position = getPosition();
        assert position != null;
        matriz[position[0]][position[1]] = matriz[position[0]][position[1] - 1];
        matriz[position[0]][position[1] - 1] = " ";
    }
}
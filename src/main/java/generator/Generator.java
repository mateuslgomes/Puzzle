package generator;

import application.UI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class Generator {
    public static final String[][] matriz = generatorMatriz();

    private static String[][] generatorMatriz() {
        String[] random = shuffle();
        return new String[][]{{random[0], random[1], random[2]}, {random[3],
                random[4], random[5]},{random[6], random[7], random[8]}};
    }

    public static void checkWin() {
        String[][] arrayWin = {{"1", "2", "3"},{"4", "5", "6"},{"7", "8", " "}};
        int similar = 0;
        for (int i = 0; i < 3; i++) {
            if (Arrays.equals(Arrays.stream(matriz).toList().get(i), Arrays.stream(arrayWin).toList().get(i))) {
                similar ++;
            }
        }
        if (similar == 3) {
            UI.clearScreen();
            System.out.println("PARABÉNS VOCÊ VENCEU !!!");
            UI.printUI();
            System.exit(0);
        }
    }

    private static String[] shuffle() {
        String[] arrayWin = {"1", "2", "3", "4", "5", "6", "7", "8", " "};
        List<String> list = asList(arrayWin);
        Collections.shuffle(list);
        return list.toArray(arrayWin);
    }

}
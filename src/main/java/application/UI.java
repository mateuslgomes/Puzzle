package application;

import java.util.Arrays;

import static generator.Generator.*;

public class UI {

    //Verificando quantas jogadas já foram realizadas
    public static int totalPlays = 0;

    public int getTotalPlays() {return totalPlays;}

    //Limpando o console
    public static void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    //Exibindo a UI para o usuário
    public static void printUI() {
        System.out.println("SCORE: " + totalPlays);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("  " + matriz[row][col]);
            }
            System.out.println();
        }
    }

}
package process;

import application.UI;
import move.Move;

import static application.UI.totalPlays;
import static generator.Generator.checkWin;

public class PlayerChoice {

    //Verificando a escolha do usuário e tratando erros de Jogada Inválida.
    public static void play(char choice) {
        UI.clearScreen();
        try {
            switch (choice) {
                case 'c' -> Move.moveTop();
                case 'b' -> Move.moveBottom();
                case 'd' -> Move.moveRight();
                case 'e' -> Move.moveLeft();
                case 's' -> System.exit(0);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("(Jogada Inválida)");
        }
        finally {
            totalPlays++;
            checkWin();
            System.out.println("B (BAIXO) - C (CIMA) - E (ESQUERDA) - D (DIREITA) - S (SAIR)") ;
            UI.printUI();
            System.out.print("Escolha: ");
        }
    }

}
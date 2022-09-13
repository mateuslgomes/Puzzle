package application;

import process.PlayerChoice;

import java.util.Scanner;

public class Puzzle {

	public static void main(String[] args) {
		// Recebendo as escolhas do usuário e rodando o game Puzzle desenvolvido.
		System.out.println("DICA: Usar letras minúsculas.");
		char choice = ' ';
		UI.printUI();
		System.out.print("Escolha: ");
		while (choice != 's') {
			Scanner sc = new Scanner(System.in);
			choice = sc.next().charAt(0);
			PlayerChoice.play(choice);
		}
	}
}
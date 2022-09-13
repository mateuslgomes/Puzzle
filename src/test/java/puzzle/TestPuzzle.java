package puzzle;

import application.UI;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static generator.Generator.matriz;

public class TestPuzzle {

	//Deve retornar a interface do usuário (UI)
	@Test
	public void shouldReturnUI() {
		UI.printUI();
	}

	//Deve limpar o console
	@Test() public void shouldCleanConsole() {
		UI.clearScreen();
	}

	//Deve encontrar uma posição sem character na string
	@Test
	public void shouldFindAnEmptyPositionInTheString() {
		String positionEmpity = " ";
		for (int row = 0; row != 3; row++) {
			for (int col = 0; col != 3; col++) {
				if (matriz[row][col].equals(positionEmpity)) {
					Assert.assertEquals(matriz[row][col], positionEmpity);
				}
			}
		}
	}

	@Test
	public void shouldntBeSimilar() {
		String[] array = {"1", "2", "3", "5", "6", "7", "8", "9", " "};
		String[] array2 = {"1", "2", "3", "5", "6", "7", "8", "9", " "};
		List<String> list = Arrays.asList(array);
		Collections.shuffle(list);
		list.toArray(array);
		Assert.assertNotEquals(Arrays.toString(array), Arrays.toString(array2));
	}

}
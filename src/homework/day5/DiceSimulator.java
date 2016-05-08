package homework.day5;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class DiceSimulator {
	public int getRandomNumber() {
		Random generator = new Random();
		return generator.nextInt(6) + 1;
	}
	public int rollDice() {
		int die1 = getRandomNumber();
		int die2 = getRandomNumber();
		System.out.printf("die1= %d, die2= %d\n", die1, die2);
		return die1 + die2;
		
	}
	@Test
	public void testRollDice() throws Exception {
		for (int i = 1; i <= 50; i++){
			rollDice();
		}

	}
}

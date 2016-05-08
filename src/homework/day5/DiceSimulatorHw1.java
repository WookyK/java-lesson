package homework.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceSimulatorHw1 {
	public DiceSimulator ds = new DiceSimulator();
	
	public void rollDiceAndYieldAverage() {
		float average = 0; // intializing...doesn't matter
		double sumOfDie = 0; // intializing..doesn't matter
		for (int i = 1; i <= 500  ; i++) {
//			int sumOfDie = sumOfDie + ds.rollDice();
			sumOfDie += ds.rollDice(); //Dice simulator class's "Roll dice" method is being called
		}
		/** yield average */
		average = (float) (sumOfDie/500);
		System.out.println(average);
	}
	@Test
	public void averageDiceSimulator() throws Exception {
		rollDiceAndYieldAverage();
	}
}

package part2.day2.Lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 18byungwookkim on 4/17/16.
 */
public class LottoNumberGenerator implements LottoNumberGeneratable {
    private List<Integer> numbers = new ArrayList<>();

    @Override
    public List<Integer> pickLottoNumbers() {
        List<Integer> results = new ArrayList<>();
        // Init..
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        for (int i = 0 ; i < 6 ; i++) {
            int randomPosition = getRandomNumber();
            int pickedNumber = numbers.get(randomPosition);
            numbers.remove(randomPosition);
            results.add(pickedNumber);
        }
        return results;
    }

    private int getRandomNumber(){
        Random Generator = new Random();
        return Generator.nextInt(45) + 1;
    }
}

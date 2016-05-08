package part2.day2.Lottery;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 18byungwookkim on 4/17/16.
 */
public class LottoNumberGeneratorTest {
    @Test
    public void pickLottoNumbers() throws Exception {
        LottoNumberGeneratable lottoNumberGeneratable = new LottoNumberGenerator();
        List<Integer> numbers = lottoNumberGeneratable.pickLottoNumbers();
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

}
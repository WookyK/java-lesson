package part2.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 18byungwookkim on 4/17/16.
 */
public class WeaponTest {
    public static void main(String args[]) {
        Gun myGun = new Gun();
        SniperRifle mySniperRifle = new SniperRifle();
        myGun.takeAShot();
        mySniperRifle.takeAShot();

        List<Object> objects = new ArrayList<>();
        objects.add(myGun);
        objects.add(mySniperRifle);

        System.out.println(objects.get(0).getClass().getSimpleName());
    }
}

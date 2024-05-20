
package racingcar.controller;

import java.util.Random;

import static racingcar.utility.Constants.MAX_RANDOM_NUMBER;

public class RandomNumber {
    private static Random random = new Random();
    public static int generateRandomNumber(){
        return random.nextInt(MAX_RANDOM_NUMBER+1);
    }
}

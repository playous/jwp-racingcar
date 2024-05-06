
package racingcar.controller;

import java.util.Random;

import static racingcar.utility.Constants.MAX_RANDOM_NUMBER;

public class RandomNumber {
    private RandomNumber(){} //생성자로 클래스 생성 못하도록 막기
    private static Random random = new Random();
    public static int generateRandomNumber(){
        return random.nextInt(MAX_RANDOM_NUMBER+1);
    }
}

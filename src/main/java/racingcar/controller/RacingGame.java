package racingcar.controller;
import racingcar.model.CarDto;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static racingcar.controller.RandomNumber.generateRandomNumber;
import static racingcar.utility.Constants.MIN_REQUIRED_ADVANCEMENT;

public class RacingGame {
    private final List<CarDto> cars;
    private final List<String> names;
    private final int attempt;

    public RacingGame(List<String> names, int attempt){
        this.names = names;
        this.attempt = attempt;
        cars = new ArrayList<>();
    }

    public List<CarDto> getCars(){
        return cars;
    }
    public List<String> findWinners(){
        OutputView.getInstance().printExecutionResultMessage();
        for(int i = 0; i < names.size(); i++){
            startRacingGame();
        }
        return winnersName(cars);
    }

    private List<String> winnersName(List<CarDto> cars){
        int maxPosition = cars.stream()
                .mapToInt(CarDto::getAdvancementCount)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("List is empty"));
        return cars.stream()
                .filter(car -> car.getAdvancementCount() == maxPosition)
                .map(CarDto::getCarName) // 이름 추출
                .collect(Collectors.toList());
    }

    private void startRacingGame(){
        for(int i = 0; i < attempt; i++){
            if(isRandomNumberBiggerOrEqualFour(generateRandomNumber())){
                setAdvancementCount(i);
            }
        }
    }

    private boolean isRandomNumberBiggerOrEqualFour(int randomNumber){
        if(MIN_REQUIRED_ADVANCEMENT <= randomNumber){
            return true;
        }
        return false;
    }

    private void setAdvancementCount(int index){
        cars.get(index).setAdvancementCount(cars.get(index).getAdvancementCount() + 1);
    }

}
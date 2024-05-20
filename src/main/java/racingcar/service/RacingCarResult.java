package racingcar.service;
import racingcar.model.CarDto;

import java.util.List;

public class RacingCarResult {
    private final List<String> winners;
    private final List<CarDto> cars;
    private final int attempt;

    public RacingCarResult(final List<String> winners, final List<CarDto> cars,final int attempt) {
        this.winners = winners;
        this.cars = cars;
        this.attempt = attempt;
    }

    public List<String> getWinners() {
        return winners;
    }

    public List<CarDto> getCars() {
        return cars;
    }

    public int getAttempt() {
        return attempt;
    }
}

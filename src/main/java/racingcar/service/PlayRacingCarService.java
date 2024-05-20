package racingcar.service;

import java.util.List;
import org.springframework.stereotype.Service;
import racingcar.controller.RacingGame;
import racingcar.model.CarDto;

@Service
public class PlayRacingCarService {
    public RacingCarResult playRacingCar(final List<String> names, final int attempt) {
        final RacingGame racingGame = new RacingGame(names, attempt);
        final List<String> winners = racingGame.findWinners();
        final List<CarDto> cars = racingGame.getCars();
        return new RacingCarResult(winners, cars, attempt);
    }
}

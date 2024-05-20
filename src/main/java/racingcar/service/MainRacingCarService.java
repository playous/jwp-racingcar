package racingcar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import racingcar.model.GameSettingsDto;
import racingcar.model.gameResultDto;

import java.util.List;

@Service
public class MainRacingCarService {
    private final PlayRacingCarService playRacingCarService;

    @Autowired
    public MainRacingCarService(PlayRacingCarService playRacingCarService){
        this.playRacingCarService = playRacingCarService;
    }

    public gameResultDto raceCar(final GameSettingsDto gameSettingsDto){
        final List<String> names = List.of(gameSettingsDto.getNames().split(","));
        final int count = gameSettingsDto.getCount();
        final RacingCarResult racingCarResult = playRacingCarService.playRacingCar(names, count);
        return new gameResultDto(racingCarResult.getWinners(), racingCarResult.getCars());
    }
}

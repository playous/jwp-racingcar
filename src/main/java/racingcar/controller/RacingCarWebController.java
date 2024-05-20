package racingcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import racingcar.model.GameSettingsDto;
import racingcar.model.gameResultDto;
import racingcar.service.MainRacingCarService;

@RestController
public class RacingCarWebController {
    private final MainRacingCarService mainRacingCarService;
    @Autowired
    public RacingCarWebController(final MainRacingCarService mainRacingCarService) {
        this.mainRacingCarService = mainRacingCarService;
    }

    @PostMapping("/plays")
    public ResponseEntity<gameResultDto> playRacingCar(@RequestBody GameSettingsDto gameSettingsDto) {
        final gameResultDto gameResultDto = mainRacingCarService.raceCar(gameSettingsDto);
        return ResponseEntity.ok().body(gameResultDto);
    }
}

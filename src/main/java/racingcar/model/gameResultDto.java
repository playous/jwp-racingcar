package racingcar.model;

import java.util.List;
public class gameResultDto {
    private List<String> winner;
    private List<CarDto> cars;
    public gameResultDto(List<String> winner, List<CarDto> cars){
        this.winner = winner;
        this.cars = cars;
    }
    public List<String> getWinner(){
        return winner;
    }
    public List<CarDto> getCars(){ return cars;}
}
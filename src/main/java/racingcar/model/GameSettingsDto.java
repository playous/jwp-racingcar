package racingcar.model;

public class GameSettingsDto {
    private String Names;
    private int Count;

    public GameSettingsDto(String carsNames, int racingCount){
        this.Names = carsNames;
        this.Count = racingCount;
    }

    public String getNames(){
        return Names;
    }

    public int getCount(){
        return Count;
    }
}
package racingcar.controller;

import racingcar.model.GameSettingsDto;
import racingcar.view.InputView;

import java.util.List;
import java.util.Scanner;


public class UserInput {
    Scanner scanner = new Scanner(System.in);
    private List<String> carsNameList;
    private int racingCount;

    private InputException inputException;

    public UserInput(){
        inputException = new InputException();
    }

    public GameSettingsDto readUserGameSettingInput(){
        splitCarNameStringToList(readCarsName());
        readRacingCount();
        return new GameSettingsDto(carsNameList,racingCount);
    }
    private String readCarsName(){
        String carsName;
        InputView.getInstance().printCarNameInputPromptMessage();
        carsName = scanner.next();
        inputException.carsNameException(carsName);
        return carsName;
    }
    private void readRacingCount(){
        InputView.getInstance().printRacingCountInputPromptMessage();
        String racingCountInput = scanner.next();
        inputException.isVaildRacingCount(racingCountInput);
        racingCount = Integer.parseInt(racingCountInput); // int형으로 변환
    }
    private void splitCarNameStringToList(String carsName){
        carsNameList = List.of(carsName.split(",")); //자동차 이름을 불변리스트에 저장
    }
}
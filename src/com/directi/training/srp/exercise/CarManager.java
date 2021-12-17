package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private List<Car> _carsDb = Arrays.asList(
                new Car("1", "Golf III", "Volkswagen"),
                new Car("2", "Multipla", "Fiat"),
                new Car("3", "Megane", "Renault")
        );

    private CarDBManager _carDBManager = new CarDBManager();
    private CarDataManager _carDataManager = new CarDataManager();
    private CarSearchManager _carSearchManager = new CarSearchManager();

    public CarManager(CarDBManager carDBManager, CarSearchManager carSearchManager,CarDataManager carDataManager){
        _carDataManager = carDataManager;
        _carDBManager = carDBManager;
        _carSearchManager = carSearchManager;
    }
}

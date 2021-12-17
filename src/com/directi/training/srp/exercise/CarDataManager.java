package com.directi.training.srp.exercise;

import java.util.List;

public class CarDataManager {

    public String getCarsNames(List<Car> _carsDb)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}

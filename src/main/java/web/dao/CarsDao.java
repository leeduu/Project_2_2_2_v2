package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDao {

    private String model;
    private String color;
    private int number;
    ArrayList<Car> cars;

    public List<Car> showAllCars(ArrayList<Car> cars) {
        return cars;
    }

    public List<Car> showCars(ArrayList<Car> cars, int count) {
        List<Car> selectedCars = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            selectedCars.add(cars.get(i));
        }
        return selectedCars;
    }

    @Override
    public String toString() {
        return "Car " +
                "model is " + model +
                ", color is " + color +
                ", number is " + number + "\n";
    }
}

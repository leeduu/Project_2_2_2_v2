package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDao {

    private static String model;
    private static String color;
    private static int number;
    private ArrayList<Car> cars;

        {
            cars = new ArrayList<>();
            cars.add(new Car("Volvo", "grey", 123));
            cars.add(new Car("Peugeot", "blue", 456));
            cars.add(new Car("Volkswagen", "white", 789));
            cars.add(new Car("Renault", "black", 012));
            cars.add(new Car("Suzuki", "beige", 345));
        }

    public List<Car> showAllCars() {
        return cars;
    }

    public List<Car> showCars(int count) {
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

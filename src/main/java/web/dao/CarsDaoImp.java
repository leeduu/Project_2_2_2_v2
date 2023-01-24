package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDaoImp implements CarsDao {

    private ArrayList<Car> cars;

        {
            cars = new ArrayList<>();
            cars.add(new Car("Volvo", "grey", 123));
            cars.add(new Car("Peugeot", "blue", 456));
            cars.add(new Car("Volkswagen", "white", 789));
            cars.add(new Car("Renault", "black", 012));
            cars.add(new Car("Suzuki", "beige", 345));
        }

    public List<Car> showCars(int count) {
        List<Car> selectedCars = new ArrayList<>();
        if (count > 0 && count < 5) {
            selectedCars = cars.stream().limit(count).collect(Collectors.toList());
        }
        if (count == 0) {
        }
        if (count >= 5) {
            selectedCars = cars.stream().limit(count).collect(Collectors.toList());
        }
        return selectedCars;
    }

}

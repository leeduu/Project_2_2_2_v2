package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {

    List<Car> showAllCars();

    List<Car> showCars(int count);
}

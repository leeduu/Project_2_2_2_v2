package web.service;

import web.models.Car;

import java.util.List;

public interface CarsService {

    List<Car> showCars(int count);
}

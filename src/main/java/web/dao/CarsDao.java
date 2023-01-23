package web.dao;

import web.models.Car;

import java.util.List;

public interface CarsDao {

    List<Car> showAllCars();

    List<Car> showCars(int count);

}

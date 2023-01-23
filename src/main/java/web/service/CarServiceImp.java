package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final CarsDao carsDao;

    public CarServiceImp(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> showAllCars() {
        return carsDao.showAllCars();
    }

    @Override
    public List<Car> showCars(int count) {
        return carsDao.showCars(count);
    }

//    @Override
//    public String toString() {
//        return "Car " +
//                "model is " + model +
//                ", color is " + color +
//                ", number is " + number + "\n";
//    }
}

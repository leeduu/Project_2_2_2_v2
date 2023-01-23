package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.dao.CarsDaoImp;
import web.models.Car;

import java.util.List;

@Service
public class CarsServiceImp implements CarsService {

    private CarsDao carsDao = new CarsDaoImp();

    @Override
    public List<Car> showAllCars() {
        return carsDao.showAllCars();
    }

    @Override
    public List<Car> showCars(int count) {
        return carsDao.showCars(count);
    }

}

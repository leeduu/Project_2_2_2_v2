package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.models.Car;

import java.util.List;

@Service
public class CarsServiceImp implements CarsService {

    final CarsDao carsDao;

    public CarsServiceImp(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> showCars(int count) {
        return carsDao.showCars(count);
    }

}

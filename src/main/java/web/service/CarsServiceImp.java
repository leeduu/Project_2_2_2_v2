package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.dao.CarsDaoImp;
import web.models.Car;

import java.util.List;

@Repository
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

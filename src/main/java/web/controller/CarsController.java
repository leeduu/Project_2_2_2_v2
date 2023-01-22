package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDao;
import web.models.Car;

import java.util.ArrayList;

@Controller
public class CarsController {

    private final CarsDao carsDao;

    public CarsController(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @GetMapping(value = "/cars")
    public String showCarsByCount(Model carModel, @RequestParam(value = "count", required = false, defaultValue = "5") String count) {
        // Model - получение доступа к модели в контроллере

        ArrayList<Car> cars;

        {
            cars = new ArrayList<>();
            cars.add(new Car("Volvo", "grey", 123));
            cars.add(new Car("Peugeot", "blue", 456));
            cars.add(new Car("Volkswagen", "white", 789));
            cars.add(new Car("Renault", "black", 012));
            cars.add(new Car("Suzuki", "beige", 345));
        }

            switch(count) {
                case "1":
                    carModel.addAttribute("carsInfo", carsDao.showCars(cars, 1));
                    break;
                case "2":
                    carModel.addAttribute("carsInfo", carsDao.showCars(cars, 2));
                    break;
                case "3":
                    carModel.addAttribute("carsInfo", carsDao.showCars(cars, 3));
                    break;
                case "4":
                    carModel.addAttribute("carsInfo", carsDao.showCars(cars, 4));
                    break;
                default:
                    carModel.addAttribute("carsInfo", carsDao.showAllCars(cars));
                    break;
            }
            return "/cars";
    }
}


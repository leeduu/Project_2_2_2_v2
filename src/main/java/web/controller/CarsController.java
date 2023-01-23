package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDao;

@Controller
public class CarsController {

    private final CarsDao carsDao;

    public CarsController(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @GetMapping(value = "/cars")
    public String showCarsByCount(Model carModel, @RequestParam(value = "count", required = false, defaultValue = "5") String count) {
        // Model - получение доступа к модели в контроллере

        switch(count) {
            case "1", "2", "3", "4":
                carModel.addAttribute("carsInfo", carsDao.showCars(Integer.parseInt(count)));
                break;
//            case "2":
//                carModel.addAttribute("carsInfo", carsDao.showCars(2));
//                break;
//            case "3":
//                carModel.addAttribute("carsInfo", carsDao.showCars(3));
//                break;
//            case "4":
//                carModel.addAttribute("carsInfo", carsDao.showCars(4));
//                break;
            default:
                carModel.addAttribute("carsInfo", carsDao.showAllCars());
                break;
        }
        return "/cars";
    }
}


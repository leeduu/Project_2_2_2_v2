package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDaoImp;

@Controller
public class CarsController {

    private final CarsDaoImp carsDaoImp;

    public CarsController(CarsDaoImp carsDaoImp) {
        this.carsDaoImp = carsDaoImp;
    }

    @GetMapping(value = "/cars")
    public String showCarsByCount(Model carModel, @RequestParam(value = "count", required = false, defaultValue = "5") String count) {
        // Model - получение доступа к модели в контроллере

        switch(count) {
            case "1", "2", "3", "4":
                carModel.addAttribute("carsInfo", carsDaoImp.showCars(Integer.parseInt(count)));
                break;
            default:
                carModel.addAttribute("carsInfo", carsDaoImp.showAllCars());
                break;
        }
        return "/cars";
    }
}


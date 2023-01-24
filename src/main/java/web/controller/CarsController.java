package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDaoImp;
import web.service.CarsService;
import web.service.CarsServiceImp;

@Controller
public class CarsController {

    private final CarsService carsService;

    public CarsController(CarsServiceImp carsServiceImp) {
        this.carsService = carsServiceImp;
    }

    @GetMapping(value = "/cars")
    public String showCarsByCount(Model carModel, @RequestParam(value = "count", required = false, defaultValue = "5") String count) {
        // Model - получение доступа к модели в контроллере
        carModel.addAttribute("carsInfo", carsService.showCars(Integer.parseInt(count)));

        return "/cars";
    }
}


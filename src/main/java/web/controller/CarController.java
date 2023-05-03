package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCarsList(@RequestParam(value = "count", defaultValue = "5") String count, Model map) {
        map.addAttribute("carsTable",carService.getCars(Integer.parseInt(count)));
        return "cars";
    }
}

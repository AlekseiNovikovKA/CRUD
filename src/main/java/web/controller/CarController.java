package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiseImpl;

@Controller
public class CarController {
private CarService carService = new CarServiseImpl();
    @GetMapping(value = "/cars")
    public String carsPage(@RequestParam(value = "count", required = false) int count, ModelMap model) {
        model.addAttribute("car", carService.listCars(count));
        return "cars";
    }
    @GetMapping(value = "css/style.css")
    public String style () {
        return "css/style.css";
    }
}

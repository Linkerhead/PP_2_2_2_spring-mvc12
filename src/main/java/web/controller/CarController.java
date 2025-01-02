package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarSercvice;


@Controller
public class CarController {
    private CarSercvice carServiceImp;

    @Autowired
    public CarController(CarSercvice carServiceImp) {
        this.carServiceImp = carServiceImp;
    }


    @GetMapping("/cars")
    public String carShowing(@RequestParam(value = "count", required = false) Integer count, Model model) {
            model.addAttribute("cars", carServiceImp.getCars(count));
        return "cars";
    }


}

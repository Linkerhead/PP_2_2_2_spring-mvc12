package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarSercvice;


@Controller
public class CarController {
    private CarSercvice carServiceImp;

    @Autowired
    public CarController(CarSercvice carServiceImp) {
        this.carServiceImp = carServiceImp;
    }


    @GetMapping("/cars")
    public String carShowing(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null && count > 0 && count <= 5) {
            model.addAttribute("cars", carServiceImp.getCars(count));
        } else {
            model.addAttribute("cars", carServiceImp.getAllCars());
        }

        return "cars";
    }


}

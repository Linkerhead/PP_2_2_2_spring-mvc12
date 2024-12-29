package web.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarSercvice {

    private List<Car> cars;


    {
        cars = new ArrayList<>();
        Car car1 = new Car("bmw", "white", 2000);
        Car car2 = new Car("audi", "black", 1997);
        Car car3 = new Car("volvo", "green", 2014);
        Car car4 = new Car("MAN", "red", 2022);
        Car car5 = new Car("Subaru", "blue", 2006);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

    }
    @Override
    public List<Car> getCars(Integer count) {
        List<Car> res = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            res.add(cars.get(i));
        }
        return res;
    }

    @Override
    public List <Car> getAllCars() {
        return cars;
    }


}


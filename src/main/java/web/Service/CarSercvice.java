package web.Service;

import web.Model.Car;

import java.util.List;

public interface CarSercvice {
    public List<Car> getCars(Integer count);
    public List <Car> getAllCars();
}

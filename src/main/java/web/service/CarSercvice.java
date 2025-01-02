package web.service;

import web.model.Car;

import java.util.List;

public interface CarSercvice {
    public List<Car> getCars(Integer count);
}

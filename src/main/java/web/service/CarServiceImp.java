package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car("Honda", "NSX"));
        cars.add(new Car("Audi", "RS-6"));
        cars.add(new Car("Nissan", "Skyline"));
        cars.add(new Car("Toyota", "Mark-II"));
        cars.add(new Car("BMW", "M4"));
    }

    @Override
    public List<Car> getListCars(int count) {
        return cars.stream().limit(count).toList();
    }

    @Override
    public int getCarCount() {
        return cars.size();
    }

}

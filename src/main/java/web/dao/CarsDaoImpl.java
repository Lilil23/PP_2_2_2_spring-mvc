package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDaoImpl implements CarsDao {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BWM", "m5", 2018));
        cars.add(new Car("BMW", "m8", 2020));
        cars.add(new Car("Audi", "Q8", 2021));
        cars.add(new Car("Ford", "Mustang", 2019));
        cars.add(new Car("Porsche", "Taycan", 2021));
    }

    @Override
    public List<Car> getCars(int i) {
        return cars.stream().limit(i).collect(Collectors.toList());
    }
}


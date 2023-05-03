package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarsDaoImpl;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private final CarsDaoImpl carsDao;

    public CarServiceImpl(CarsDaoImpl carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> getCars(int i) {
        return carsDao.getCars(i);
    }
}

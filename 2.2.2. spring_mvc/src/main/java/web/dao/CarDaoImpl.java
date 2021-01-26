package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Ford", "Fiesta", 2001));
        cars.add(new Car("Kia", "Rio", 2017));
        cars.add(new Car("Audi", "Q7", 2015));
        cars.add(new Car("Honda", "Civic", 1995));
        cars.add(new Car("Reno", "Logan", 2005));
    }

    public List<Car> getCars(Integer count) {
        if (count == null) {
            return cars;
        }
        return count < 5 ? cars.stream().limit(count).collect(Collectors.toList()) : cars;
    }

}

package web.service;

import web.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiseImpl implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", 96, "001"  ));
        carList.add(new Car("VOLVO", 72, "728"  ));
        carList.add(new Car("SEAT", 196, "998"  ));
        carList.add(new Car("LADA", 777, "233"  ));
        carList.add(new Car("RENO", 56, "192"  ));

    }
    @Override
    public List<Car> listCars(int count) {
        if (count >=0 && count <5 ) {
            return carList.stream().limit(count).toList();
        }
            return carList;
    }

}

package com.oracle.rent.car.repository;

import com.oracle.rent.car.domain.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.oracle.rent.car.repository
 * fileName       : CarRepository
 * author         : Yeong-Huns
 * date           : 2024-04-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11        Yeong-Huns       최초 생성
 */
public class CarRepository {
    private final List<Car> cars = new ArrayList<>();
    private static CarRepository instance;
    private static CarRepository getInstance(){
        if(instance == null){
            instance = new CarRepository();
            return instance;
        }
        return instance;
    };
    public void save(Car car){
        cars.add(car);
    }

}

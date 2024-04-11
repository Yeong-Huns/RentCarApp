package com.oracle.rent.car.service;

import com.oracle.rent.car.dto.request.RegCarRequest;
import com.oracle.rent.car.repository.CarRepository;

/**
 * packageName    : com.oracle.rent.car.service
 * fileName       : CarService
 * author         : Yeong-Huns
 * date           : 2024-04-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11        Yeong-Huns       최초 생성
 */
public class CarService {
    private final CarRepository carRepository;
    private static CarService instance;
    public static CarService getInstance() {
        if (instance == null) {
            instance = new CarService();
            return instance;
        }
        return instance;
    }
    private CarService() {
        carRepository = new CarRepository();
    }
    public void registerCar(RegCarRequest request){
        carRepository.save(request.toEntity());
    }
    public void checkCarInfo(){

    }
    public void modCarInfo(){

    }
    public void delCarInfo(){

    }
}

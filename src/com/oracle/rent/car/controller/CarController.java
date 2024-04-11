package com.oracle.rent.car.controller;

import com.oracle.rent.car.dto.request.RegCarRequest;
import com.oracle.rent.car.service.CarService;

/**
 * packageName    : com.oracle.rent.car.Controller
 * fileName       : CarController
 * author         : Yeong-Huns
 * date           : 2024-04-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11        Yeong-Huns       최초 생성
 */
public class CarController {
    private final CarService carService;
    private static CarController instance;
    private static CarController getInstance(){
        if(instance == null) {
            instance = new CarController();
            return instance;
        }
        return CarController.getInstance();
    }
    private CarController() {
        carService = CarService.getInstance();
    }

    public void registerCar(RegCarRequest request) {
        carService.registerCar(request);
    }
}

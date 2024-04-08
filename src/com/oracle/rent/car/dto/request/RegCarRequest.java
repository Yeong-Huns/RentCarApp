package com.oracle.rent.car.dto.request;

import com.oracle.rent.car.domain.Car;
import lombok.Builder;

/**
 * packageName    : com.oracle.rent.car.dto
 * fileName       : RegCarRequest
 * author         : Yeong-Huns
 * date           : 2024-04-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-06        Yeong-Huns       최초 생성
 */
@Builder
public record RegCarRequest(String carNumber,
                            String carName,
                            String carColor,
                            int carSize,
                            String carMaker) {
    public Car toEntity(){
        return Car.builder()
                .carNumber(carNumber)
                .carName(carName)
                .carColor(carColor)
                .carSize(carSize)
                .carMaker(carMaker)
                .build();
    }
}

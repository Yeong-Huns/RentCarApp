package com.oracle.rent.car.domain;

import com.oracle.rent.common.Base;
import lombok.Builder;
import lombok.Getter;

/**
 * packageName    : com.oracle.rent.car
 * fileName       : Car
 * author         : Yeong-Huns
 * date           : 2024-04-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-04        Yeong-Huns       최초 생성
 */
@Getter
public class Car extends Base {
    private String carNumber;
    private String carName;
    private String carColor;
    private int carSize;
    private String carMaker;

    @Builder
    public Car(String carNumber, String carName, String carColor, int carSize, String carMaker) {
        System.out.println("\n차 정보를 등록합니다. ");
        System.out.println("차량 등록 시간 : " + showTime());
        this.carNumber = carNumber;
        this.carName = carName;
        this.carColor = carColor;
        this.carSize = carSize;
        this.carMaker = carMaker;
    }

    public String checkCarInfo(){
        System.out.println("\n렌터카 정보를 조회합니다.");
        System.out.println("렌터카 조회 시간 : " + showTime());
        System.out.println("-----------------------");
        return "차 번호: " + carNumber
                +"\n차 이름: " + carName
                +"\n차 색상: " + carColor
                +"\n차 크기: " + carSize
                +"\n차 제조사: " + carMaker;
    }

    public void modCarInfo(){
        System.out.println("\n렌터카 정보를 수정합니다. ");
        System.out.println("렌터카 정보 수정 시간 : " + showTime());
    }
    public void delCarInfo(){
        System.out.println("\n렌터카 정보를 삭제합니다.");
        System.out.println("렌터카 정보 삭제 시간 : " + showTime());
    }
}

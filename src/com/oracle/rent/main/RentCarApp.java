package com.oracle.rent.main;

import com.oracle.rent.car.Car;
import com.oracle.rent.member.Member;
import com.oracle.rent.res.Reserve;

/**
 * packageName    : com.oracle.rent.main
 * fileName       : RentCarApp
 * author         : Yeong-Huns
 * date           : 2024-04-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-04        Yeong-Huns       최초 생성
 */
public class RentCarApp {
    public static void main(String[] args) {
        Member member = new Member();
        Car car = new Car();
        Reserve reserve = new Reserve();

        member.regMember("lee", "1234", "이순신", "서울시 도봉구", "010-1111-2222");
        car.regCarInfo("11가 1111", "소나타", "검정", 2000, "현대");
        reserve.resCar("20220708-0001", "11가 1111", "2022-04-30", "2022-05-01", "2022-05-08");
        // 회원 정보 조회
        System.out.println(member.viewMember());

        //예약 정보 조회
        System.out.println(reserve.checkResInfo());
    }
}

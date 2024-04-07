package com.oracle.rent.main;

import com.oracle.rent.car.domain.Car;
import com.oracle.rent.car.dto.request.RegCarRequest;
import com.oracle.rent.member.domain.Member;
import com.oracle.rent.member.dto.RegMemberRequest;
import com.oracle.rent.res.domain.Reserve;
import com.oracle.rent.res.dto.RegReserveRequest;

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
        Car car = new RegCarRequest("11가 1111",
                "소나타",
                "검정",
                2000,
                "현대")
                .toEntity();
        Member member = new RegMemberRequest("lee",
                "1234",
                "이순신",
                "서울시 도봉구",
                "010-1111-2222")
                .toEntity();
        Reserve reserve = new RegReserveRequest("20220708-0001",
                "11가 1111",
                "2022-04-30",
                "2022-05-01",
                "2022-05-08")
                .toEntity();
        // 회원 정보 조회
        System.out.println(member.viewMember());
        //예약 정보 조회
        System.out.println(reserve.checkResInfo());
        // 자동차 정보 조회
        System.out.println(car.checkCarInfo());
    }
}

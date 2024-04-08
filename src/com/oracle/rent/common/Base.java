package com.oracle.rent.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * packageName    : com.oracle.rent.common
 * fileName       : Base
 * author         : Yeong-Huns
 * date           : 2024-04-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-08        Yeong-Huns       최초 생성
 */
public class Base {
    public void displayData(String data){
        System.out.println("조회한 데이터는 " + data + "입니다. ");
    }
    // 조회한 데이터의 시간 정보를 제공하는 메서드
    public String showTime(){
        String data = null;
        String time = null;
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
    }
}

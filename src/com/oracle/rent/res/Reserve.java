package com.oracle.rent.res;

import lombok.Builder;
import lombok.Getter;

/**
 * packageName    : com.oracle.rent.res
 * fileName       : Reserve
 * author         : Yeong-Huns
 * date           : 2024-04-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-04        Yeong-Huns       최초 생성
 */
@Getter
public class Reserve {
    private String resNumber;
    private String resCarNumber;
    private String resDate;
    private String useBeginDate;
    private String useEndDate;

    public Reserve() {
    }
    @Builder
    public Reserve(String resNumber,
                   String resCarNumber,
                   String resDate,
                   String useBeginDate,
                   String useEndDate) {
        this.resNumber = resNumber;
        this.resCarNumber = resCarNumber;
        this.resDate = resDate;
        this.useBeginDate = useBeginDate;
        this.useEndDate = useEndDate;
    }

    //차 예약 정보 조회 기능
    public String checkResInfo(){
        System.out.println("\n차 예약 정보를 조회합니다.");
        System.out.println("------------------------");
        return "예약 번호: "+ resNumber
                +"\n예약 차 번호: "+ resCarNumber
                +"\n예약일자: "+ resDate
                +"\n차 사용 시작 일자: "+ useBeginDate
                +"\n차 반납 예정 일자: "+ useEndDate;
    }

    public void resCar(String resNumber,
                       String resCarNumber,
                       String resDate,
                       String useBeginDate,
                       String useEndDate){
        System.out.println("차 예약 정보를 등록합니다.");
        this.resNumber = resNumber;
        this.resCarNumber= resCarNumber;
        this.resDate= resDate;
        this.useBeginDate = useBeginDate;
        this.useEndDate = useEndDate;
    }

    public void modResInfo(){
        System.out.println("\n차 예약 정보를 수정합니다.");
    }
    public void cancelResInfo(){
        System.out.println("\n차 예약을 취소합니다.");
    }
}

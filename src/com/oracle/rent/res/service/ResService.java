package com.oracle.rent.res.service;

import com.oracle.rent.res.dto.RegReserveRequest;
import com.oracle.rent.res.repository.ResRepository;

/**
 * packageName    : com.oracle.rent.res.service
 * fileName       : ResService
 * author         : Yeong-Huns
 * date           : 2024-04-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11        Yeong-Huns       최초 생성
 */
public class ResService {
    private final ResRepository resRepository;
    private static ResService instance;
    public static ResService getInstance() {
        if (instance == null) {
            instance = new ResService();
            return instance;
        }
        return instance;
    }
    private ResService() {
        resRepository = new ResRepository();
    }
    public void registerReserve(RegReserveRequest request){
        resRepository.save(request.toEntity());
    }
    public void modResInfo(){
        //System.out.println("\n차 예약 정보를 수정합니다.");
        //System.out.println("예약 수정 시간 : " + showTime());
    }
    public void cancelResInfo(){

        //System.out.println("\n차 예약을 취소합니다.");
        //System.out.println("예약 등록 시간 : " + showTime());
    }

}

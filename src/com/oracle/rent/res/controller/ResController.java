package com.oracle.rent.res.controller;

import com.oracle.rent.res.dto.RegReserveRequest;
import com.oracle.rent.res.service.ResService;

/**
 * packageName    : com.oracle.rent.res.controller
 * fileName       : ResController
 * author         : Yeong-Huns
 * date           : 2024-04-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11        Yeong-Huns       최초 생성
 */
public class ResController {
    private final ResService resService;
    private static ResController instance;
    private static ResController getInstance(){
        if(instance == null) {
            instance = new ResController();
            return instance;
        }
        return ResController.getInstance();
    }
    private ResController() {
        resService = ResService.getInstance();
    }

    public void registerReserve(RegReserveRequest request) {
        resService.registerReserve(request);
    }
}

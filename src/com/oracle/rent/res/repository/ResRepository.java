package com.oracle.rent.res.repository;

import com.oracle.rent.res.domain.Reserve;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.oracle.rent.res.repository
 * fileName       : ResRepository
 * author         : Yeong-Huns
 * date           : 2024-04-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11        Yeong-Huns       최초 생성
 */
public class ResRepository {
    private final List<Reserve> reserves = new ArrayList<>();
    private static ResRepository instance;
    private static ResRepository getInstance(){
        if(instance == null){
            instance = new ResRepository();
            return instance;
        }
        return instance;
    };
    public void save(Reserve reserve){
        reserves.add(reserve);
    }
    public void checkResInfo(){

    }
    public void modResInfo(){

    }
    public void cancelResInfo(){

    }
}

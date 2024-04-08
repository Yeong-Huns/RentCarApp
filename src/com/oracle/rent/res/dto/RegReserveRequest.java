package com.oracle.rent.res.dto;

import com.oracle.rent.res.domain.Reserve;

/**
 * packageName    : com.oracle.rent.res.dto
 * fileName       : RegCarRequest
 * author         : Yeong-Huns
 * date           : 2024-04-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-07        Yeong-Huns       최초 생성
 */
public record RegReserveRequest(String resNumber,
                                String resCarNumber,
                                String resDate,
                                String useBeginDate,
                                String useEndDate) {
    public Reserve toEntity(){
        return Reserve.builder()
                .resNumber(this.resNumber)
                .resCarNumber(this.resCarNumber)
                .resDate(this.resDate)
                .useBeginDate(this.useBeginDate)
                .useEndDate(this.useEndDate)
                .build();
    }
}

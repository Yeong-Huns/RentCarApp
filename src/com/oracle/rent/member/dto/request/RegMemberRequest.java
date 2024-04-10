package com.oracle.rent.member.dto.request;

import com.oracle.rent.member.domain.Member;

/**
 * packageName    : com.oracle.rent.member.dto
 * fileName       : RegMemberRequest
 * author         : Yeong-Huns
 * date           : 2024-04-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-06        Yeong-Huns       최초 생성
 */
public record RegMemberRequest(String id, String password, String name, String address, String phoneNum) {
    public Member toEntity(){
        return Member.builder()
                .id(id)
                .password(password)
                .name(name)
                .address(address)
                .phoneNum(phoneNum)
                .build();
    }
}

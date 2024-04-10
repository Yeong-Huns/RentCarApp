package com.oracle.rent.member.dto.response;

import com.oracle.rent.member.domain.Member;
import lombok.Builder;

/**
 * packageName    : com.oracle.rent.member.dto.response
 * fileName       : RegMemberResponse
 * author         : Yeong-Huns
 * date           : 2024-04-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-10        Yeong-Huns       최초 생성
 */
@Builder
public record RegMemberResponse(String id, String password, String name, String address, String phoneNum) {
    public static RegMemberResponse from(Member member) {
        return RegMemberResponse.builder()
                .id(member.getId())
                .password(member.getPassword())
                .name(member.getName())
                .address(member.getAddress())
                .phoneNum(member.getPhoneNum())
                .build();

    }
}

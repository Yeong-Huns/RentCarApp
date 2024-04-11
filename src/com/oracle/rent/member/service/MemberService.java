package com.oracle.rent.member.service;

import com.oracle.rent.member.dto.request.RegMemberRequest;
import com.oracle.rent.member.repository.MemberRepository;

/**
 * packageName    : com.oracle.rent.member.service
 * fileName       : MemberService
 * author         : Yeong-Huns
 * date           : 2024-04-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-10        Yeong-Huns       최초 생성
 */
public class MemberService {
    private final MemberRepository memberRepository;
    private static MemberService instance;
    public static MemberService getInstance() {
        if (instance == null) {
            instance = new MemberService();
            return instance;
        }
        return instance;
    }
    private MemberService() {
        memberRepository = new MemberRepository();
    }
    public void saveMember(RegMemberRequest request){
        memberRepository.save(request.toEntity());
    }
    public void viewMember(){

    }
    public void modMember(){

    }
    public void delMember(){

    }
}

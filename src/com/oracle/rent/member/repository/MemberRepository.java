package com.oracle.rent.member.repository;

import com.oracle.rent.member.domain.Member;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.oracle.rent.member.repository
 * fileName       : MemberRepository
 * author         : Yeong-Huns
 * date           : 2024-04-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-10        Yeong-Huns       최초 생성
 */
public class MemberRepository {
    private final List<Member> members = new ArrayList<>();
    private static MemberRepository instance;
    private static MemberRepository getInstance(){
        if(instance == null){
            instance = new MemberRepository();
            return instance;
        }
        return instance;
    };
    public void save(Member member){
        members.add(member);
    }
}

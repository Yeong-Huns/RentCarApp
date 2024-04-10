package com.oracle.rent.member.service;

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
    private static MemberService instance = null;
    private MemberService() {}
    public static MemberService getInstance() {
        if (instance == null) {
            return new MemberService();
        }
        return instance;
    }
}

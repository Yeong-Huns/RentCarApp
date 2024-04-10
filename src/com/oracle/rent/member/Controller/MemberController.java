package com.oracle.rent.member.Controller;

/**
 * packageName    : com.oracle.rent.member.Controller
 * fileName       : MemberController
 * author         : Yeong-Huns
 * date           : 2024-04-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-10        Yeong-Huns       최초 생성
 */
public class MemberController {
    private static MemberController instance = null;
    private MemberController() {}
    private static MemberController getInstance(){
        if(instance == null) return new MemberController();
        return MemberController.getInstance();
    }

}

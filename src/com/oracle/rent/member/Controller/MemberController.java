package com.oracle.rent.member.Controller;

import com.oracle.rent.member.domain.Member;
import com.oracle.rent.member.dto.request.RegMemberRequest;
import com.oracle.rent.member.service.MemberService;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

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
    private final MemberService memberService;
    private static MemberController instance;
    private static MemberController getInstance(){
        if(instance == null) {
            instance = new MemberController();
            return instance;
        }
        return MemberController.getInstance();
    }
    private MemberController() {
        memberService = MemberService.getInstance();
    }

    public void saveMember(RegMemberRequest request) {
        memberService.saveMember(request);
    }
}

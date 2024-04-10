package com.oracle.rent.member.domain;

import com.oracle.rent.common.Base;
import lombok.Builder;
import lombok.Getter;

/**
 * packageName    : com.oracle.rent.member
 * fileName       : Member
 * author         : Yeong-Huns
 * date           : 2024-04-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-04        Yeong-Huns       최초 생성
 */
@Getter
public class Member extends Base {
    private String id;
    private String password;
    private String name;
    private String address;
    private String phoneNum;

    public Member() {
    }
    @Builder
    public Member(String id, String password, String name, String address, String phoneNum) {
        System.out.println("\n회원 가입합니다. ");
        System.out.println("회원 가입 시간 : " + showTime());
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    //회원 정보 조회
    public String viewMember(){
        System.out.println("\n회원 정보를 조회합니다.");
        System.out.println("회원 조회 시간 : " + showTime());
        System.out.println("---------------------");
        return  "아이디: "+ id
                +"\n비밀번호: "+ password
                +"\n이름: "+ name
                +"\n주소: "+address
                +"\n전화번호: "+phoneNum;

    }

    // 회원 정보 수정
    public void modMember(){
        System.out.println("\n회원 정보를 수정합니다.");
        System.out.println("회원 수정 시간 : " + showTime());
    }

    public void delMember(){
        System.out.println("\n회원 정보를 삭제합니다.");
        System.out.println("회원 삭제 시간: " + showTime());
    }

}

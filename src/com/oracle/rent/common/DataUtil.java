package com.oracle.rent.common;

/**
 * packageName    : com.oracle.rent.common
 * fileName       : DataUtil
 * author         : Yeong-Huns
 * date           : 2024-04-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-10        Yeong-Huns       최초 생성
 */
public class DataUtil {
    public static void encodeData(String data){
      System.out.println("\n" +data + "를 암호화 합니다!");
    };

    public static void decodeData(String data){
        System.out.println("\n" + data + "를 복호화합니다.");
    }

}

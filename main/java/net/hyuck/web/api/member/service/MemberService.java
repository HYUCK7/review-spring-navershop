package net.hyuck.web.api.member.service;


import net.hyuck.web.api.member.domain.CalcDTO;
import net.hyuck.web.api.member.domain.MemberDTO;

/**
 * packageName: net.hyuck.web.api.member.service
 * fileName   : MemberService
 * author     : HYUCK7
 * date       : 2022/02/13
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/13         HYUCK7         최초 생성
 */

public interface MemberService {


    String bmi(MemberDTO bmi);

    String login(MemberDTO login);

    String calc(CalcDTO calc);

    String grade(MemberDTO grade);
}

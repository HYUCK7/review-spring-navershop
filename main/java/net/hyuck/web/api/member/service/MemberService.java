package net.hyuck.web.api.member.service;

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
    String memberList();
    String memberInfo();
    String checkList();
    String regSendEmail();
    String saveMoneyList();
    String checkSavings();
    String save();
    String delete();
}

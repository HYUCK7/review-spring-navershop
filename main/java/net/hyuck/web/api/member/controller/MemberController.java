package net.hyuck.web.api.member.controller;

import lombok.Generated;
import lombok.RequiredArgsConstructor;
import net.hyuck.web.api.member.domain.CalcDTO;
import net.hyuck.web.api.member.domain.MemberDTO;
import net.hyuck.web.api.member.service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: net.hyuck.web.api.member.controller
 * fileName   : MemberController
 * author     : HYUCK7
 * date       : 2022/02/26
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/26         HYUCK7         최초 생성
 */
@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService service;

    public String calc(CalcDTO calc) {
        return null;
    }
    public String grade(MemberDTO member){
        return null;
    }
    public String login(MemberDTO member){
        return null;
    }

}

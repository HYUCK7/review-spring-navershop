package net.hyuck.web.api.member.controller;


import lombok.RequiredArgsConstructor;
import net.hyuck.web.api.member.domain.CalcDTO;
import net.hyuck.web.api.member.domain.MemberDTO;
import net.hyuck.web.api.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

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
@RequiredArgsConstructor
@RestController
@RequestMapping("/member")
public class MemberController {
    private final MemberService service;
    @PostMapping("/bmi")
    public String getBmi(@RequestBody MemberDTO bmi){
        return service.bmi(bmi);
    }
    public String getLogin(@RequestBody MemberDTO login){
        return service.login(login);
    }
    public String getCalc(@RequestBody CalcDTO calc){

        return service.calc(calc);
    }
    public String getGrade(@RequestBody MemberDTO grade){
        return service.grade(grade);
    }


}

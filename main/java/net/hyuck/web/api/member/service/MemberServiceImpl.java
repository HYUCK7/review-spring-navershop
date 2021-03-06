package net.hyuck.web.api.member.service;


import lombok.RequiredArgsConstructor;
import net.hyuck.web.api.member.domain.CalcDTO;
import net.hyuck.web.api.member.domain.MemberDTO;
import net.hyuck.web.api.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

/**
 * packageName: net.hyuck.web.api.member.service
 * fileName   : MemberServiceImpl
 * author     : HYUCK7
 * date       : 2022/02/13
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/13         HYUCK7         최초 생성
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository repository;


    @Override
    public String bmi(MemberDTO bmi) {

        return bmi.getName() + bmi.getHeight() + bmi.getWeight();
    }

    @Override
    public String login(MemberDTO login) {
        return null;
    }

    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String grade(MemberDTO grade) {
        return null;
    }
}

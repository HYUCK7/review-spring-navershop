package net.hyuck.web.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: net.hyuck.web.api.member.domain
 * fileName   : CalcDTO
 * author     : HYUCK7
 * date       : 2022/02/26
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/26         HYUCK7         최초 생성
 */
@Data
@Component
public class CalcDTO {
    int num1;
    int num2;
    String opcode;
}

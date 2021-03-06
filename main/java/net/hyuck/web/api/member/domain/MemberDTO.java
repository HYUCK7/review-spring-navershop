package net.hyuck.web.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: net.hyuck.web.api.member.domain
 * fileName   : memberDTO
 * author     : HYUCK7
 * date       : 2022/02/13
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/13         HYUCK7         최초 생성
 */
@Data
@Component
public class MemberDTO {
    private String name;
    private double weight;
    private double height;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private int avg;


}

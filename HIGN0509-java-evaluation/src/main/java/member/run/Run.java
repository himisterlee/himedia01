package member.run;

import member.controller.MemberRepository;
import member.controller.OverMemberException;
import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;

public class Run {
    public static void main(String[] args) {
        MemberRepository memberRepository = new MemberRepository();
        try {
            memberRepository.insertMember(new Silver("홍길동", "Silver", 1000));
        } catch (OverMemberException e) {
            throw new RuntimeException(e);
        }
        try {
            memberRepository.insertMember(new Silver("고길동", "Silver", 2000));
        } catch (OverMemberException e) {
            throw new RuntimeException(e);
        }
        try {
            memberRepository.insertMember(new Silver("홍동민", "Silver", 3000));
        } catch (OverMemberException e) {
            throw new RuntimeException(e);
        }
        try {
            memberRepository.insertMember(new Gold("김회장", "Gold", 1000));
        } catch (OverMemberException e) {
            throw new RuntimeException(e);
        }
        try {
            memberRepository.insertMember(new Gold("이회장", "Gold", 2000));
        } catch (OverMemberException e) {
            throw new RuntimeException(e);
        }
        try {
            memberRepository.insertMember(new Gold("오회장", "Gold", 3000));
        } catch (OverMemberException e) {
            throw new RuntimeException(e);
        }
        try {
            memberRepository.insertMember(new Vip("이순신", "Vip", 10000));
        } catch (OverMemberException e) {
            throw new RuntimeException(e);
        }



//        System.out.println("=========================== 회원 포인트 적립 정보 ===========================");
//        memberRepository.printData();
    }
}

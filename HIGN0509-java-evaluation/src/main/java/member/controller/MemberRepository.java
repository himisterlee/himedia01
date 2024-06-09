package member.controller;

import member.model.vo.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository extends Exception{
    private List<Member> memberList = new ArrayList<>(10);

    public MemberRepository() {
    }

    public void insertMember(Member m) throws OverMemberException {

        memberList.add(m);

        if(memberList.size() > 10) {
            throw new OverMemberException("Member List is full");
        }

    }

    public void printData() {

        for(Member m : memberList) {
            System.out.println(m.getGrade() + " 등급 회원 " + m.getName() + "의 포인트는 " + m.getPoint() + "이고, 이자 포인트는 " + m.calculateInterest() + "입니다.");
        }
    }


}

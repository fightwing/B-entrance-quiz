package com.thoughtworks.capability.gtb.entrancequiz.Service;

import com.thoughtworks.capability.gtb.entrancequiz.Dto.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    public static final List<Member> members = new ArrayList<>();

    public static  int START_ID = 1;

    public List<Member> addMember(Member member){
        member.setId(START_ID);
        START_ID++;
        members.add(member);
        return members;
    }

    public List<Member> getMembers(){
        return members;
    }
}

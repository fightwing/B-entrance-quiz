package com.thoughtworks.capability.gtb.entrancequiz.Service;

import com.thoughtworks.capability.gtb.entrancequiz.Dto.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
//TODO GTB-知识点: * 了解下三层架构
//TODO GTB-知识点: - MemberService.java:11 数据存储相关的操作，不属于service的职责，应该抽取repository层做
    public static final List<Member> members = new ArrayList<>();

    public static  int START_ID = 1;

    public List<Member> initMembers(){
        List<Member> members = new ArrayList<>();
        members.add(new Member(1,"成吉思汗"));
        members.add(new Member(1,"鲁班七号"));
        members.add(new Member(1,"太乙真人"));
        members.add(new Member(1,"钟无艳"));
        members.add(new Member(1,"花木兰"));
        members.add(new Member(1,"雅典娜"));
        members.add(new Member(1,"芈月"));
        members.add(new Member(1,"白起"));
        members.add(new Member(1,"刘禅"));
        members.add(new Member(1,"庄周"));
        members.add(new Member(1,"马超"));
        members.add(new Member(1,"刘备"));
        members.add(new Member(1,"哪吒"));
        members.add(new Member(1,"大乔"));
        members.add(new Member(1,"蔡文姬"));
        return members;
    }

    public List<Member> addMember(Member member){
        member.setId(START_ID);
        //TODO GTB-工程实践: - MemberService.java:39 这种i++的自增id的方式存在线程安全问题，内存中自增可以试试AtomicInteger
        START_ID++;
        members.add(member);
        return members;
    }

    public List<Member> getMembers(){
        return initMembers();
    }
}

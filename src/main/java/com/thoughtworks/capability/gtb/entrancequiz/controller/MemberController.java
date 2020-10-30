package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.Dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.thoughtworks.capability.gtb.entrancequiz.Service.MemberService;

import java.util.List;

@CrossOrigin
@RestController
public class MemberController {
    //TODO GTB-知识点: - MemberController.java:14 建议Ioc容器管理的bean之间的注入，使用构造器注入
    @Autowired
    MemberService memberService;

    @PostMapping("/member")
    public ResponseEntity<List<Member>> addMember(@RequestBody Member member){
        return ResponseEntity.ok(memberService.addMember(member));
    }

    //TODO GTB-完成度: - MemberController.java:23 bug，所有的id均为1
    //TODO GTB-完成度: - MemberController.java:24 bug，新增的member无法显示出来
    @GetMapping("/members")
    public ResponseEntity<List<Member>> getMembers(){
        return ResponseEntity.ok(memberService.getMembers());
    }
}

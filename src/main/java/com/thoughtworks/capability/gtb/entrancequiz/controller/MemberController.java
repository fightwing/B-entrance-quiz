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

    @Autowired
    MemberService memberService;

    @PostMapping("/member")
    public ResponseEntity<List<Member>> addMember(@RequestBody Member member){
        return ResponseEntity.ok(memberService.addMember(member));
    }

    @GetMapping("/members")
    public ResponseEntity<List<Member>> getMembers(){
        return ResponseEntity.ok(memberService.getMembers());
    }
}

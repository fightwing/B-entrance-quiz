package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.Dto.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.thoughtworks.capability.gtb.entrancequiz.Service.MemberService;
import com.thoughtworks.capability.gtb.entrancequiz.Service.TeamService;

import java.util.List;

public class TeamController {

    @Autowired
    TeamService teamService;

    @Autowired
    MemberService memberService;

    @GetMapping("/list")
    public ResponseEntity<List<Team>> teamList(){
        return ResponseEntity.ok(teamService.divideIntoTeams(memberService.getMembers()));
    }
}

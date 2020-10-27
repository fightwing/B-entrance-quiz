package controller;

import Dto.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.MemberService;
import service.TeamService;

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

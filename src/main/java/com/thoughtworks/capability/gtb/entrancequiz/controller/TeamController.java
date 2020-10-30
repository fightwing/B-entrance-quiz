package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.Dto.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.thoughtworks.capability.gtb.entrancequiz.Service.MemberService;
import com.thoughtworks.capability.gtb.entrancequiz.Service.TeamService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//TODO GTB-完成度: - TeamController.java:12 缺少查询分组的接口
//TODO GTB-综合: + TeamController.java:13 有意识的将member和team两个资源
//TODO GTB-知识点: - TeamController.java:14  controller未加@RestController
@RestController
public class TeamController {

    @Autowired
    TeamService teamService;

    @Autowired
    MemberService memberService;
    //TODO GTB-知识点: * 了解下restful命名规范
    //TODO GTB-知识点: - TeamController.java:22 根据restful规范，path中的名词，一般是指定资源的名词
    //TODO GTB-完成度: - TeamController.java:27 无法进行分组
    //TODO GTB-完成度: - TeamController.java:26 bug，新增的member，无法进行分组
    @GetMapping("/list")
    //TODO GTB-知识点: * 如果不是特定的自定义返回结果，ResponseEntity可以省略
    public ResponseEntity<List<Team>> teamList(){
        return ResponseEntity.ok(teamService.divideIntoTeams(memberService.getMembers()));
    }
}

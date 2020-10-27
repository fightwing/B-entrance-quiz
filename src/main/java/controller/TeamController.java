package controller;

import Dto.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class TeamController {

    @GetMapping("/list")
    public ResponseEntity<List<Team>> teamList(){
        return ResponseEntity.ok(null);
    }
}

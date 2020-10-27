package service;

import Dto.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    public static final List<Team> teams = new ArrayList<>();

    public List<Team> getTeams(){
        return teams;
    }


}

package com.thoughtworks.capability.gtb.entrancequiz.Service;

import com.thoughtworks.capability.gtb.entrancequiz.Dto.Member;
import com.thoughtworks.capability.gtb.entrancequiz.Dto.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class TeamService {

    public static final int NUMBER_OF_TEAMS = 6;

    public static final List<Team> teams = new ArrayList<>();

    public List<Team> divideIntoTeams(List<Member> members){
        //TODO GTB-知识点: * 打乱顺序可以了解下Collections.shuffle()
        Random random = new Random();
        for (int i = 0;i<members.size();i++){
            List<Member> mockMembers = members;
            int randomId = random.nextInt(mockMembers.size());
            teams.get(i%NUMBER_OF_TEAMS).getMembers().add(mockMembers.get(randomId));
            mockMembers.remove(randomId);
        }
        return teams;
    }

}

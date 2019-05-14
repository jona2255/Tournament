package com.company.view.TEAM;

import com.company.manager.TeamManager;
import com.company.model.Team;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ListTeamStage {

    Scanner scanner = new Scanner(System.in);

    void show() throws IOException {

        System.out.println("LISTAAAAA");

        List<Team> teams = TeamManager.getTeams();

        for(Team team : teams){
            System.out.println(team.id + " " + team.nombre);
        }
    }
}

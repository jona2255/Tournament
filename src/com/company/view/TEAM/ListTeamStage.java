package com.company.view.TEAM;

import com.company.manager.TeamManager;
import com.company.model.Team;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ListTeamStage {

    Scanner scanner = new Scanner(System.in);

    void show() throws IOException {

        System.out.println("LISTA:");

        List<Team> teams = TeamManager.getTeams();

        for(Team team : teams){
            System.out.println("Id:" + team.id + "  " + "Nombre:" + team.nombre+ "  " + "Siglas:" + team.siglas + "  " + "Ciudad:" + team.siglas);
        }
    }
}

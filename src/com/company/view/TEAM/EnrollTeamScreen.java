package com.company.view.TEAM;

import com.company.manager.TeamManager;
import com.company.model.Team;

import java.io.IOException;
import java.util.Scanner;

public class EnrollTeamScreen {

    Scanner scanner = new Scanner(System.in);


    void show() throws IOException {

        Team team = new Team();
        TeamManager teamManager = new TeamManager();

        System.out.println("INSCRIBIR EQUIPO");

        System.out.println("Nombre Equipo:");
        team.nombre = scanner.nextLine();

        System.out.println("Nombre siglas:");
        team.siglas = scanner.nextLine();

        System.out.println("Nombre ciudad:");
        team.ciudad = scanner.nextLine();

        teamManager.id(team);
        //  NOOOO        ManagerEquipos.inscribir(equipo, ciudad, siglas);

        TeamManager.createTeam(team);


//        Pides nº equipos;
//
//        for (i=0; i<ne; i++){
//
//            pides datos;
//
//
//            pasas al fichero (escribes);
//
//
//            Se sobrescribe las variables;
//
//        }



    }
}

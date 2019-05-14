package com.company.view.TEAM;

import com.company.manager.TeamManager;
import com.company.model.Team;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EnrollTeamScreen {

    Scanner scanner = new Scanner(System.in);
    private File file = new File("Temadades.txt");

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

        teamManager.id(team, file);
        //  NOOOO        ManagerEquipos.inscribir(equipo, ciudad, siglas);

        TeamManager.createTeam(team, file);

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

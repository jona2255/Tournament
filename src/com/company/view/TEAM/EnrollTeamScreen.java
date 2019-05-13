package com.company.view.TEAM;

import com.company.manager.TeamManager;
import com.company.model.Team;

import java.util.Scanner;

public class EnrollTeamScreen {

    Scanner scanner = new Scanner(System.in);


    void show(){

        Team team = new Team();

        System.out.println("INSCRIBIR EQUIPO");

        System.out.println("Nombre Equipo:");
        team.nombre = scanner.nextLine();

        System.out.println("Nombre idEquipo:");
        team.siglas = scanner.nextLine();

        System.out.println("Nombre nombreEquipo:");
        team.ciudad = scanner.nextLine();

        team.id++;
        //  NOOOO        ManagerEquipos.inscribir(equipo, nombreEquipo, idEquipo);

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

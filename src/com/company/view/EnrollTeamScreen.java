package com.company.view;

import com.company.model.Team;

public class EnrollTeamScreen {

    void show(){
        System.out.println("INSCRIBIR EQUIPO");

        System.out.println(";Nombre equipo:");

        String equipo = "santako";
        String ciudad = "SANTAKO";
        String siglas = "stk";

        //  NOOOO        ManagerEquipos.inscribir(equipo, ciudad, siglas);


        Team team = new Team();
        team.nombre = "santakokk",
        team.ciudad = "santa coloma";
        team.siglas = "STK";

//        ManagerEquipos.inscribir(team);

    }
}

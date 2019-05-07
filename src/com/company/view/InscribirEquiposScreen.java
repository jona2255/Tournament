package com.company.view;

import com.company.model.Team;

public class InscribirEquiposScreen {

    void show(){
        System.out.println("INSCRIBIR EQUIPO");

        System.out.println(";Nombre equipo:");

        String equipo = "santako";
        String ciudad = "SANTAKO";
        String siglas = "stk";

        //  NOOOO        ManagerEquipos.inscribir(equipo, ciudad, siglas);


        Team team = new Team();
        team.name = "santakokk",
        team.city= "santa coloma";
        team.siglas "STK";

        ManagerEquipos.inscribir(team);

    }
}

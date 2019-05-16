package com.company.view.TEAM;

import com.company.manager.TeamManager;
import com.company.model.Team;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class ModifyTeamStage {

    private Scanner scanner = new Scanner(System.in);

    void show() throws IOException {
        TeamManager teamManager = new TeamManager();

        System.out.println("Introduce ID o Nombre de Equipo quieres eleminar???\n");
        String n_equip = scanner.nextLine();

        System.out.println("Que quieres modificar???\n");
        System.out.println("1.Nombre");
        System.out.println("2.Ciudad:");
        System.out.println("3.Siglas:");

        int opcion = scanner.nextInt();

        teamManager.modify(n_equip,opcion);

    }
}

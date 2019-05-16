package com.company.view.TEAM;

import com.company.manager.TeamManager;

import java.io.IOException;
import java.util.Scanner;

public class DeleteTeamStage {

    Scanner scanner = new Scanner(System.in);

    void show() throws IOException {
        TeamManager teamManager = new TeamManager();

        System.out.println("Introduce ID o Nombre de Equipo quieres modificar???\n");
        String n_equip = scanner.nextLine();

        teamManager.delete(n_equip);
    }
}

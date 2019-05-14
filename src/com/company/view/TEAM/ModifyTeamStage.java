package com.company.view.TEAM;

import com.company.manager.TeamManager;
import com.company.model.Team;

import java.io.File;
import java.util.Scanner;

public class ModifyTeamStage {

    Scanner scanner = new Scanner(System.in);
    private File file = new File("Temadades.txt");

    void show(){
        Team team = new Team();
        TeamManager teamManager = new TeamManager();

        System.out.println("Introduce ID o Nombre de Equipo quieres modificar???\n");
        String n_equip = scanner.nextLine();

        System.out.println("Que quieres modificar???\n");
        System.out.println("1.Nombre");
        System.out.println("2.Ciudad:");
        System.out.println("2.Siglas:");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                new EnrollTeamScreen().show();
                break;
            case 2:
                new ModifyTeamStage().show();
                break;
            case 3:
                new DeleteTeamStage().show();
                break;
            case 4:
                new ListTeamStage().show();
                break;
            case 5:
                return;
            default:
                System.out.println("Opción no válida");
        }


    }
}

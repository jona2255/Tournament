package com.company.view.TEAM;

import java.util.Scanner;

public class TeamsMenuScreen {

    Scanner scanner = new Scanner(System.in);

    public void show(){
        System.out.println("EQUIPOS");
        System.out.println();
        System.out.println("1.Inscribir");
        System.out.println("2.Modificar");
        System.out.println("3.Borrar");
        System.out.println("4.Listar");
        System.out.println();

        int opcion = scanner.nextInt();


        switch (opcion){
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
            default:
                System.out.println("Opción no válida");
        }
    }
}

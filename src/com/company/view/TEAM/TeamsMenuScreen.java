package com.company.view.TEAM;

import java.io.IOException;
import java.util.Scanner;

public class TeamsMenuScreen {

    private Scanner scanner = new Scanner(System.in);

    public void show() throws IOException {

        while(true) {
            System.out.println();
            System.out.println("EQUIPOS");
            System.out.println();
            System.out.println("1.Inscribir");
            System.out.println("2.Modificar");
            System.out.println("3.Borrar");
            System.out.println("4.Listar");
            System.out.println("5.Volver");
            System.out.println();

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
}

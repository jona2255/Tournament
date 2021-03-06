package com.company.view.MAIN_MENU;

import com.company.view.CLASIFICATION.ClasificationMenuScreen;
import com.company.view.PARTICIPANTS.ParticipantsMenuScreen;
import com.company.view.RESULTS.ResultMenuScreen;
import com.company.view.TEAM.TeamsMenuScreen;

import java.io.IOException;
import java.util.Scanner;

public class MainMenuScreen {

    Scanner scanner = new Scanner(System.in);

    public void show() throws IOException {

        while(true) {
            System.out.println();
            System.out.println("MENU PRINCIPAL");
            System.out.println();
            System.out.println("1.Equipos");
            System.out.println("2.Participantes");
            System.out.println("3.Resultado");
            System.out.println("4.Clasificacion");
            System.out.println("5.Salir");
            System.out.println();

            int opcion = scanner.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:
                    new TeamsMenuScreen().show();
                    break;
                case 2:
                    new ParticipantsMenuScreen().show();
                    break;
                case 3:
                    new ResultMenuScreen().show();
                    break;
                case 4:
                    new ClasificationMenuScreen().show();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}

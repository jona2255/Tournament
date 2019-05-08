package com.company.view.MAIN_MENU;

import com.company.view.MAIN_MENU.CLASIFICATION.ClasificationMenuScreen;
import com.company.view.MAIN_MENU.PARTICIPANTS.ParticipantsMenuScreen;
import com.company.view.MAIN_MENU.RESULTS.ResultMenuScreen;
import com.company.view.MAIN_MENU.TEAM.TeamsMenuScreen;

import java.util.Scanner;

public class MainMenuScreen {

    Scanner scanner = new Scanner(System.in);

    public void show(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.Equipos");
        System.out.println("2.Participantes");
        System.out.println("3.Resultado");
        System.out.println("4.Clasificacion");

        int opcion = scanner.nextInt();


        switch (opcion){
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
            default:
                System.out.println("Opcion no valida");
        }
    }
}

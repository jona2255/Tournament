package com.company.view;

import java.util.Scanner;

public class MainMenuScreen {

    Scanner scanner = new Scanner(System.in);

    void show(){
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
                System.out.println("hola");
                break;
            case 3:
                new ResultMenuScreen().show();
                break;
            case 4:
                new ClasificationMenuScreen().show();
                break;
            default:
                System.out.println("opcion no valida");
        }
    }
}

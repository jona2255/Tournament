package com.company.view.CLASIFICATION;

import com.company.manager.ClasificationManager;

import java.util.Scanner;

public class ClasificationMenuScreen {

    Scanner scanner = new Scanner(System.in);

    public void show(){
        while (true) {
            System.out.println();
            System.out.println("CLASIFICACION");
            System.out.println();
            System.out.println("1.Por equipos");
            System.out.println("2.Por participantes");
            System.out.println("3.Volver");
            System.out.println();

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    new ClasificationManager().clasificationTeams();
                    break;
                case 2:
                    new ClasificationManager().clasificationParticipants();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}

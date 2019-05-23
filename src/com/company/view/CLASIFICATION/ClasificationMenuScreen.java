package com.company.view.CLASIFICATION;

import com.company.manager.ClasificationManager;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ClasificationMenuScreen {

    Scanner scanner = new Scanner(System.in);

    public void show() throws IOException {
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
                    HashMap<String, Integer> clasificationParticipant = new ClasificationManager().clasificationParticipants();
                    HashMap<String, Integer> clasificationTeam = new ClasificationManager().clasificationTeams(clasificationParticipant);
                    new ClasificationManager().orderTeams(clasificationTeam);
                    break;
                case 2:
                    HashMap<String, Integer> clasificationParticipants = new ClasificationManager().clasificationParticipants();
                    new ClasificationManager().orderParticipants(clasificationParticipants);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}

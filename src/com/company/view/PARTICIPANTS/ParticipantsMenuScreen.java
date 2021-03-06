package com.company.view.PARTICIPANTS;

import java.io.IOException;
import java.util.Scanner;

public class ParticipantsMenuScreen {
    public void show() throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("PARTICIPANTES");
            System.out.println();
            System.out.println("1.Inscribir participante");
            System.out.println("2.Modificar participante");
            System.out.println("3.Borrar participante");
            System.out.println("4.Listar participantes");
            System.out.println("5.Volver");

            System.out.println();

            int opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    new EnrollParticipantScreen().show();
                    break;
                case 2:
                    new ModifyParticipantScreen().show();
                    break;
                case 3:
                    new DeleteParticipantScreen().show();
                    break;
                case 4:
                    new ListParticipantScreen().show();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}

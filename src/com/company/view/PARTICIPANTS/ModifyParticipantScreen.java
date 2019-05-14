package com.company.view.PARTICIPANTS;

import com.company.model.Participant;

import java.util.Scanner;

public class ModifyParticipantScreen {
    String modifParticipante = "";

    public void show(){
        Participant participant = new Participant();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que participante quieres modificar?");
        System.out.println();

        modifParticipante = scanner.nextLine();

        System.out.println("¿Que quieres modificar?");
        System.out.println();


        System.out.println("1.Modificar nombre");
        System.out.println("2.Modificar equipo");
        System.out.println("3.Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduce el nuevo nombre del participante:");
                System.out.println();

                participant.nombre = scanner.nextLine();

            case 2:
                System.out.println("Introduce el nuevo equipo del participante:");
                System.out.println();

                participant.nombreEquipo = scanner.nextLine();

            case 3:
                break;
            default:
                System.out.println("Opción no válida");

        }

    }
}

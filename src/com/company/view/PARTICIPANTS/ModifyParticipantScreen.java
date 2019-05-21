package com.company.view.PARTICIPANTS;

import com.company.manager.ParticipantManager;

import java.io.IOException;
import java.util.Scanner;

class ModifyParticipantScreen {

    private Scanner scanner = new Scanner(System.in);

    void show() throws IOException {
        ParticipantManager participantManager = new ParticipantManager();

        System.out.println("Introduce ID o Nombre de Equipo quieres modificar\n");
        String n_participants = scanner.nextLine();

        System.out.println("¿Que quieres modificar?\n");
        System.out.println("1. Nombre");
        System.out.println("2. Nombre del Equipo");

        int opcion = scanner.nextInt();

        participantManager.modify(n_participants,opcion);

    }
}

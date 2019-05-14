package com.company.view.PARTICIPANTS;

import com.company.manager.ParticipantManager;
import com.company.model.Participant;

import java.io.IOException;
import java.util.Scanner;

public class EnrollParticipantScreen {

    Scanner scanner = new Scanner(System.in);


    void show() throws IOException {

        Participant participants = new Participant();

        System.out.println("INSCRIBIR PARTICIPANTE");
        System.out.println();

        System.out.println("Nombre del participante:");
        participants.nombre = scanner.nextLine();
        System.out.println();

        System.out.println("Nombre del equipo:");
        participants.nombreEquipo = scanner.nextLine();
        System.out.println();

        ParticipantManager.id(participants);

        ParticipantManager.createParticipant(participants);
    }
}

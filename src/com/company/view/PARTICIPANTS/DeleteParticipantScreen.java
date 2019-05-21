package com.company.view.PARTICIPANTS;

import com.company.manager.ParticipantManager;
import com.company.model.Participant;

import java.io.IOException;
import java.util.Scanner;

public class DeleteParticipantScreen {

    Scanner scanner = new Scanner(System.in);

     void show()throws IOException {
        ParticipantManager participantManager = new ParticipantManager();

        System.out.println("¿Que participante quieres eliminar?");
        String nParticipant = scanner.nextLine();

        participantManager.delete(nParticipant);

    }
}

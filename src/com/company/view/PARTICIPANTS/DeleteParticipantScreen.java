package com.company.view.PARTICIPANTS;

import com.company.model.Participant;

import java.util.Scanner;

public class DeleteParticipantScreen {

    Scanner scanner = new Scanner(System.in);

    public void show(){
        Participant participant = new Participant();

        System.out.println("¿Que participante quieres eliminar?");
        participant.nombre = scanner.nextLine();


    }
}

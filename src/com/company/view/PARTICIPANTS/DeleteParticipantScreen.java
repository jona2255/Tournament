package com.company.view.PARTICIPANTS;

import com.company.model.Team;

import java.util.Scanner;

public class DeleteParticipantScreen {

    Scanner scanner = new Scanner(System.in);

    public void show(){
        Team participant = new Team();

        System.out.println("¿Que participante quieres eliminar?");
        participant.nombre = scanner.nextLine();


    }
}

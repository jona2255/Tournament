package com.company.view.PARTICIPANTS;

import com.company.manager.ParticipantManager;
import com.company.model.Participant;

import java.util.Scanner;

public class EnrollParticipantScreen {

    Scanner scanner = new Scanner(System.in);


    public void show(){

            Participant participant = new Participant();

            System.out.println("INSCRIBIR PARTICIPANTE");

            System.out.println("Nombre del participante:");
            participant.nombre = scanner.nextLine();

            System.out.println("ID del equipo:");
            participant.idEquipo = scanner.nextInt();

            System.out.println("Nombre del equipo:");
            participant.nombreEquipo = scanner.nextLine();

            participant.id++;

            //  NOOOO        ManagerEquipos.inscribir(equipo, nombreEquipo, idEquipo);

            ParticipantManager.createParticipant(participant);

    }
}

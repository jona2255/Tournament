package com.company.view.PARTICIPANTS;

import com.company.model.Participant;
import com.company.model.Team;

import java.util.Scanner;

public class ModifyParticipantScreen {
    String modifParticipante;

    public void show(){
        Participant participant = new Participant();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que participante quieres modificar?");
        System.out.println();

         modifParticipante = scanner.nextLine();


        System.out.println("Introduce el nuevo nombre del participante:");
        System.out.println();

        participant.nombre = scanner.nextLine();

        System.out.println("Introduce el nuevo equipo del participante:");
        System.out.println();

        participant.nombreEquipo = scanner.nextLine();

    }

}


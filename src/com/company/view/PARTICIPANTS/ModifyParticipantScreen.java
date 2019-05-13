package com.company.view.PARTICIPANTS;

import com.company.model.Participant;

import java.util.Scanner;

public class ModifyParticipantScreen {
    String modifParticipante = "";

    String modifValor = "";

    public void show(){
        Participant participant = new Participant();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que participante quieres modificar?");

        modifParticipante = scanner.nextLine();

        System.out.println("Que quieres modificar");

        if (modifValor.equals("nombre") || modifValor.equals("n")){

            System.out.println("Introduce el nuevo nombre del participante:");

            participant.nombre = scanner.nextLine();

        }else{

            System.out.println("Introduce el nuevo equipo del participante:");

            participant.nombreEquipo = scanner.nextLine();
        }

    }
}

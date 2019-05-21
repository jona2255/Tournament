package com.company.view.PARTICIPANTS;

import com.company.manager.ParticipantManager;
import com.company.model.Participant;
import java.io.IOException;
import java.util.List;

public class ListParticipantScreen {


     void show() throws IOException{

        System.out.println("LISTA:");

        List<Participant> participants = ParticipantManager.getParticipants();

        for(Participant participant : participants){
            System.out.println("Id: " + participant.id + "  " + "Nombre Participante: " + participant.nombre+ "  " + "Nombre Equipo: " + participant.nombreEquipo+ " ");
        }

    }
}

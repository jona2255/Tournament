package com.company.manager;

import com.company.Config;
import com.company.model.Participant;
import com.company.model.Team;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ParticipantManager {

    public static void createParticipant(Participant participant) throws IOException {

        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Config.teamsFile, true));

        outputStream.write(participant.id + Config.SEP + participant.nombre + Config.SEP + participant.nombreEquipo + "\n");

        outputStream.close();
    }

    public static void id(Participant participant) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.participantsFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);
            participant.id = Integer.parseInt(values[0])+1;
        }
        inputStream.close();
    }

    public static List<Participant> getParticipants() throws IOException {

        List<Participant> participants = new ArrayList<>();

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.participantsFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);

            Participant participant = new Participant();
            participant.id = Integer.valueOf(values[0]);
            participant.nombre = values[1];

            participants.add(participant);
        }
        inputStream.close();

        return participants;
    }


}

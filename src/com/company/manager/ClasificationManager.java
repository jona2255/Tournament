package com.company.manager;

import com.company.Config;
import com.company.model.Participant;
import com.company.model.Result;
import com.company.model.Team;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class ClasificationManager {


    public HashMap<String, Integer> clasificationTeams(HashMap<String, Integer> clasificationParticipants) throws IOException {

        HashMap<String, Integer> clasificationTeams = new HashMap<>();

        List<Result> results = ResultManager.listResult();
        List<Participant> participants = ParticipantManager.getParticipants();
        List<Team> teams = TeamManager.getTeams();


        for (String key : clasificationParticipants.keySet()) {

            if (clasificationParticipants.get(key) > 0) {

                for (Participant participant : participants) {

                    if (key.equals(participant.nombre)) {

                        for (Team team : teams) {

                            if (participant.nombreEquipo.equals(team.nombre)) {

                                clasificationTeams.put(team.nombre, +3);

                            }

                        }

                    }

                }

            } else {

                if (clasificationParticipants.get(key) > 0) {

                    for (Participant participant : participants) {

                        if (key.equals(participant.nombre)) {

                            for (Team team : teams) {

                                if (participant.nombreEquipo.equals(team.nombre)) {

                                    clasificationTeams.put(team.nombre, +0);

                                }

                            }

                        }

                    }
                }

            }


        }
        return clasificationTeams;
    }



    public void orderTeams( HashMap<String, Integer> clasificationTeams) throws IOException {
        System.out.println();

        while (clasificationTeams.size() != 0){

            int max = 0;
            String clave = "";

            for(String key : clasificationTeams.keySet()){
                int val = clasificationTeams.get(key);

                if(val > max){
                    // guardar max, y la key de max
                    max = val;
                    clave = key;

                } else if (val == max){

                    clave = key;
                }
            }

            BufferedWriter outputStream = new BufferedWriter(new FileWriter(Config.clasificiationTeamsFile, true));
            outputStream.write(clave + Config.SEP + max + "\n");
            outputStream.close();

            System.out.println("Equipo: " + clave + " - Puntos: " + max);
            clasificationTeams.remove(clave, max);

        }


    }





    public HashMap<String, Integer> clasificationParticipants() throws IOException {


        HashMap <String, Integer> clasificationParticipants = new HashMap<>();

        List<Result> results = ResultManager.listResult();

        for(Result result : results){

            if(result.resultLocal > result.resultVisitor){

                clasificationParticipants.put(result.participantLocal, +3);
                clasificationParticipants.put(result.participantVisitor, +0);


            } else if (result.resultLocal == result.resultVisitor){

                clasificationParticipants.put(result.participantLocal, +1);
                clasificationParticipants.put(result.participantVisitor, +1);

            } else if (result.resultLocal < result.resultVisitor){

                clasificationParticipants.put(result.participantLocal, +0);
                clasificationParticipants.put(result.participantVisitor, +3);

            }

        }

        return clasificationParticipants;

    }

    public void orderParticipants( HashMap<String, Integer> clasificationParticipants) throws IOException {
        System.out.println();

        while (clasificationParticipants.size() != 0){

            int max = 0;
            String clave = "";

            for(String key : clasificationParticipants.keySet()){
                int val = clasificationParticipants.get(key);

                if(val > max){
                    // guardar max, y la key de max
                    max = val;
                    clave = key;

                } else if (val == max){

                    clave = key;
                }
            }
            BufferedWriter outputStream = new BufferedWriter(new FileWriter(Config.clasificiationParticipantsFile, true));
            outputStream.write(clave + Config.SEP + max + "\n");
            outputStream.close();

            System.out.println("Participante: " + clave + " - Puntos: " + max);
            clasificationParticipants.remove(clave, max);

        }


    }

}

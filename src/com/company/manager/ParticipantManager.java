package com.company.manager;

import com.company.Config;
import com.company.model.Participant;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParticipantManager {

    File participantsFiletmp = new File("participantstmp.txt");

    public static void createParticipant(Participant participant) throws IOException {

        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Config.participantsFile, true));
        id(participant);
        outputStream.write(participant.id + Config.SEP + participant.nombre + Config.SEP + participant.nombreEquipo + "\n");

        outputStream.close();
    }

    public static void id(Participant participant) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.participantsFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);
            participant.id = Integer.parseInt(values[0]);
        }
        inputStream.close();
        participant.id ++;
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
            participant.nombreEquipo = values[2];
            participants.add(participant);
        }
        inputStream.close();

        return participants;
    }


    public void delete(String participantName) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.participantsFile));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(participantsFiletmp));

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);

            if(!values[0].equals(participantName) && !values[1].equals(participantName) ){
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();


        participantsFiletmp.renameTo(Config.participantsFile);
    }


    public void modify(String e_n,int n) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.participantsFile));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(participantsFiletmp));

        String n_n;
        switch (n){
            case 1 :
                System.out.println("Introduce el nuevo nombre:");
                break;
            case 2 :
                System.out.println("Introduce el nuevo nombre del equipo:");
                break;
        }
        n_n = scanner.nextLine();

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);
            if(values[0].equals(e_n) || values[1].equals(e_n)){
                for (int i = 0; i < values.length; i++) {
                    if (i == n){
                        outputStream.write(n_n + Config.SEP);
                    }else {
                        outputStream.write(values[i] + Config.SEP);
                    }
                }
                outputStream.write("\n");
            } else {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        participantsFiletmp.renameTo(Config.participantsFile);
    }
}

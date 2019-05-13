package com.company.manager;

import com.company.model.Team;

import java.io.*;

public class TeamManager {

    public static void createTeam(Team team, File file) throws IOException {

        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file, true));

        outputStream.write(team.id + " : " + team.nombre + " : " + team.siglas + " : " + team.ciudad + "\n");

        outputStream.close();
    }

    public void id(File file) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(file));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(":");
            String id = String.valueOf(values)+1;
        }

        inputStream.close();

        return ;


    }


}

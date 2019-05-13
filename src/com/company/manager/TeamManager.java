package com.company.manager;

import com.company.model.Team;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TeamManager {



    public static void createTeam(Team team, File file) throws IOException {

        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file, true));

        outputStream.write(team.id + " : " + team.nombre + " : " + team.siglas + " : " + team.ciudad + "\n");

        outputStream.close();
    }

    public void id(){


    }


}

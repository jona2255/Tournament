package com.company.manager;

import com.company.Config;
import com.company.model.Team;

import java.io.*;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TeamManager {

    public static void createTeam(Team team) throws IOException {

        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Config.teamsFile, true));

        outputStream.write(team.id + Config.SEP + team.nombre + Config.SEP + team.siglas + Config.SEP + team.ciudad + "\n");

        outputStream.close();
    }

    public static void id(Team team) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.teamsFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);
            team.id = Integer.parseInt(values[0])+1;
        }
        inputStream.close();
    }

    public static List<Team> getTeams() throws IOException {

        List<Team> teams = new ArrayList<>();

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.teamsFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);

            Team team = new Team();
            team.id = Integer.valueOf(values[0]);
            team.nombre = values[1];

            teams.add(team);
        }
        inputStream.close();

        return teams;
    }

    public void modiyN(String e_n) throws IOException {

        Scanner scanner = new Scanner(System.in);

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.teamsFile));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Config.teamsFiletmp));

        System.out.println("Introduce nuevo nombre:");
        String n_n = scanner.nextLine();

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);

            if(values[0].equals(e_n)){
                outputStream.write(Integer.parseInt(values[0]) + Config.SEP + n_n + Config.SEP + values[2] + Config.SEP + values[3] + "\n");
            } else if (values[1].equals(e_n)){
                outputStream.write(Integer.parseInt(values[0]) + Config.SEP + n_n + Config.SEP + values[2] + Config.SEP + values[3] +  "\n");
            } else {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        Config.teamsFiletmp.renameTo(Config.teamsFile);


    }
}
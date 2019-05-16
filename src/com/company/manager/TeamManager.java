package com.company.manager;

import com.company.Config;
import com.company.model.Team;

import java.io.*;
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

    public void modiy(String e_n,int n) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String n_n = "";

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.teamsFile));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Config.teamsFiletmp));

        switch (n){
            case 1 :
                System.out.println("Introduce nuevo nombre:");
                n_n = scanner.nextLine();
                break;
            case 2 :
                System.out.println("Introduce nuevo Ciudad:");
                n_n = scanner.nextLine();
                break;
            case 3 :
                System.out.println("Introduce nuevo Siglas:");
                n_n = scanner.nextLine();
                break;
        }



        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);

            if(values[0].equals(e_n) || values[1].equals(e_n)){
                for (int i = 0; i < values.length; i++) {
                    if (i == n){
                        outputStream.write(n_n + Config.SEP);
                    }else if (i == values.length-1){
                        outputStream.write(values[i]+ "\n");
                    }else {
                        outputStream.write(values[i] + Config.SEP);
                    }
                }
            } else {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        Config.teamsFiletmp.renameTo(Config.teamsFile);

    }
}
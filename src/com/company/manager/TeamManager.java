package com.company.manager;

import com.company.Config;
import com.company.model.Team;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TeamManager {

    File teamsFiletmp = new File("teamstmp.txt");

    public void createTeam(Team team) throws IOException {

        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Config.teamsFile, true));
        id(team);
        outputStream.write(team.id + Config.SEP + team.nombre + Config.SEP + team.siglas + Config.SEP + team.ciudad + "\n");

        outputStream.close();
    }

    public void id(Team team) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.teamsFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);
            team.id = Integer.parseInt(values[0]);
        }
        inputStream.close();
        team.id++;
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
            team.siglas = values[2];
            team.ciudad = values[3];
            teams.add(team);
        }
        inputStream.close();

        return teams;
    }

    public void modify(String e_n,int n) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.teamsFile));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(teamsFiletmp));

        String n_n;
        switch (n){
            case 1 :
                System.out.println("Introduce nuevo nombre:");
                break;
            case 2 :
                System.out.println("Introduce nuevo Sigals:");
                break;
            case 3 :
                System.out.println("Introduce nuevo Ciudad:");
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

        teamsFiletmp.renameTo(Config.teamsFile);
    }

    public void delete(String e_n) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.teamsFile));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(teamsFiletmp));

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);

            if(!values[0].equals(e_n) && !values[1].equals(e_n) ){
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();


        teamsFiletmp.renameTo(Config.teamsFile);
    }
}
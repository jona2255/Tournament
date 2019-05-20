package com.company.manager;


import com.company.Config;
import com.company.model.Result;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ResultManager {


    Scanner scanner = new Scanner(System.in);


    public static List<Result> listResult() throws IOException {

        List<Result> results = new ArrayList<>();

        BufferedReader inputStream = new BufferedReader(new FileReader(Config.resultFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Config.SEP);

            Result result = new Result();

            Result.participantLocal = values[0];
            result.resultLocal = Integer.valueOf(values[1]);
            Result.participantVisitor = values[2];
            result.resultVisitor = Integer.valueOf(values[3]);

            results.add(result);
        }
        inputStream.close();

        return results;

    }

    public void createResult(Result result) throws IOException {

        System.out.println("Introduce el nombre del participante local:");

        Result.participantLocal = scanner.nextLine();

        System.out.println("Introduce el numero de puntos del participante local:");

        Result.resultLocal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el nombre del participante visitante:");

        Result.participantVisitor = scanner.nextLine();

        System.out.println("Introduce el numero de puntos del participante visitante:");

        Result.resultVisitor = scanner.nextInt();


        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Config.resultFile, true));

        outputStream.write(result.participantLocal + Config.SEP + result.resultLocal + Config.SEP + result.participantVisitor + Config.SEP + result.resultVisitor + "\n");

        outputStream.close();

    }
}

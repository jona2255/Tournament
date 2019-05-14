package com.company.manager;


import com.company.model.Result;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ResultManager {

    public static String participantLocal;
    public static int resultLocal;
    public static String participantVisitor;
    public static int resultVisitor;

    Scanner scanner = new Scanner(System.in);


    public void listResult(){


    }

    public void createResult(Result result, File file) throws IOException {

        String participantLocal;

        System.out.println("Introduce el nombre del participante local:");

        participantLocal = scanner.nextLine();

        System.out.println("Introduce el numero de puntos del participante local:");

        resultLocal = scanner.nextInt();

        System.out.println("Introduce el nombre del participante visitante:");

        participantVisitor = scanner.nextLine();

        System.out.println("Introduce el numero de puntos del participante visitante:");

        resultVisitor = scanner.nextInt();




    }
}

package com.company.manager;


import com.company.model.Result;

import java.io.File;
import java.util.Scanner;


public class ResultManager {

    Scanner scanner = new Scanner(System.in);

    File file = new File("Results");

    public void listResult(){


    }

    public void createResult() {

        System.out.println("Introduce el nombre del participante local:");

        String participantLocal = scanner.nextLine();

        System.out.println("Introduce el numero de puntos del participante local:");

        int resultLocal = scanner.nextInt();

        System.out.println("Introduce el nombre del participante visitante:");

        String participantVisitor = scanner.nextLine();

        System.out.println("Introduce el numero de puntos del participante visitante:");

        int resultVisitor = scanner.nextInt();

    }
}

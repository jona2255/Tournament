package com.company.view.RESULTS;

import com.company.manager.ResultManager;

import java.util.Scanner;

public class ResultMenuScreen {

    Scanner scanner = new Scanner(System.in);

    public void show(){

        System.out.println("RESULTADOS");
        System.out.println();
        System.out.println("1.Introducir resultado");
        System.out.println("2.Mostrar resultados");
        System.out.println();

        int opcion = scanner.nextInt();

        System.out.println();

        switch (opcion){
            case 1:

                break;
            case 2:

                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}

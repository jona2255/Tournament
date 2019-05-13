package com.company.view.RESULTS;

import com.company.manager.ResultManager;

import java.util.Scanner;

public class ResultMenuScreen {

    Scanner scanner = new Scanner(System.in);

    public void show(){

        while (true) {
            System.out.println();
            System.out.println("RESULTADOS");
            System.out.println();
            System.out.println("1.Introducir resultado");
            System.out.println("2.Mostrar resultados");
            System.out.println("3.Volver");
            System.out.println();

            int opcion = scanner.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:
                    new ResultManager().createResult();
                    break;
                case 2:
                    new ResultManager().listResult();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}

package com.company.view;

import java.util.Scanner;

public class MainMenuScreen {

    void show(){
        System.out.println("MENU PRINCIPAL");


        Scanner scanner = new Scanner(System.in);

        int opcion = scanner.nextInt();


        switch (opcion){
            case 1:
                new TeamsMenuScreen().show();
                break;
            case 2:
                System.out.println("hola");
                break;
            default:
                System.out.println("opcin no valida");
        }
    }
}

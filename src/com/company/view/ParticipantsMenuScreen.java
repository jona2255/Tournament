package com.company.view;

import java.util.Scanner;

public class ParticipantsMenuScreen {
    void show(){

        Scanner scanner = new Scanner(System.in);


            System.out.println("PARTICIPANTES");
            System.out.println("1.Inscribir participante");
            System.out.println("2.Modificar participante");
            System.out.println("3.Borrar participante");
            System.out.println("4.Listar participantes");

            int opcion = scanner.nextInt();


            switch (opcion){
                case 1:
                    new EnrollParticipantScreen().show();
                    break;
                case 2:
                    new ModifyParticipantScreen().show();
                    System.out.println("hola");
                    break;
                case 3:
                    new DeleteParticipantScreen().show();
                    break;
                case 4:
                    new ListParticipantScreen().show();
                    break;
                default:
                    System.out.println("opcion no valida");
            }

    }
}

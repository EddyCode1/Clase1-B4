package org.jrae.view;

import org.jrae.controller.Ejercicio1;

import java.util.Scanner;

public class MenuPrincipal {

    public void menuPrincipal(){

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Elija una opcion");
            System.out.println("1. Comprovacion de numero par o impar");
         opcion = scanner.nextInt();
            switch(opcion){
            case 1:
                Ejercicio1 ejercicio1 = new Ejercicio1();
                ejercicio1.ejercicio1();
                break;
                case 2:
            }
        } while(opcion == 0);
    }

}

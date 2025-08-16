package org.jrae.view;

import org.jrae.controller.Ejercicios;

import java.util.Scanner;

public class MenuPrincipal {

    public void menuPrincipal(){

        Scanner scanner = new Scanner(System.in);
        String salida;
        int opcion;
        do{
            System.out.println("Bienvenido al Menu Principal");
            System.out.println("--------------------------------------------------");
            System.out.println("Elija una opcion");
            System.out.println("--------------------------------------------------");
            System.out.println("1. Comprobacion de numeros");
            System.out.println("2. Adivina el numero");
            System.out.println("3. Convercion de Celcios a Fahrenheit");
            System.out.println("Ingrese 'SALIDA' para salir de la opcion");
            System.out.println("--------------------------------------------------");
            salida = scanner.nextLine();

            if (salida.equalsIgnoreCase("SALIDA")){
                break;
            }
            opcion = Integer.parseInt(salida);
            switch(opcion){
            case 1:
                Ejercicios ejercicio1y2 = new Ejercicios();
                ejercicio1y2.ejercicio1Y2();
                break;
                case 2:
                    Ejercicios ejercicio3 = new Ejercicios();
                    ejercicio3.ejercico3();
                    break;
                case 3:
                    Ejercicios ejercicio4 = new Ejercicios();
                    ejercicio4.ejercico4();
                    break;
            }
        } while(true);
        System.out.println("Ten un buen dia :)");
    }

}

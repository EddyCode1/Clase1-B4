package org.jrae.controller;

import org.jrae.view.MenuPrincipal;

import java.util.Scanner;
public class Ejercicio1 {
    Scanner scanner = new Scanner(System.in);

    public void ejercicio1 () {
        String salida = scanner.nextLine();

        do {
        System.out.println("Ingrese un numero entero");
            int numero;
            System.out.println("Ingrese a SALIDA para salir del programa");
            numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Numero neutro");
        } else if (numero % 2 == 0) {
            System.out.println("El numeor es par");
        } else {
            System.out.println("El numero es impar");
        }

        } while (salida.equals("SALIDA"));
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.menuPrincipal();
    }
}

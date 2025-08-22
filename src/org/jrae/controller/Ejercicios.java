package org.jrae.controller;

import org.jrae.view.MenuPrincipal;

import java.util.Random;
import java.util.Scanner;
public class Ejercicios {
    Scanner scanner = new Scanner(System.in);

    public void ejercicio1Y2() {
        String salida;
            int numero;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Bienvenido a identificacion de numeros");
            System.out.println("Ingrese un numero entero");
            System.out.println("Ingrese 'SALIDA' para salir de la opcion");
            System.out.println("--------------------------------------------------");
            salida = scanner.nextLine();

            if (salida.equalsIgnoreCase("SALIDA")){
                break;
            }
            numero = Integer.parseInt(salida);

        if (numero == 0) {
            System.out.println("Numero neutro");
        } else if (numero % 2 == 0) {
            System.out.println("El numeor: "+numero+" es par");
            if(numero == 2){
                System.out.println("El numero: "+numero+" es primo");
            } else if(numero > 2 && numero % 2 == 0){
                System.out.println("El numero: "+numero+" no es primo");
            } else{
                System.out.println("El numero: "+numero+" es primo");
            }
        } else {
            System.out.println("El numero: "+numero+" es impar");
            if(numero == 2){
                System.out.println("El numero: "+numero+" es primo");
            } else if(numero > 2 && numero % 2 == 0){
                System.out.println("El numero: "+numero+" no es primo");
            } else{
                System.out.println("El numero: "+numero+" es primo");
            }
        }

        } while (true);
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.menuPrincipal();
    }

    public void ejercico3(){
        String salida;
        int numero;
        int numeroAdivinar;
        do {
        Random random = new Random();
            numeroAdivinar = random.nextInt(11);
            System.out.println("--------------------------------------------------");
            System.out.println("Bienvenido a adivina el numero");
            System.out.println("--------------------------------------------------");
            System.out.println("Ingresa un numero entre 0 y 10");
            System.out.println("Ingrese 'SALIDA' para salir de la opcion");
            System.out.println("--------------------------------------------------");
            salida = scanner.nextLine();

            if (salida.equalsIgnoreCase("SALIDA")){
                break;
            }
            numero = Integer.parseInt(salida);
        if (numero > 10 || numero < 0){
            System.out.println("Numero fuera de parametros");
        } else if (numero == numeroAdivinar){
            System.out.println("Felicidades has adivinado el numero");
        } else {
            System.out.println("Perdiste el numero era: "+numeroAdivinar);
        }

        }while(true);
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.menuPrincipal();
    }

    public void ejercico4(){
        String salida;
        double celcios;
        double resultado;
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Bienvenido a Conversion de Centigrados a Fahrenheit.");
            System.out.println("--------------------------------------------------");
            System.out.println("Ingresa un numero en grados");
            System.out.println("Ingrese 'SALIDA' para salir de la opcion");
            System.out.println("--------------------------------------------------");
            salida = scanner.nextLine();

            if (salida.equalsIgnoreCase("SALIDA")){
                break;
            }
            celcios = Double.parseDouble(salida);

            resultado = (celcios * 9/5)+32;
            System.out.println("--------------------------------------------------");
            System.out.println("El resultado en fahrenheit: "+resultado);
            System.out.println("--------------------------------------------------");
        }while(true);
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.menuPrincipal();
    }

}

package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {

    public void practica3(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime tu nombre: ");

        String nombre = entrada.next();

        int num1 = 0;
        boolean error = true;

        while(error == true){

            try {
                System.out.println("Hola " + nombre + ".Dime tu edad:");
                num1 = entrada.nextInt();
               error=false;
            }catch(InputMismatchException er){
                    System.out.println("Error. Introduce un valor valido ...");
                    entrada.nextLine();

            }

        }
        while (num1<0){
          System.out.println("Dime un numero positivo");
          num1 = entrada.nextInt();
        }
        if (num1 < 0) {
            System.out.println("Error no tienes la edad para votar");
        }
        if (num1 > 18) {
            System.out.println("Enhorabuena " + nombre + " puedes votar");
        } else if (num1 < 18) {
            int resultado = (18-num1);
            System.out.println("Lo siento " + nombre + " No puedes votar te faltan " +resultado + "años para votar");

        }

    }
}
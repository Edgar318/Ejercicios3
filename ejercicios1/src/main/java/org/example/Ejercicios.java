package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {

    public void actividad_inicial() {
        System.out.println("¿Como te llamas?");

        Scanner entrada = new Scanner(System.in);
        //System.in

        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + " Bienvenido a " + curso);

        int num1 = 0;
        int num2 = 0;

        while (num1 == num2) {
            System.out.println("Introduce un numero....");
            num1 = entrada.nextInt();

            System.out.println("Introduce otro numero....");
            num2 = entrada.nextInt();
            if (num1 == num2) {
                System.out.println("Error. los numeros son iguales. ");
            }

        }


        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);

    }

    public void Excepciones() {
        Scanner entrada = new Scanner(System.in);

        int numero;
        boolean error = true;

        while (error == true) {
            try {
                System.out.println("Introduce un numero ...");
                numero = entrada.nextInt();
                error = false;
            } catch (InputMismatchException er) {
                System.out.println("Error. Introduce un valor valido ...");
                entrada.nextLine();
            }
        }
    }

    public void ejercicio3() {
        Scanner entrada = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        float resultado = 0;
        float aux = 0;
        while (aux == 0) {
            try {
                System.out.println("Introduce el dividendo ");
                num1 = entrada.nextInt();

                System.out.println("Introduce el divisor");
                num2 = entrada.nextInt();

            } catch (InputMismatchException er) {
                System.out.println("Error. Introduce un valir valido");

                entrada.nextLine();

            }
            if (num2 == 0) {
                System.out.println("El divisor no se puede dividir entre 0");
            } else {
                resultado = (num1 / num2);
                System.out.println("El resultado es: " + resultado);
            }


        }
    }

    public void ejercicio1() {
        Scanner entrada = new Scanner(System.in);

        float num1 = 0;

        System.out.println("Dime un numero");

        num1 = entrada.nextInt();
        if (num1 == 0) {
            System.out.println("El numero es natural");
        } else if (num1 > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }

    public void ejercicio2() {
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Dime un numero");
        num1 = entrada.nextInt();
        System.out.println("Dime otro numero");
        num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.println("Error. Los numeros son iguales");
        } else if (num1 > num2) {
            System.out.println("El numero mayor es " + num1);
        } else {
            System.out.println("El numero menor es " + num1);
        }


    }

    public void practica3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre = entrada.next();
        int num1;
        System.out.println("Hola " + nombre + ".Dime tu edad:");
        num1 = entrada.nextInt();

        if (num1 == 18) {
            System.out.println("Enhorabuena " + nombre + " puedes votar");
        } else if (num1 < 18) {
            System.out.println("Lo siento " + nombre + " No puedes votar");

        }


    }

    public void practica4() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre = entrada.next();
        int num1;

        System.out.println("Hola " + nombre + ". Dime tu edad:");

        try {
            num1 = entrada.nextInt();
            if (num1 < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }
            if (num1 == 18) {
                System.out.println("Enhorabuena " + nombre + ", puedes votar.");
            } else if (num1 < 18) {
                System.out.println("Lo siento " + nombre + ", no puedes votar.");
            } else {
                System.out.println("Genial " + nombre + ", puedes votar.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Por favor, ingresa un número válido.");
        }
    }

    public void mundoo(){
        System.out.println("Hola mundo");
    }
}




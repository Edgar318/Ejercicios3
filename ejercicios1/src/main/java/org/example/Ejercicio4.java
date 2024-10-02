package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public void Ejercicio4(){
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int resultado;
        1,2   2,3
        String numC = Integer.toString(num2);
        String numC_1 = numC.substring(0,1);
        int num_1 = Integer.parseInt(numC_1);

        System.out.println("La primera cifra es " + num_1);

        boolean error = true;
        while(error==true){

            try{
                System.out.println("Dime un numero de 3 cifras para multiplicarlo con otro: ");
                num1 = entrada.nextInt();

                System.out.println("Dime otro numero: ");
                num2 = entrada.nextInt();
                if(num1<=0 && num2<=0){
                    System.out.println("Error vuelve a ponerme otra vez el numero.");

                }else{
                    error=false;

                }
            }catch(InputMismatchException er){

                System.out.println("Error. Introduce un valor valido ...");
                entrada.nextLine();
            }
        }
            resultado = num1*num2;
            System.out.println("El resultado es: " + resultado);
    }
}

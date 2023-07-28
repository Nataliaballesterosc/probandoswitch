package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dg = new Scanner(System.in);
        Double temperaturaAmbiente;
        System.out.print("Ingrese la temperatura ambiente: ");
        temperaturaAmbiente = dg.nextDouble();

        if (temperaturaAmbiente == 20.0){
            temperaturaAmbiente = 25.0;
            System.out.println("su temperatura se ha ajustado a 25.0");
        } else if (temperaturaAmbiente == 30.0) {
            temperaturaAmbiente = 20.0;
            System.out.println("su temperatura se ha ajustado a 20.0");
        } else if (temperaturaAmbiente == 40) {
            temperaturaAmbiente = 20.0;
            System.out.println("usted se esta muriendo");
        } else{
            Double temperaturaUsuario = dg.nextDouble();





        }


    }
}
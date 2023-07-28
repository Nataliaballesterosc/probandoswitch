package org.example.ejemplo2;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {

        Scanner dg = new Scanner(System.in);
       Integer temperaturaAmbiente;

        System.out.print("digite temperatura actual: ");
        temperaturaAmbiente = dg.nextInt();

        switch (temperaturaAmbiente){

            case 20:
                temperaturaAmbiente=25;
                System.out.println("");
            break;
            case 30:
                temperaturaAmbiente=20;
                System.out.println("");
            break;
            case 40:
                temperaturaAmbiente=20;
                System.out.println("");
            break;
            default:
                System.out.println("");
                System.out.println("");



        }






    }
}

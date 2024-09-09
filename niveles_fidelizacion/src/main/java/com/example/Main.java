package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Calculadora de puntos segun compra
        Scanner sc = new Scanner(System.in);
        double cantidadCompra;
        System.out.println("Ingrese la cantidad total de su compra (en pesos): ");
        cantidadCompra = sc.nextDouble();
        int puntosAcumulados = (int) (cantidadCompra / 10);
        System.out.println("Puntos acumulados: " + puntosAcumulados);

        //Definición de fidelización
        String nivelFidelizacion;
        if (puntosAcumulados >= 0 && puntosAcumulados <= 100) {
         nivelFidelizacion = "Bronce";

        } else if (puntosAcumulados >= 101 && puntosAcumulados <= 500) {
        nivelFidelizacion = "Plata";

        } else if (puntosAcumulados >= 501 && puntosAcumulados <= 1000) {
         nivelFidelizacion = "Oro";

        } else {
         nivelFidelizacion = "Platino";
        }
        System.out.println("Nivel de fidelización: " + nivelFidelizacion);

        //Ofertas adiionales 
        if (nivelFidelizacion.equals("Oro") || nivelFidelizacion.equals("Platino")) {
            System.out.println("Tiene un descuento del 10% en su próxima compra.");
        }

        if (nivelFidelizacion.equals("Platino")) {
            System.out.println("Ha recibido un cupón especial para un producto.");
        }

        //Cierre Scanner
        sc.close();
    }
}
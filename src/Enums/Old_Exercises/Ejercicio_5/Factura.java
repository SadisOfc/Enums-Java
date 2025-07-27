package Enums.Old_Exercises.Ejercicio_5;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Digite el costo de la factura (GENERAL)");
        double factura = l.nextDouble();
        TipoCliente general = TipoCliente.GENERAL;
        System.out.println("Total a Pagar: " + general.aplicarDescuento(factura));
        System.out.println();

        System.out.println("Digite el costo de la factura (EMPRESA)");
        factura = l.nextDouble();
        TipoCliente empresa = TipoCliente.EMPRESA;
        System.out.println("Total a Pagar: " + empresa.aplicarDescuento(factura));
        System.out.println();

        System.out.println("Digite el costo de la factura (ESTUDIANTE)");
        factura = l.nextDouble();
        TipoCliente estudiante = TipoCliente.ESTUDIANTE;
        System.out.println("Total a Pagar: " + estudiante.aplicarDescuento(factura));
        System.out.println();
        l.close();
    }
}

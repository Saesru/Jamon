/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamonEspigaresRuizSantiago2122;

/**
 *
 * @author portatil_profesorado
 */
public class Main {
    
    public static void main(String[] args) {
        JamonEspigaresRuizSantiago2122 miJamonEspigaresRuizSantiago2122;
        int stockActual;
        
        miJamonEspigaresRuizSantiago2122 = new JamonEspigaresRuizSantiago2122("5Jotas",580,100);
        vendeJamEspigaresRuizSantiago2122(miJamonEspigaresRuizSantiago2122);
        
        compraJamEspigaresRuizSantiago2122(miJamonEspigaresRuizSantiago2122);
        stockActual = miJamonEspigaresRuizSantiago2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void compraJamEspigaresRuizSantiago2122(JamonEspigaresRuizSantiago2122 miJamonEspigaresRuizSantiago2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonEspigaresRuizSantiago2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    private static void vendeJamEspigaresRuizSantiago2122(JamonEspigaresRuizSantiago2122 miJamonEspigaresRuizSantiago2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonEspigaresRuizSantiago2122.vender(80, España);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}

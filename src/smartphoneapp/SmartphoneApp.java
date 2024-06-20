/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smartphoneapp;

/**
 *
 * @author Lizy Bustillo
 */
public class SmartphoneApp {

    public static void main(String[] args) {
        Fabricante fabricante = new Fabricante("Xiaomi", "China");
        Operador op1 = new Operador("Tigo", "Honduras");
        Operador op2 = new Operador("Claro", "Costa Rica");
        Chip chip1 = new Chip(op1, 95228562);
        Chip chip2 = new Chip(op2, 21234567);

        Smartphone smartphone = new Smartphone(fabricante, "Galaxy S21", 128, 8, 4000, chip1, chip2);
        smartphone.mostrarInformacion();
    }
}

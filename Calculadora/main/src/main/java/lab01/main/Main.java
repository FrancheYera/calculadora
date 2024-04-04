/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lab01.main;

/**
 *
 * @author mplab4.pc23
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double num1, num2;
        Scanner leer = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        do {
            System.out.println("Ingrese el 1er valor: ");
            num1 = leer.nextDouble();
            System.out.println("Ingrese el 2do valor: ");
            num2 = leer.nextDouble();
        } while (num1 <= 0 || num2 <= 0);
        calc.menu(num1, num2);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01.main;

/**
 *
 * @author mplab4.pc23
 */
public class Calculadora {
    double num1;
    double num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double suma(double num1, double num2){
        double suma = num1 + num2;
        return suma;
    }
    
    public double resta(double num1, double num2){
        double resta = num1 - num2;
        return resta;
    }
    
    public double multiplicacion(double num1, double num2){
        double mult = num1* num2;
        return mult;
    }
    
    public double division(double num1, double num2){
        double division = num1/ num2;
        return division;
    }
    
    public double resto(double num1, double num2){
        double resto = num1%num2;
        return resto;
    }
    public void menu(double num1, double num2){
        System.out.println("la suma de los números es: "+suma(num1, num2));
        System.out.println("la resta de los números es: "+resta(num1, num2));
        System.out.println("la multiplicación de los números es: "+multiplicacion(num1, num2));
        System.out.println("la división de los números es: "+division(num1, num2));
        System.out.println("la resta de los números es: "+resto(num1, num2));
    }
}

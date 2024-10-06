/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg02.operadores;

import java.util.Scanner;

/**
 *
 * @author Yasser
 */
public class EstructurasDeControl {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elija su metodo de pago");
        System.out.println("1. Tarjeta de credito");
        System.out.println("2. Paypal");
        System.out.println("3. Bitcoins");
        
        int metodoPago = scanner.nextInt();
        
        switch (metodoPago) {
            case 1:
                System.out.println("Haz elegido el metodo de pago : Tarjeta de credito");
                break;
            case 2:
                System.out.println("Haz elegido el metodo de pago : Paypal");
                break;
            case 3:
                System.out.println("Haz elegido el metodo de pago : Bitcoins");
                break;
            default:
                System.out.println("Elija un metodo de pago valido");
        }
        
//        System.out.println("Ingrese el primer numero");
//        float n1 = scanner.nextFloat();
//        
//        System.out.println("Ingrese el segundo numero");
//        float n2 = scanner.nextFloat();
//        
//        System.out.println("Los numeros que haz ingresado son: " + n1 + " y " + n2);
//        
//        
//        if(n2 == 0) {
//            System.out.println("No se puede dividir entre cero");
//        } else {
//            double res = n1 / n2;
//            System.out.println("El resultado es " + res);
//        }
        
    }
    
}

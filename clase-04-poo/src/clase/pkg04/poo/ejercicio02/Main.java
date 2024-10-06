/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg04.poo.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Yasser
 */
public class Main {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria(0, "Yasser");
        
        Scanner scanner = new Scanner(System.in);
        
        boolean controlador = true;
        
        System.out.println("Bienvenido " + cuenta.getNombreTitular());
        
        while(controlador) {
            System.out.println("Indique la acccion que quiere realizar");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Cancelar");
            
            int eleccion = scanner.nextInt();
            
            switch (eleccion) {
                case 1:
                    System.out.println("Indique el monto a depositar");
                    double montoDepositar = scanner.nextDouble();
                    cuenta.depositar(montoDepositar);
                    System.out.println("Su nuevo saldo es " + cuenta.getSaldo());
                    break;
                case 2:
                    System.out.println("Indique el monto a retirar");
                    double montoRetirar = scanner.nextDouble();
                    cuenta.retirar(montoRetirar);
                    System.out.println("Su nuevo saldo es " + cuenta.getSaldo());
                    break;
                case 3:
                    controlador = false;
                    break;
                default:
                    System.out.println("Elija una opcion valida");
            }
        
        }
        
        System.out.println("Operación terminada");
        
        
    }
}

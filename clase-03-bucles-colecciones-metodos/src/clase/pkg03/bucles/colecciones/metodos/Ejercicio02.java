/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg03.bucles.colecciones.metodos;

import java.util.Scanner;

/**
 *
 * @author Yasser
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {
        // Crea un programa que pida un número al usuario e imprima la suma de los primeros N números enteros (es decir, 1 + 2 + 3 + ... + N) usando un ciclo for
        
        // entradad de datos, numero pedido por el usuario 
        
        // iterar hasta que sea menor a N
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        
        int num = scan.nextInt();
        
        System.out.println("El numero ingresado fue : " + num);
        
        int suma = 0; // Se guarda la suma obtenida
        
        for(int i = 1; i<=num; i++) {
            suma = suma + i;
        }
        
        System.out.println("Resultado final : " +suma);
        
        
        
    }
    
}

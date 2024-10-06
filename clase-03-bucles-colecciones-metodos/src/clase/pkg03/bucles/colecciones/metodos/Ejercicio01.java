/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg03.bucles.colecciones.metodos;

/**
 *
 * @author Yasser
 */
public class Ejercicio01 {
    
    public static void main(String[] args) {
        // Crea un programa que imprima los números del 1 al 10 utilizando un ciclo for, while y do-while.
        
        System.out.println("Utilizando ciclo for");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("Utilizando ciclo while");
        
        int j = 1;
        
        while(j <= 10) {
            System.out.println(j);
            j++;
        }
        
        System.out.println("Utilizando ciclo do-while");
        
        int x = 1;
        
        do {
            System.out.println(x);
            x++;
        } while(x <= 10);
        
    }
    
}

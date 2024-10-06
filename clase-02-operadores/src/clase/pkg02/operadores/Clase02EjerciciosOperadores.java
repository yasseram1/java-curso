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
public class Clase02EjerciciosOperadores {
    
    public static void main(String[] args) {
        // hallarAreaTriangulo();
        // Conocer si un numero es par o impar (%)
        // 
        // Convertir de grados Celsius a Fahrenheit
        
        Scanner scanner = new Scanner(System.in);
        parImpar(scanner);
        convertirCelsiusAFehrenheit(scanner);
        
        scanner.close();
    }
    
    public static void hallarAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        // Ejercicio, obtener el area de un triangulo
        
        System.out.println("Ingrese la base del triangulo");
        double base = scanner.nextDouble();
        
        System.out.println("Ingrese la altura del triangulo");
        double altura = scanner.nextDouble();
           
        System.out.println("La base del triangulo es: " + base);
        System.out.println("La altura del traingulo es: " + altura);
        
        double area = (base * altura)/2;
        System.out.println("El area del triangulo es: " + area + " m2");
    }
    
    public static void parImpar(Scanner scanner) {
        System.out.println("Ingrese un numero para validar si es par o impar");
        int num = scanner.nextInt();
       
        // La division entre 2, da 0
        if(num % 2 == 0) {
          System.out.println("El numero " + num + " es par");
        } else {
          System.out.println("El numero " + num + " es impar");
        }

    }

    public static void convertirCelsiusAFehrenheit(Scanner scanner) {
        System.out.println("Ingrese la temperatura en grados Celsius");
        
        double celcius = scanner.nextDouble();
        
        double fahrenheit;
        
        fahrenheit = (celcius * 9 / 5) + 32;
        
        System.out.println("La temperatura en grado Fahrenhit es: " + fahrenheit);
    }
    
}



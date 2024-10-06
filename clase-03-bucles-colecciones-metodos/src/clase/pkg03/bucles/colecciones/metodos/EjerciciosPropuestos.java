/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg03.bucles.colecciones.metodos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Yasser
 */
public class EjerciciosPropuestos {
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1");
        imprimirNumerosPares();
        System.out.println("\n");
        
        System.out.println("Ejercicio 2");
        imprimirNombreInverso();
        System.out.println("\n");
        
        System.out.println("Ejercicio 3");
        paisCapital();
        System.out.println("\n");
        
        System.out.println("Ejercicio 4");
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        nums.add(1);
        nums.add(3);
        nums.add(4);
        Integer res = sumaArrayList(nums);
        System.out.println(res);
        
    }
    
    
    public static void imprimirNumerosPares() {
        for(int i = 1; i<=20; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
    
    public static void imprimirNombreInverso() {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Yasser");
        list.add("Miguel");
        list.add("Jose");
        list.add("Pepe");
        list.add("Arturo");
         
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
    
    public static void paisCapital() {
        HashMap<String, String> map = new HashMap<>();
        
        System.out.println("Ingrese el nombre del pais para obtener su capital");
        
        map.put("Peru", "Lima");
        map.put("España", "Madrid");
        
        Scanner scanner = new Scanner(System.in);
        
        String pais = scanner.next();
        
        System.out.println(map.get(pais));
    }
    
    
    public static int sumaArrayList(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i=0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
        }
        
        return sum;
        
    }
}

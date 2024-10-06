/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg03.bucles.colecciones.metodos;

import java.util.ArrayList;

/**
 *
 * @author Yasser
 */
public class TipoArrayList {
    
    public static void main(String[] args) {
        
        // ArrayList
        
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Hola");
        arrayList.add("Mundo");
        arrayList.add("Java");
        arrayList.add("AKDJF");
        arrayList.add("qejkr");
        arrayList.add("Hola");
        arrayList.add("Mundo");
        arrayList.add("Java");
        arrayList.add("AKDJF");
        arrayList.add("qejkr");
        arrayList.add("Hola");
        arrayList.add("Mundo");
        arrayList.add("Java");
        arrayList.add("AKDJF");
        arrayList.add("qejkr");
        arrayList.add("Hola");
        arrayList.add("Mundo");
        arrayList.add("Java");
        arrayList.add("AKDJF");
        arrayList.add("qejkr");
        arrayList.add("Hola");
        arrayList.add("Mundo");
        arrayList.add("Java");
        arrayList.add("AKDJF");
        arrayList.add("qejkr");
        arrayList.add("Hola");
        arrayList.add("Mundo");
        arrayList.add("Java");
        arrayList.add("AKDJF");
        arrayList.add("qejkr");

        for (int i = 0; i<1000; i++) {
            arrayList.add("" + i);
        }
        
        for(int i = arrayList.size() - 1; i>=0; i--) {
            arrayList.remove(8);
        }
        
        System.out.println(arrayList);
        
        /*
        for(String elemento : arrayList) {
            System.out.println(elemento);
        }


        System.out.println(arrayList.isEmpty());
        */
    }
    
}

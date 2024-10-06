/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg03.bucles.colecciones.metodos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Yasser
 */
public class TipoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> contactos = new HashMap<String, Integer>();
        
        contactos.put("Yasser", 943234123);
        contactos.put("Miguel", 143233123);
        contactos.put("Juan", 543234123);
        contactos.put("Jose", 643234123);
        contactos.put("Arturo", 443234123);
                
        Set<String> nombreContactos = contactos.keySet();
        
        System.out.println("Tus Contactos: ");
        
        for (String c : nombreContactos) {
            System.out.println("--> " + c);
        }
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del contacto");
        
        String nombreContacto = scanner.next();
        
        Integer numero = contactos.get(nombreContacto);
        
        if(numero == null) {
            System.out.println("El contacto no existe");
        } else {
            System.out.println("El numero de " + nombreContacto + " es : " + numero);
        }   
    }
    
    
    protected void holaMundo() {
        System.out.println("Hola Mundo");
    }
}

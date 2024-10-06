/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg04.poo;

/**
 *
 * @author Yasser
 */
public class Main {
    
    
    public static void main(String[] args) {
        Animal animal = new Animal("Sally", 5);
        Perro perro = new Perro("Golden", "Mimo", 5);
        Gato gato = new Gato("Naranja", "Mishifu", 2);
        
        animal.hacerSonido();
        perro.hacerSonido();
        gato.hacerSonido();
    }
    
}

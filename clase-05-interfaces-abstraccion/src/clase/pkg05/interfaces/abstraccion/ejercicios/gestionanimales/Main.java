/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg05.interfaces.abstraccion.ejercicios.gestionanimales;

/**
 *
 * @author Yasser
 */
public class Main {
    
    public static void main(String[] args) {
        Animal tigre = new Tigre();
        Animal pez = new Pez();
        Animal ave = new Ave();
        
        tigre.comer();
        pez.comer();
        ave.comer();
        
        tigre.mover();
        pez.mover();
        ave.mover();
        
    }
    
}

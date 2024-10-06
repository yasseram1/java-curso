/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg05.interfaces.abstraccion.ejercicios.abstracto;

/**
 *
 * @author Yasser
 */
public class Main {
    
    public static void main(String[] args) {
        Vehiculo auto = new Auto();
        Vehiculo moto = new Moto();
        
        auto.detener();
        moto.detener();
        
        auto.arrancar();
        moto.arrancar();
        
    }
    
}

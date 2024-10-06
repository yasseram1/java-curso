/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg05.interfaces.abstraccion.ejercicios.abstracto;

/**
 *
 * @author Yasser
 */
abstract class Vehiculo {
    
    public abstract void arrancar();
    
    public void detener() {
        System.out.println("El vehiculo se ha detenido");
    }
    
}

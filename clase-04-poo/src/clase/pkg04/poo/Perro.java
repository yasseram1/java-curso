/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg04.poo;

/**
 *
 * @author Yasser
 */
public class Perro extends Animal {
    
    private String raza;
    
    public Perro(String raza, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("El perro llamado " + getNombre() + " dice guau!");
    }
    
}

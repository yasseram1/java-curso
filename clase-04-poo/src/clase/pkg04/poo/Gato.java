/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg04.poo;

/**
 *
 * @author Yasser
 */
public class Gato extends Animal {
    private String color;

    public Gato(String color, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("El gato llamado " + getNombre() + " dice miau!");
    }
    
    
}

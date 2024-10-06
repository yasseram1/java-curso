/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg04.poo.ejercicio01;

/**
 *
 * @author Yasser
 */
class Coche extends Vehiculo {
    private String tipoDeMotor;


    public Coche(String marca, String modelo, String color, String tipoDeMotor) {
        super(marca, modelo, color);
        this.tipoDeMotor = tipoDeMotor;
    }

    public void cambiarMarcha() {
        System.out.println("Cambiando marcha...");
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    @Override
    public String toString() {
        return "Coche{" + "tipoDeMotor=" + tipoDeMotor + '}';
    }
    
    
}

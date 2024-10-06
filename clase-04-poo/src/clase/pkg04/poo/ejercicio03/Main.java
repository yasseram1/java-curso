/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg04.poo.ejercicio03;


/**
 *
 * @author Yasser
 */
public class Main {

    public static void main(String[] args) {
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        Animal miPajaro = new Pajaro();

        miPerro.hacerSonido();
        miGato.hacerSonido();
        miPajaro.hacerSonido();
    }
}

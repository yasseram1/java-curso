/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg04.poo.ejercicio02;

/**
 *
 * @author Yasser
 */
public class CuentaBancaria {

    private double saldo;
    private String nombreTitular;

    public CuentaBancaria(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    
    
    
    public void depositar(double saldoAdicional) {
        this.saldo = this.saldo + saldoAdicional;
    }
    
    public void retirar(double saldoRetirado) {
        
        double nuevoSaldo = this.saldo - saldoRetirado;
        
        if(nuevoSaldo < 0) {
            this.saldo = this.saldo;
            System.out.println("No cuenta con saldo suficiente para retirar");
        } else {
            this.saldo = this.saldo - saldoRetirado;
        }
        
    }
    
}

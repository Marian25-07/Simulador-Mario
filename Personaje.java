package com.mycompany.principal;

/**
 *
 * @author kerly
 */
public class Personaje {
    private String nombre;
    private int vida;
    private double resistencia;
    private int ataque;
    private int salto;
     
    public Personaje(String nombre, int vida, double resistencia, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.resistencia = resistencia;
        this.ataque = ataque;
        this.salto = 10; 
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public double getResistencia() {
        return resistencia;
    }

    public int getAtaque() {
        return ataque;
    }

    
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getSalto() {
        return salto;
    }

    
    public int darPuno() {
        System.out.println(this.nombre + " lanzó un puñetazo con " + this.ataque + " puntos de ataque.");
        return this.ataque;
    }

    public void saltar() {
        System.out.println(this.nombre + " saltó " + this.salto + " metros.");
    }

    public void recibirGolpe(int ataqueRecibido) {
        int valorADisminuir = (int)(ataqueRecibido * this.resistencia);
        System.out.println(this.nombre + " restó " + valorADisminuir + " puntos de vida por un ataque recibido.");
        this.vida -= valorADisminuir;
        
        if (this.vida <= 0) {
            this.vida = 0; 
            System.out.println(this.nombre + " se quedó sin vida.");
        }
    }
         public void mostrarEstado() {
        System.out.println(this.nombre + " tiene " + this.vida + " puntos de vida.");
         
    }
}

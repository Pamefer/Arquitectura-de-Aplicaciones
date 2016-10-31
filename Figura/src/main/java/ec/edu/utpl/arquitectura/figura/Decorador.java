/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.arquitectura.figura;

/**
 *
 * @author Pamela
 */
public abstract class Decorador extends Figura{
   
    protected Figura figuraBordeDecorado;

    public Decorador(Figura figuraBordeDecorado) {
        this.figuraBordeDecorado = figuraBordeDecorado;
    }
    

    public String dibujar(){
        return figuraBordeDecorado.dibujar();
    }
}

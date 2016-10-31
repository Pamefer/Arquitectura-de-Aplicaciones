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
public class Color extends Decorador{

    public Color(Figura figuraBordeDecorado) {
        super(figuraBordeDecorado);
    }
    
    public String dibujar(){
     return super.dibujar()+"Fuccia";
    }
}
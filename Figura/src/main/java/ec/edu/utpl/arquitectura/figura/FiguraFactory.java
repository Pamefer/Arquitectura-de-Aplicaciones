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
public class FiguraFactory implements FiguraFactorMetodo {

    
    public Figura crearFigura(int dibujar) {
        if (dibujar == 1) {
            return new Rectangulo();
        } else if (dibujar == 2) {
            return new Cuadrado();
        }
        return new Circulo();

    }

}

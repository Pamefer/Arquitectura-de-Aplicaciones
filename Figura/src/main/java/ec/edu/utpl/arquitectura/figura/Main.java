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
public class Main {
    public static void main(String[] args) {
        FiguraFactorMetodo figuras = new FiguraFactory();
       
        Figura f = figuras.crearFigura(1);
        System.out.println(f.dibujar());
        Figura borde= new Borde(f);
        Figura  color= new Color(borde);
        System.out.println("Figura: "+color.dibujar());
    }
}

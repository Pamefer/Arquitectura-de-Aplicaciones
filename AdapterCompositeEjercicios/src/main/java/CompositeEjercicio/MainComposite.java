/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositeEjercicio;

/**
 *
 * @author Pamela
 */
public class MainComposite {
    public static void main(String[] args) {
        Perro p= new Perro();
        Gato g = new Gato();
        Comprando compra= new Comprando();
        compra.aniadir(p);
        compra.aniadir(g);
        compra.comprar("Blanco");
        
        compra.eliminar(g);
        compra.comprar("Rojo");
        compra.clear();
    }
   
}

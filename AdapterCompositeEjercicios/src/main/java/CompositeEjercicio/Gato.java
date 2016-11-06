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
public class Gato implements Mascota {

    @Override
    public void comprar(String color) {
        System.out.println("He comprado un gato color: "+color);
    }
    
}
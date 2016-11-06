/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositeEjercicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pamela
 */
public class Comprando implements Mascota {

    
    private List<Mascota> mascota= new ArrayList<Mascota>();

    
    
    
    @Override
    public void comprar(String color) {
        for (Mascota mascota1 : mascota) {
            mascota1.comprar(color);
        }
    }
    
    public void aniadir(Mascota a){
        this.mascota.add(a);
    }
    
     public void eliminar(Mascota a){
         
        this.mascota.remove(a);
    }
	public void clear(){
		System.out.println("Se ha borrado todas las mascotas compradas");
		this.mascota.clear();
	}
     
}

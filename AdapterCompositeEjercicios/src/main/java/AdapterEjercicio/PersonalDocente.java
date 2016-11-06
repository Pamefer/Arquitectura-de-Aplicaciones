/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterEjercicio;

/**
 *
 * @author Pamela
 */
public class PersonalDocente extends Personal{

    public PersonalDocente() {
        super();
    }

    @Override
    public void ingresarSueldo() {
        System.out.println("Ingresa Sueldo Docentes");
    }

    @Override
    public void ingresarNombres() {
        System.out.println("Ingresa Nombres Docentes");
    }
    
}

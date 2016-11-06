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
public class PersonalLimpiezaAdapter extends Personal{
    PersonalLimpieza persLimpieza;

    public PersonalLimpiezaAdapter() {
        this.persLimpieza = new PersonalLimpieza();
    }

    @Override
    public void ingresarSueldo() {
        System.out.println("Ingresa Sueldo Personal de Aseo");
        this.persLimpieza.ingresarGastosAseo();
        this.persLimpieza.ingresarHorasExtra();
    }

    @Override
    public void ingresarNombres() {
        System.out.println("Ingresa nombres Personal de Aseo");
    }
}

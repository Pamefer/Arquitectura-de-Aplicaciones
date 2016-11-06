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
public class MainPersonal {
    public static void main(String[] args) {
        System.out.println("-------Sin Adapter --------");
        PersonalDocente pd = new PersonalDocente();
        pd.ingresarNombres();
        pd.ingresarSueldo();
        System.out.println("--------Uso Adapter-------");
        PersonalLimpiezaAdapter pla= new PersonalLimpiezaAdapter();
        pla.ingresarNombres();
        pla.ingresarSueldo();
    }
}

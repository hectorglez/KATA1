/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalab1;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class PracticaLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Person hector = new Person("Hector", "Gonzalez", new Date(94, 7, 17));
        Person p1 = new Person(null, null, null);
        System.out.println(hector.getFullName());
        System.out.println(hector.getAge());
    }
}

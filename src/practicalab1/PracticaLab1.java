/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalab1;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
        Calendar f1 = GregorianCalendar.getInstance();
        f1.set(1994,7,17);
        Person hector = new Person("Hector", "Gonzalez",f1);
        Person p1 = new Person(null, null, null);
        System.out.println(hector.getFullName());
        System.out.println(hector.getAge());
    }
}

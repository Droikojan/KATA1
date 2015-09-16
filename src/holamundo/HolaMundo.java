/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Adiós Mundo");

        Calendar f1 = GregorianCalendar.getInstance();
        f1.set(1964, 7, 3);
        Person p1 = new Person("Francisco", "García", f1);
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Date;

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

        Person p1 = new Person("Francisco", "García", new Date(64, 7, 3));
        System.out.println(p1.getBirthday());
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());
    }
}

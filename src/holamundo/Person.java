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
public class Person {
    private final String name;
    private final String surName;
    private final Date birthday;
    private long MILLESECOND_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, String surName, Date birthday) {
        this.name = name;
        this.surName = surName;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public String getFullName() {
        return name + " " + surName;
    }
    
    public int getAge() {
        Date today = new Date();
        
        return (int) getMillis(today.getTime() - birthday.getTime());
    }
    
    private long getMillis(long milli) {
        return milli/MILLESECOND_PER_YEAR;
    }

}

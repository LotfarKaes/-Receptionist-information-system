/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;

import java.util.Calendar;
import java.util.GregorianCalendar;
//import projectoop.DatabaseHandler;
/**
 *
 * @author Lotfar Kaes
// */

/*
 * Developed at Kristianstad University with Combitech AB 
 * URL: http://www.hkr.se
 */

import java.util.Scanner;
public class Projectoop {

    /**
     * @param args the command line arguments
     */
    
    private String name;
    private String country;
    private String company;
    private String admin;
    
    public Projectoop( String name,String country,String company,String admin ){
        
        this.name=name;
        this.country=country;
        this.admin=admin;
        this.company=company;
    }
    
    
    
    public static void main(java.lang.String[] args) {
        // TODO code application logic here
       // DatabaseHandler dbHandler = new DatabaseHandler("jdbc:mysql://localhost/exam20120512", "andreas", "andreas");
        
        // Execute a select command
        //dbHandler.executeSelect("Select * FROM cars");
      
 
        
        welcome ob = new welcome();
        ob.main(args);
        
        
        
        Scanner input=new Scanner(System.in);

        
        
   String name=input.next();
   String country=input.next();
   String company=input.next();
   String admin=input.next();
       
        
//        visitor oob = new visitor ();
//        oob.main(args);
    }

    /**
     * @return the name
     */
    public String getName() {
        
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the admin
     */
    public String getAdmin() {
        return admin;
    }

    /**
     * @param admin the admin to set
     */
    public void setAdmin(String admin) {
        this.admin = admin;
    }
}

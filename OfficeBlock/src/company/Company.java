/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company;

import employee.*;

/**
 *
 * @author chrystiandybas
 */
public class Company {
    
    //Properties
    private String companyName;
    private String ownerName;
    private Employee e1, e2, e3;

    public Company(String companyName, String ownerName) {
        this.companyName = companyName;
        this.ownerName = ownerName;
        hireStaff(5);
        
    }
    public void hireStaff(int numOfStaff){
        
        //NOTE FROM KEN
        /*
        We will have to change this code in a few weeks
        
        at the moment, it does not use the numOfStaff at all
        
        */
        //make a simple employee
        
        e1 = new Employee("Ken", "Healy", 1, "Menial Android", "12345TY");
        
        //now make a project manager
        
        e2 = new ProjectManager("Sarah", "Costa", 2, "4523623QW");
        
        e3 = new JavaSpecialist("Chrystian", "Dybas", 3, "gyewey21");
    }
    
    public void startWork(){
        
        /*
        THIS WILL ALSO NEED TO BE CHANGED
        IT ISNT GOOD YET
        */
        System.out.println(e1);
        System.out.println(e1.getFirstName()+ " is a " + e1.getJobTitle());
        System.out.println(e2.getFirstName()+ " is a " + e2.getJobTitle());
        System.out.println(e3.getFirstName()+ " is a " + e3.getJobTitle());
        
        
        System.out.println(e1.getFirstName() + " says" +  e1.work());
        System.out.println(e2.getFirstName() + " says" +  e2.work());
        System.out.println(e3.getFirstName() + " says" +  e3.work());
        
        
    }
    
}

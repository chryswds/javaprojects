/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *javaSpecialist is a subclass of Employee
 * 
 * Employee is a super class of javaSpecialist
 * @author chrystiandybas
 */
public class JavaSpecialist extends Employee{
    
    public JavaSpecialist(String firstName, String surname, int employeeID, String PPSN) {
        super(firstName, surname, employeeID, "Java Specialist", PPSN);
        
        this.wallet = 100;
    }
    
    
}

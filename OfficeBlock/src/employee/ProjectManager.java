/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**ProjectManager is a sub class of employee
 * 
 * Employee is a superclass of project manager
 *
 * @author chrystiandybas
 */
public class ProjectManager extends Employee{
    
    public ProjectManager(String firstName, String surname, int employeeID, String PPSN) {
        super(firstName, surname, employeeID, "Project Manager", PPSN);
    }
    
    @Override
    public String work(){
        return ("I am managing this Project");
        
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author chrystiandybas
 */
public class Employee {
    
    //Properties
    private String firstName;
    private String surname;
    private int employeeID;
    private String jobTitle;
    private String PPSN;
    protected double wallet; //can be accessed by child class
    
    //Constructors

    public Employee(String firstName, String surname, int employeeID, String jobTitle, String PPSN) {
        this.firstName = firstName;
        this.surname = surname;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.PPSN = PPSN;
        this.wallet = 0;
        
    }
    //Methods (Abilities)
    
    public String work(){
        return ("Hi ho, hi ho... it's off to work i go");
    }

    
    //Getters and setters
    
    //rule -- only have a settter if you should be able to change the value
    //rule -- only have a getter if 'something else' is allowed to see the value
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getWallet() {
        return wallet;
    }
    //get  rid of setter for wallet
    

    public int getEmployeeID() {
        return employeeID;
    }

    public String getPPSN() {
        return PPSN;
    }
    
    @Override
    public String toString(){
        
        return this.firstName + "\n" + " " + this.surname + "\nJob Title:\t" + this.jobTitle;
    }
    
    
}

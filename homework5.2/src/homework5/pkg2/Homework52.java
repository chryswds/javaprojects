/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework5.pkg2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author chrystiandybas
 */
public class Homework52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myKB = new Scanner(System.in);
        
        
        int year = 0;
        int plates = 0;
        String county = "a";
        
        try{
            BufferedWriter myWriter = new BufferedWriter(new FileWriter("licenses.txt", false));
            
            while(year < 1990 || year > 2020){
                System.out.println("Enter a year ( 1990 - 2020 )");
                year = myKB.nextInt();
            }
            
            do{
                System.out.println("Enter a county:");
                county = myKB.next().toUpperCase();
                
            }while(!county.matches("[a-zA-Z .,?!\"]+"));
            
            
            while(plates < 0001 || plates > 9999){
            System.out.println("Enter an amout of plates ( 1 - 9999 )");
            plates = myKB.nextInt();
            
            }
            
            char firstLetter = county.charAt(0);

            
        for (int amount = 1; amount <= plates; amount++){
            
            String stringAmount = String.format("%05d", amount);
            
            myWriter.write(String.valueOf(year).substring(2) + " - " + firstLetter + " - " + stringAmount + "\n");
        }
        
        myWriter.close();
            
            
        }catch(Exception e){    
            System.out.println("Error");
        }
        
    }
    
}

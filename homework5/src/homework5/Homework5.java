/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework5;

import java.util.Scanner;

/**
 *
 * @author chrystiandybas
 */
public class Homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myKB = new Scanner(System.in);
        int choice = 0;

        while(choice != 4){
            
            try{  
                System.out.println("Ice-cream menu \n"
                + "1) Raspberry \n"
                + "2) Chocolate \n"
                + "3) Vanilla \n"
                + "4) Leave Shop \n"
                + "Choose option!!");
            
                choice = myKB.nextInt();
            
                    switch (choice) {
                        case 1:
                            System.out.println("You chose raspberry, get another one!");
                            break;
                        case 2:
                            System.out.println("You chose chocolate, get another one!");
                            break;
                        case 3:
                            System.out.println("You chose vanilla, get another one!");
                            break;
                        case 4:
                            System.out.println("You chose to leave, bye!!");
                            break;
                        default:
                            System.out.println("You need to choose a valid option, please enter 1 - 4");
                            break;
                }
            } catch(Exception e){
                System.out.println("You need to choose a valid option, please choose 1 - 4");
                myKB.nextLine();
            }
        }   
    }    
        
    }            



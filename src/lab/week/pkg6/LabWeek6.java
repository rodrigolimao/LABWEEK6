 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.week.pkg6;

import java.util.Scanner;

/**
 *
 * @author rodrigolima
 */
public class LabWeek6 {


    public static void main(String[] args)
    {        
        /**
         * 1.  Using a while loop, display the numbers 1-100 on the screen - 1 # on each line
         */
        int count = 1;
        while (count <= 100)
        {
            System.out.printf("%n%3d", count);
            count++;
        }  
        
        /**
         * 2.  Using a while loop, display the numbers 2-100 on the screen
         *     going up in units of 2.  For example 2, 4, 6, 8 ... 96, 98, 100
         */
        int count2 = 2;
        while (count2 <= 100)
        {
            System.out.printf("\n%d" , count2);
            count2 += 2;
        }
        
        /**
         * 3.  Using a while loop, display the numbers 100-1 on the screen
         *     going down in units of 5.  For example 100, 95, 90, 85...10, 5
         */
        int count3 = 100;
        while (count3 >= 1)
        {
            System.out.printf("\n%d", count3);
            count3 -= 5;
        }

        /**
         * 4.  Using a while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 10
         */
        Scanner keyboard = new Scanner(System.in);
        Boolean stopnumber = false;
        
            while (stopnumber == false) {
                    System.out.printf("Please enter another number:");
            int usernumber = keyboard.nextInt();
            if (usernumber == 10)
                stopnumber = true;
        }
        
        /**
         * 5.  Using a do...while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 15
         */
        Boolean printnumber = false;
        do {
              System.out.printf("Please enter a number:");
            int usernumber = keyboard.nextInt();
            if (usernumber == 15)
                printnumber = true;
        }  while (printnumber == false);
        
        
        /**
         * 6.  Using a for loop, display the numbers 1-100 on the screen
         */
        for (count = 1; count <= 100; count++) 
        {  
         System.out.println(count);
        }
        
        /**
         * 7.  Using a for loop, display the numbers 2-100 on the screen, going up in steps of 2
         */
        for 
                (int count7 = 2; count7 <= 100; count7 += 2)
        {
            System.out.println(count7);
        }
        
        /**
         * 8.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 1
         */
        for 
                (int count8 = 100; count8  >= 0; count8 -= 1)
        {
            System.out.println(count8);
         } 
        
        /**
         * 9.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 5
         */
        for 
                (int count9 = 100; count9 >= 0; count9 -= 5)
        {
            System.out.println(count9);
        }
        
        /**
         * 10. Using the loop style of your choice, write a program that will display the numbers 1-100, where each
         *     number is on it's own line.  
         *      
         *     ->If the number displayed is divisible by 4, write your first name after the number.
         *     ->If the number displayed is divisible by 9, write your last name
         *     ->If the number displayed is divisible by both 4 & 9, write your first name a space and then your last name.
         */
        
        for (int count10 = 1; count10 <= 100; count10++)
        {
            String firstname = "Rodrigo";
            String lastname =  "Lima";
            if (count10 %4 == 0 && count10 %9 == 0) {
                System.out.println(count10 + " " + firstname + " " + lastname);
            }
            else if (count10 %4 == 0) {
                System.out.println(count10 + " " + firstname);
            }
            else if (count10 %9 == 0) {
                System.out.println(count10 + " " + lastname);
            }
            else {
                System.out.println(count10);
            }
        }
    }
    
}


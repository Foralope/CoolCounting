/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coolcounting;
import java.util.Scanner;
/**
 *
 * @author wizwa9381
 */
public class CoolCounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Scanner keyedInput = new Scanner(System.in);
        int userInput = 0;
        //Loop
        while (userInput != 5) {
            System.out.println("----Cool Counting Program----");
            System.out.println("Enter your choice.");
            System.out.println("1. Count from 0 to 10 by 1");
            System.out.println("2. Count from 100 to 0 by 10");
            System.out.println("3. Count from 50 to 500 by 50");
            System.out.println("4. Count from 6000 to 1000 by 1000");
            System.out.println("5. Exit the program.");
            //Time to count!!!
            System.out.println("----------------------------------------------");
            userInput = keyedInput.nextInt();
            System.out.println("----------------------------------------------");
            //Which one did they pick?
            switch (userInput) {
                case 1:
                    for (int i = 0; i <= 10; i = i + 1)
                    {
                        System.out.println(i);
                    }
                break;
                case 2:
                    for (int i = 100; i >= 0; i = i - 10)
                    {
                        System.out.println(i);
                    }
                break;
                case 3:
                    for (int i = 50; i <= 500; i = i + 50)
                    {
                        System.out.println(i);
                    }
                break;
                case 4:
                    for (int i = 6000; i >= 1000; i = i - 1000)
                    {
                        System.out.println(i);
                    }
                break;
        }
    }
    
}
}
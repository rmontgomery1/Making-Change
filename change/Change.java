
package change;

import java.util.Scanner;


public class Change 
{

    
    public static void main(String[] args) 
    {
        double number = 0;
        int dimes = 0;
        double chanegeC=0;
        double changeD=0;
        double changeE=0;
        int halfdollar=0;
        double changeA = 0;
        int dollars = 0;
        double changeB = 0;
        int nickles = 0;
        double pennies = 0;
        int quaters=0;
        double changeC=0;
        double changeF=0;
        System.out.println("We are going to make change today.");
        System.out.println("Please enter an amount in dollars and cents.");
        Scanner in = new Scanner (System.in);
        number = in.nextDouble();
        dollars = (int) number;
        changeA = number-dollars;
        //half dollars
       
        
            changeB = changeA%.5;
            changeA= changeA/.5;
            halfdollar = (int) changeA;
            
        
        
            changeC = changeB%.25;
            changeB= changeB/.25;
            quaters = (int) changeB;
        
        
        
            changeD = changeC%.10;
            changeC= changeC/.10;
            dimes = (int) changeC;
        
       
            changeE = changeD%.05;
            changeD= changeD/.05;
            nickles = (int) changeD;
            pennies = changeE/.01;
    
        
        
        
        
        System.out.println("The amount of bills: " + dollars);
        System.out.println("The amount of Half Dollars" + halfdollar);
        System.out.println("The amount of Quaters" + quaters);
        System.out.println("The amount of Dimes " + dimes);
        System.out.println("The amount of Nickles" + nickles);
        System.out.println("The amount of Pennies" + Math.round(pennies));
        System.out.println("This is change A "+changeA);
        System.out.println("This is change B "+changeB);
        System.out.println("This is change C "+changeC);
        System.out.println("This is change D "+changeD);
        System.out.println("This is change E "+changeE);
        System.out.println("This is dollars Dollars" + dollars);

    }

    
}

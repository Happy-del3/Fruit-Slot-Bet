/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitslotbet;
 
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class FruitslotBet {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // declare variables and constants
        int choice = 0;
        int amount = 0,amountBet;
        
        String strInput = JOptionPane.showInputDialog(null,"Please select from the below" + "\n\n" +
                                                          "1 --- Play Fruit Slot Bet" + "\n" +
                                                          "2 --- End Program");
        int input = Integer.parseInt(strInput);       

        while(input!=2){
            if(input==1){
                String strAmount = JOptionPane.showInputDialog(null,"Bet with R1 / R2 / R5");
                amountBet = Integer.parseInt(strAmount);
        
                if(amountBet==1 || amountBet==2 || amountBet==5){
                    String strChoice = JOptionPane.showInputDialog(null,"Choose your choice" + "\n" +
                                                                        "------------------" + "\n" +
                                                                        "1-----> Bar" + "\n" +
                                                                        "2-----> 77" + "\n" +
                                                                        "3-----> Star" + "\n" +
                                                                        "4-----> Bell" + "\n" +
                                                                        "5-----> WaterMelon" + "\n" +
                                                                        "6-----> Coconut" + "\n" +
                                                                        "7-----> Orange" + "\n" +
                                                                        "8-----> Apple" + "\n");
            
                    choice = Integer.parseInt(strChoice);        
         
                    String position = "";
                    if(choice==1 ||choice==2 || choice==3 || choice==4 ||
                        choice==5 || choice==6 || choice==7 || choice==8){
                        int randomChoice = 1 + (int)Math.floor(Math.random()*8);
                        switch(randomChoice){
                            case 1: position = "Bar";
                                break;
                            case 2: position = "77";
                                break;
                            case 3: position = "Star";
                                break;
                            case 4: position = "Bell";
                                break;
                            case 5: position = "WaterMelon";
                                break;
                            case 6: position = "Coconut";
                                break;
                            case 7: position = "Orange";
                                break;
                            case 8: position = "Apple";
                                break;
                         
                        }
                        if(position=="Bar"){
                            amount=50 + amountBet;
                        }
                        if(position=="77"){
                            amount=30 + amountBet;
                        }
                        if(position=="Star"){
                            amount=10 + amountBet;
                        }
                        if(position=="Bell"){
                            amount=15 + amountBet;
                        }
                        if(position=="WaterMelon"){
                            amount=20 + amountBet;
                        }
                        if(position=="Coconut"){
                            amount=25 + amountBet;
                        }
                        if(position=="Orange"){
                            amount=35 + amountBet;
                        }
                        if(position=="Apple"){
                            amount=5 + amountBet;
                        }
                        if(choice==randomChoice){
                            JOptionPane.showMessageDialog(null, "Your choice is " + choice + "\n" +
                                                                "Random position is " + position + "\n" +
                                                                "You Win R" + amount);
                        
                        }else{
                            JOptionPane.showMessageDialog(null, "Your choice is " + choice + "\n" +
                                                                "Random position is " + position + "\n" +
                                                                "You Lose.");
                        }
                    }else{
                    JOptionPane.showMessageDialog(null, "Please enter EITHER 1 or 2");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Selection");
            }
            strInput = JOptionPane.showInputDialog(null,"Please select from the below" + "\n\n" +
                                                          "1 --- Play Fruit Slot Bet" + "\n" +
                                                          "2 --- End Program");
            input = Integer.parseInt(strInput);
            }
        JOptionPane.showMessageDialog(null,  "\nFRUIT SLOT BET" + "\n" +
                                             "-------------------------------" + "\n" +
                                             "TRY YOUR LUCKY CHARM" + "\n" + 
                                             "Kind Regards" + "\n" +
                                             "MH Mabena" + "\n" +
                                             "__________");
       
    }
}

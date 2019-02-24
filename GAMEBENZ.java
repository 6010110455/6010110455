import java.io.*;
import java.util.*;
import java.util.Scanner;
public class GAMEBENZ
{
    public static void main(String args[])
    {
        Novice novice = new Novice();
        Bag bag = new Bag();

        System.out.println("Your HP: "+ novice.getHp());
        System.out.println("Your EXP: "+ novice.getExp());
        System.out.println("Your LV: "+ novice.getLv());
        System.out.println("------------");
        System.out.println("|| prees 1 attact Monster.");
        System.out.println("|| press 2 Use Posion from Bag.");
        System.out.println("|| prees 5 Show your status.");
        System.out.println("|| prees 0 give up");
        System.out.println("==>>");
        Scanner scr = new Scanner(System.in);
        while(novice.getHp() != 0){
            int data = scr.nextInt();
            if(data == 1) {
                novice.att();
                bag.getitem();
            }
            else if(data == 0) novice.dead();
            else if(data == 5) {
                bag.showallinbag();
            }
            else if(data == 2) {  //heal
                novice.heal(bag.usepotion());
                bag.useItem();
            }
            System.out.println("Your HP: "+ novice.getHp());
            System.out.println("Your EXP: "+ novice.getExp());
            System.out.println("Your LV: "+ novice.getLv());
            System.out.println("------------");
            System.out.println("prees 1 to attact Monster.");
            System.out.println("press 2 Use Posion from Bag.");
            System.out.println("prees 5 Show your status and item in bag.");
            System.out.println("prees 0 give up");
            System.out.println("==>>");
            if(lv=25){
                myChar.changClass();
                Scanner sc = new Scanner(System.in);
                System.out.print("Pleas select class : ");
                int data1 = sc.nextInt();
                if (data1 == 1){
                    myChar.Acholyte();
                }
                else if(data1 == 2){
                    myChar.Magician();
                }
                else if(data1 == 3){
                    myChar.Swordsman();
                }
                else{
                    System.out.println("EROR!!");
                }
        
        System.out.println("----------------------");
        System.out.println("Finished chang class");

            }
        }
        
        System.out.println("-----End Game-----");
    }
    
}
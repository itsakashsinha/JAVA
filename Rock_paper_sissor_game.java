package com.company;
import java .util.Scanner;
import java.util.Random ;  // Importing random num generator
public class Rock_paper_sissor_game {
    public static void main(String[] args) {


        Random rand = new Random();                 // Calling random num generator
        Scanner sc = new Scanner(System.in);        // Calling Scanner class

        System.out.println("Enter Your name :");
        String playerName= sc.next();                // scaning player Name
        int cpoint=0, ppoint=0 ,cin,pin;            // Computer and Player point

        for(int i=0 ; i<3 ; i++) {
            System.out.println("Enter 0. for Paper , 1. for sissor , 2. for Rock ");
            pin = sc.nextInt();                      // player input

            cin = rand.nextInt(2);              // computer input ( it will generate 0 - 2 random numbers
            System.out.println(cin);

                if ((pin == 0 && cin == 1) || (pin == 1 && cin == 0))         // condition paper / sissor
                {
                    if (pin == 0 && cin == 1) {
                        cpoint++;
                    } else {
                        ppoint++;
                    }
                }

                if ((pin == 0 && cin == 2) || (pin == 2 && cin == 0)) // condition paper / Rock
                {
                    if (pin == 0 && cin == 2) {
                        ppoint++;
                    } else {
                        cpoint++;
                    }
                }

                if ((pin == 1 && cin == 2) || (pin == 2 && cin == 1)) // condition sissor/ Rock
                {
                    if (pin == 1 && cin == 2) {
                        cpoint++;
                    } else {
                        ppoint++;
                    }
                }
        }
        System.out.println(ppoint);     // player's point
        System.out.println(cpoint);     // computer's point
    if((cpoint<ppoint) || (cpoint>ppoint))
    {
        if (cpoint<ppoint) {

            System.out.println(playerName+" wins !!!");
        }
        else {
            System.out.println("Computer wins!!!");
        }
    }
    else{
        System.out.println("It's a draw !");
    }

    }
}




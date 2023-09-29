/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javareview1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wellington-mariano
 */
public class JavaReview1 {

    public static void main(String[] args) throws IOException {
        int option = mainMenu();
        if (option == 1) {
           getData(); 
        }
    }
   
    public static int mainMenu() throws IOException {
        System.out.println("Welcome user!");
        System.out.println("What would you like to do?");
        System.out.println("1: Initialise program with data");
        System.out.println("2: Select team to view performance");        
        Scanner sc = new Scanner(System.in);
        int option_sc = sc.nextInt();      
        
        return option_sc;
    }
  
    public static void getData() throws IOException{
        BufferedReader fileReader = new BufferedReader(new FileReader("/home/wellington-mariano/Documents/FantasyFootballData2.csv"));
        String line;
        
        ArrayList<Player> players = new ArrayList<>();
        
        while((line = fileReader.readLine()) != null){
            //System.out.println(line);
            String[] values = line.split(",");
            if(values[2].equals("Forward")) {
                Forward player = new Forward(values[0], values[1], values[2], Integer.parseInt(values[3]), values[4]);
                players.add(player);
            }else{
                Player player = new Player(values[0], values[1], values[2], Integer.parseInt(values[3]), values[4]);
                players.add(player);
            }
        }
        for (Player arrEl : players)
        {
            System.out.println(arrEl);
        }
    }
    

}
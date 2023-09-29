/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javareview1;

/**
 *
 * @author wellington-mariano
 */
public class Stricker extends Player{
    
    private int numGoalsScored;
    public Stricker(String name, String surname, String country, int age, String position) {
        super(name, surname, country, age, position);
        this.numGoalsScored = numGoalsScored;
    }

    public int getNumGoalsScored() {
        return numGoalsScored;
    }

    public void setNumGoalsScored(int numGoalsScored) {
        this.numGoalsScored = numGoalsScored;
    }
}

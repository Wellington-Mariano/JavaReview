/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javareview1;

/**
 *
 * @author wellington-mariano
 */
public class Forward extends Player {
    
    private int numsGoalScored;
    
    public Forward(String name, String surname, String country, int age, String position) {
        super(name, surname, country, age, position);
        this.numsGoalScored = numsGoalScored;
    }

    public int getNumsGoalScored() {
        return numsGoalScored;
    }

    public void setNumsGoalScored(int numsGoalScored) {
        this.numsGoalScored = numsGoalScored;
    }

    @Override
    public String toString() {
        return "Forward{" + "numsGoalScored=" + numsGoalScored + '}';
    }
    
}

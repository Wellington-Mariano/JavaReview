/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javareview1;

/**
 *
 * @author wellington-mariano
 */
public class Player implements equalActions {
    private String name;
    private String surname;
    private String country;
    private int age;
    private String position;

    public Player(String name, String surname, String country, int age, String position) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.age = age;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", surname=" + surname + ", country=" + country + ", age=" + age + ", position=" + position + '}';
    }
    
    @Override
    public void pass(){
        System.out.println("Passed!");
    }
    
    @Override
    public void dive(){
        System.out.println("Dove!");
    }
    
    @Override
    public void shoot(){
        System.out.println("Shoot!");
    }
    
    @Override
    public void header(){
        System.out.println("Head!");
    }
    
    @Override
    public void block(){
        System.out.println("Blocked!");
    }
}

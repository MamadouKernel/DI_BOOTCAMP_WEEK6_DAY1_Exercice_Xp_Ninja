/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicexpninja.exercice1;

/**
 *
 * @author kernel-mk
 */
public class DataType {
    
  int age;
  double weight;
  boolean isStudent;
  char gender;
  String name;
  
  public DataType(int age, double weight, boolean isStudent, char gender, String name) {
    this.age = age;
    this.weight = weight;
    this.isStudent = isStudent;
    this.gender = gender;
    this.name = name;
  }
  
  public void displayInfo() {
    System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Weight: " + weight + ", IsStudent: " + isStudent);
  }
    
}

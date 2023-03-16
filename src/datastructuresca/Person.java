/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca;

public class Person {
    
//    Basic Info
    private String name;
    private int age;
    
//    Sorting Info
    private boolean hasMedicalCondition;
    private int priority = 0;
    
    public Person(String name, int age, boolean hasMedicalCondition){
        this.name = name;
        this.age = age;
        this.hasMedicalCondition = hasMedicalCondition;
        this.priority = this.calculatePriority();
    }
    
    private int calculatePriority(){
        if(this.age >= 90){
            return 10;
        }else if (this.age >= 80){
            return 9;
        } else if (this.age >= 70){
            return 8;
        }else if (this.age >= 65){
            return 7;
        }else if (this.age >= 18 && this.hasMedicalCondition){
            return 6;
        }else if (this.age >= 55){
            return 5;
        }else if (this.age >= 45){
            return 4;
        }else if (this.age >= 30){
            return 3;
        }else if (this.age >= 18){
            return 2;
        }else if (this.age >= 0){
            return 1;
        }else{
            System.out.println("Person has an invalid age!!!!!!");
            return 0;
        }
    }
    
//  GETTERS
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public boolean getHasMedicalCondition(){
        return this.hasMedicalCondition;
    }
    public int getPriority(){
        return this.priority;
    }
}

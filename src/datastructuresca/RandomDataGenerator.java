/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Evan
 */
public class RandomDataGenerator {
    
    private String[] firstNames = {"Evan", "Kevin", "Erik", "Ryan", "Alex", "Josh", "John", "Bob", "Harold", "Chloe", "Kara", "Elizabth", "Katie", "Fabiola", 
        "Rebecca", "Jo", "Alix", "Adam", "Edith", "Emma", "Gabrielle", "Glenn", "Felicia", "Ivan", "Jade", "Jane" , "Jennifer"};
    
    private String[] secondNames = {"O\'Rourke", "Armantrout", "Banks", "Beaumont", "Charters", "Chechik", "Cutwright", "David", "Diamond", "Douglas", "Edwards", "Ellison", "Evans", 
        "Fairchild", "Farwell", "Fernandes", "Gillman", "Goodman", "Hammer", "Hennessy", "Kaalberg", "Kendall", "Lawson", "Lincoln", "Manning", "Nando" , "Oliveira"};
    
    public RandomDataGenerator(){
        System.out.println(firstNames.length + " : " + secondNames.length);
    }
    
    public Person generateRandomPerson(){
        return new Person(generateRandomName(), generateRandomInt(), generateRandomBoolean());
    }
    
    private int generateRandomInt(){
        Random r = new Random();
        int min = 0;
        int max = 100;
        int num = r.nextInt((max - min) + 1) + min;
        
        return num;
    }
    
    private boolean generateRandomBoolean(){
        Random r = new Random();
        int min = 0;
        int max = 10; // 1 in 10 people will have medical condition
        int num = r.nextInt((max - min) + 1) + min;
        
        if(num == 0) return false;
        return true;
    }
    
    private String generateRandomName(){
        return getRandomElement(firstNames) + " " + getRandomElement(secondNames);
    }
    
    private String getRandomElement(String[] arr){
        Random r = new Random();
        int min = 0;
        int max = arr.length-1;
        int num = r.nextInt((max - min) + 1) + min;
        
        return arr[num];
    }
}

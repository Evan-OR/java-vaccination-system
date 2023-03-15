/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca;
import java.util.ArrayList;
/**
 *
 * @author Evan
 */
public class VaccinationList {
    
    private ArrayList<Person> queue = new ArrayList<>();
    static String[] priorityGroups = {"Under 18", "19-29", "30-44", "45-54", "55-64", "18-64 with medical condition(s)", "65-69", "70 and older", "80 and older", "90 and older"};
    
    public VaccinationList(){};
    
    public void insertPerson(Person p){
        //ArrayList is Empty
        if(queue.size() == 0){
            queue.add(p);
            return;
        }
        
        for(int i = 0; i < queue.size(); i++){
            if(queue.get(i).getPriority() > p.getPriority()){
                queue.add(i, p);
                return;
            }
        }
        
        //If Person was never added
        queue.add(p);
    }
    
    public String getDetails(){
        String str = "";
        for(Person p : queue){
            str += "-------------------------" + "\n" +
                   "Name: " + p.getName() + "\n" + 
                   "Age: " + p.getAge() + "\n" + 
                   "Has Medical Condition: " + p.getHasMedicalCondition()+ "\n" + 
                   "Priority Group: People aged " + priorityGroups[p.getPriority()-1] + "\n";
        }
        return str;
    }
    
    public int getNumberOfRegistrations(){
        return queue.size();
    }
    
    public String showNextPriorityGroup(){
        if (queue.size() == 0) return "Queue Is Empty!";
        
        return priorityGroups[queue.get(queue.size()-1).getPriority()-1];
    }
}

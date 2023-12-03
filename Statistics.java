/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recyclingservice;

import java.util.ArrayList;

/**
 *
 * @author TOSHIBA
 */
public class Statistics{
    private ArrayList <Goal> completedGoalsS;
    private ArrayList <Goal> goalsS;
 
   public Statistics(ArrayList<Goal> completedGoals, ArrayList <Goal> goals){
       this.completedGoalsS = completedGoals;
       this.goalsS = goals;
        
    }
   
   public double computeTotalRecycledAmount(){
       double totalRecycledAmount = 0.0;
       for( Goal goal: goalsS){
           totalRecycledAmount = goal.getCurrentAmount() + totalRecycledAmount;
       }
       return totalRecycledAmount;
   }
   
    public ArrayList<Goal> getCompletedGoals(){
       return completedGoalsS;
   }
   
    public void setCompletedGoals(ArrayList<Goal> completedGoals){
        this.completedGoalsS = completedGoals;
    }

    public ArrayList<Goal> getGoals(){
        return goalsS;
    }
    
    public void setGoals(ArrayList<Goal> goals){
        this.goalsS = goals;
    }
}
    
    


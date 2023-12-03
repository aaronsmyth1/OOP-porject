/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recyclingservice;

import java.io.Serializable;

/**
 *
 * @author TOSHIBA
 */
public class Goal implements Serializable{
    private String deadline;
    private String material;
    private double targetAmount;
    private double addAmount;
    private double currentAmount;
    protected boolean goalAchieved;



public Goal(){
    deadline = "";
    material = "";
    targetAmount = 0.0;
    addAmount = 0.0;
    currentAmount = 0.0;
    goalAchieved = false;
}

public Goal(String deadline, String material, double targetAmount, double addAmount){
    this.deadline = deadline;
    this.material = material;
    this.targetAmount = targetAmount;
    this.addAmount = addAmount;
    
}

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public double getAddAmount() {
        return addAmount;
    }

    public void setAddAmount(double addAmount) {
        this.addAmount = addAmount;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }
    
    
    
    public void computeCurrentAmount(){
        currentAmount = currentAmount+addAmount;
    }
    
     public String getGoalDetails(){
        return "Goal details : Deadline: "+deadline+" \n, Material: "+material+" ,\n Target Amount: "+targetAmount +"\n You added: "+addAmount+ " \ncurrently on: "+currentAmount ; 
    }
    
    public void computeGoalAchieved(){
      goalAchieved  = (currentAmount >= targetAmount);
    } 
    
    public boolean isGoalAchieved(){
        return goalAchieved;
    }
        
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recyclingservice;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import recyclingservice.HomePage;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author TOSHIBA
 */
public class goalsGUI extends javax.swing.JFrame implements Serializable {
     private ArrayList <Goal> goals;
     private ArrayList <Goal> completedGoals;
     private ArrayList <Goal> incompleteGoals;
     private ArrayList <Statistics> selectedGoal;
  
    public goalsGUI() {
        initComponents();
        getContentPane().setBackground(new Color(30,30,30));
        goals = new ArrayList<>();
        completedGoals = new ArrayList<>();
        incompleteGoals = new ArrayList<>();
        selectedGoal = new ArrayList<>();
       
      
        
         addAmountTF.setVisible(true);
          addamount.setVisible(true);
          
          deadline.setVisible(true);
          deadlineTF.setVisible(true);
          material.setVisible(true);
          materialTF.setVisible(true);
          targetamount.setVisible(true);
          targetamountTF.setVisible(true);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DailyBG = new javax.swing.ButtonGroup();
        Title = new javax.swing.JLabel();
        deadlineTF = new javax.swing.JTextField();
        deadline = new javax.swing.JLabel();
        targetamount = new javax.swing.JLabel();
        targetamountTF = new javax.swing.JTextField();
        material = new javax.swing.JLabel();
        materialTF = new javax.swing.JTextField();
        CreateRB = new javax.swing.JRadioButton();
        ViewRB = new javax.swing.JRadioButton();
        homeButton = new javax.swing.JButton();
        Motto = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        DisplayBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        LoadBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        goalDisplay = new javax.swing.JPanel();
        addAmountTF = new javax.swing.JTextField();
        addamount = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        StatisticsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setPreferredSize(new java.awt.Dimension(850, 600));
        setResizable(false);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title.setForeground(new Color (111, 162, 202));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("RECYCLING GOALS");

        deadlineTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deadlineTFActionPerformed(evt);
            }
        });

        deadline.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deadline.setForeground(new Color (111, 162, 202));
        deadline.setText("DEADLINE:");

        targetamount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        targetamount.setForeground(new Color (111, 162, 202));
        targetamount.setText("TARGET AMOUNT(KG):");

        targetamountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetamountTFActionPerformed(evt);
            }
        });

        material.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        material.setForeground(new Color (111, 162, 202));
        material.setText("MATERIAL:");

        materialTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialTFActionPerformed(evt);
            }
        });

        DailyBG.add(CreateRB);
        CreateRB.setForeground(new Color (111, 162, 202));
        CreateRB.setText("Create");
        CreateRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateRBActionPerformed(evt);
            }
        });

        DailyBG.add(ViewRB);
        ViewRB.setForeground(new Color (111, 162, 202));
        ViewRB.setText("View");
        ViewRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRBActionPerformed(evt);
            }
        });

        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        Motto.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Motto.setForeground(new Color (111, 162, 202));
        Motto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Motto.setText("upcycle, reduce and recycle");

        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        DisplayBtn.setText("Display");
        DisplayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayBtnActionPerformed(evt);
            }
        });

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        LoadBtn.setText("Load");
        LoadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadBtnActionPerformed(evt);
            }
        });

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        goalDisplay.setBackground(new Color (30,30,30));
        goalDisplay.setForeground(new Color (30,30,30));

        addAmountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAmountTFActionPerformed(evt);
            }
        });

        addamount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addamount.setForeground(new java.awt.Color(102, 153, 255));
        addamount.setText("ADD AMOUNT(KG):");

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        StatisticsBtn.setText("Statistics");
        StatisticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DisplayBtn)
                            .addComponent(SearchBtn))
                        .addGap(33, 33, 33)
                        .addComponent(StatisticsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Motto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(homeButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(AddBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UpdateBtn)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addamount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deadline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deadlineTF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(material)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(materialTF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(targetamount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(targetamountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewRB)
                    .addComponent(CreateRB))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(SaveBtn)
                .addGap(18, 18, 18)
                .addComponent(LoadBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goalDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(homeButton)
                .addGap(41, 41, 41)
                .addComponent(Title)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deadlineTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deadline))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(materialTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(material))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(targetamountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(targetamount))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addamount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(CreateRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewRB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goalDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(UpdateBtn)
                            .addComponent(DeleteBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoadBtn)
                            .addComponent(SaveBtn))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Motto)
                            .addComponent(StatisticsBtn))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SearchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DisplayBtn)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void targetamountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetamountTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetamountTFActionPerformed

    private void materialTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialTFActionPerformed

    private void CreateRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateRBActionPerformed
        // TODO add your handling code here:
          addAmountTF.setVisible(true);
          addamount.setVisible(true);
          deadline.setVisible(true);
          deadlineTF.setVisible(true);
          material.setVisible(true);
          materialTF.setVisible(true);
          targetamount.setVisible(true);
          targetamountTF.setVisible(true);
          goalDisplay.setVisible(false);
          
    }//GEN-LAST:event_CreateRBActionPerformed

    private void ViewRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRBActionPerformed
        // TODO add your handling code here:
          
          deadline.setVisible(false);
          deadlineTF.setVisible(false);
          material.setVisible(false);
          materialTF.setVisible(false);
          targetamount.setVisible(false);
          targetamountTF.setVisible(false);
          addAmountTF.setVisible(false);
          addamount.setVisible(false);
          goalDisplay.setVisible(true);
         
           goalDisplay.removeAll();
         
          int count = 0;
          
           for (Goal g : incompleteGoals) {
                JTextArea goalTextArea = new JTextArea(g.getGoalDetails()/* + "\n\n"*/);
                goalDisplay.add(goalTextArea);
                
                count++;
                
                if(count >= 4){
                    break;
                }
           }
           
           String errorMsg = "Sorry there are no goals to view";
           
           
           if(incompleteGoals.isEmpty()){
                JTextArea goalTextArea = new JTextArea(errorMsg);
                goalDisplay.add(goalTextArea);
           }
           
         
    }//GEN-LAST:event_ViewRBActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
       dispose();
       HomePage HPUI = new HomePage();
       HPUI.setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
         
        Goal g = new Goal();
            g.setDeadline(deadlineTF.getText());
            g.setMaterial(materialTF.getText());
            g.setTargetAmount(Double.parseDouble(targetamountTF.getText()));
            g.setAddAmount(Double.parseDouble(addAmountTF.getText()));
            g.computeCurrentAmount();
            g.computeGoalAchieved();
            goals.add(g);
        
        if(g.goalAchieved==true){
                    JOptionPane.showMessageDialog(null, "Well done this goal is already completed!");
                }
           
        if(g.isGoalAchieved()){
            completedGoals.add(g);
        }
        else{
            incompleteGoals.add(g);
        }
           
    }//GEN-LAST:event_AddBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        File outFile;
            FileOutputStream fStream;
            ObjectOutputStream oStream;

        try{
            outFile = new File("goals.data");
            fStream = new FileOutputStream(outFile, true);
            oStream = new ObjectOutputStream(fStream);
            
            oStream.writeObject(goals);
            JOptionPane.showMessageDialog(null,"goal added succesfully");
            oStream.close();
        }
        catch(IOException e){
            System.out.println("Error "+e);
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void DisplayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayBtnActionPerformed
        // TODO add your handling code here:
         if(goals.isEmpty()){
            JOptionPane.showMessageDialog(null, "there are no goals to display");
        }
         else{
         int ans = (Integer.parseInt(JOptionPane.showInputDialog("Would you like to see completed(type 1) or current goals(type 2)? : ")));
        if(ans == 1){
          for(Goal g: completedGoals){
                JOptionPane.showMessageDialog(null,g.getGoalDetails());
                }
        }
          if(ans == 2){
            for(Goal g: incompleteGoals){
            JOptionPane.showMessageDialog(null,g.getGoalDetails());
             }
        }
    
        }   
    }//GEN-LAST:event_DisplayBtnActionPerformed
    
    private void LoadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadBtnActionPerformed
        // TODO add your handling code here:
        
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            inFile = new File("goals.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);
            
            ArrayList <Goal> gList;
            gList = (ArrayList<Goal>)oStream.readObject();
            for(Goal g:gList){
            JOptionPane.showMessageDialog(null,"Goals loaded successfully!\n Deadline: "+g.getDeadline()+ " Material: "+g.getMaterial()+" ,\n Target Amount: "+g.getTargetAmount() +"\n You added: "+g.getAddAmount()+ " \ncurrently on: "+g.getCurrentAmount());
            }
        
        oStream.close();
    }
        catch(IOException e){
            System.out.println("Error "+e);
        }
        catch(ClassNotFoundException ex){
            System.out.println("Error "+ex);
        }
        
    }//GEN-LAST:event_LoadBtnActionPerformed

    private void deadlineTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deadlineTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deadlineTFActionPerformed

    private void addAmountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAmountTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addAmountTFActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        
        
       
        if(goals.isEmpty()){
            JOptionPane.showMessageDialog(null, "there are no goals to update");
        }
        else{
        while(true){
        String selectedGoal = JOptionPane.showInputDialog(null, "Choose the goal you would like to update by selecting the material");
                
        if(selectedGoal == null ){
        break;
        }
        boolean goalFound = false ;
        
        for(Goal g: goals){
            if(g.getMaterial().equalsIgnoreCase(selectedGoal)){
                double newAddAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Add to current amount: "));
               
                try{
                g.setAddAmount(newAddAmount);
                g.computeCurrentAmount();
                g.computeGoalAchieved();
                
                JOptionPane.showMessageDialog(this, "Goal updated successfully!");
            }
                catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input for addAmount. Please enter a valid number.");
            }
                if(g.isGoalAchieved()){
                         JOptionPane.showMessageDialog(null, "Well done you completed this goal!");
                         completedGoals.add(g);
                         incompleteGoals.remove(g);
                }
                else{
                    incompleteGoals.add(g);
                }
                }
            
            goalFound = true;
            
            }
            break;
            
        
        }
        }
    
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        if(goals.isEmpty()){
            JOptionPane.showMessageDialog(null, "there are no goals to delete");
        }
        
        else{
        String selectedGoal = JOptionPane.showInputDialog(null, "Choose the goal you would like to delete by selecting the material");
        for(Goal g: goals){
            if(g.getMaterial().equalsIgnoreCase(selectedGoal)){
                goals.remove(g);
                JOptionPane.showMessageDialog(null, g.getGoalDetails()+" has been deleted");
            }
        }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void StatisticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsBtnActionPerformed
        // TODO add your handling code here:
         
        Statistics s = new Statistics(completedGoals, goals);
        if(goals.isEmpty()){
            JOptionPane.showMessageDialog(null, "there are no statistics to display");
        }
        else{
            
         double totalRecycledAmount = s.computeTotalRecycledAmount();
        String statisticsMsg = "Statistics: \n" + "Total Recycled Amount: " + totalRecycledAmount + " KG\n" + "Number of completed Goals:" + completedGoals.size() + "";

        JOptionPane.showMessageDialog(null, statisticsMsg);
        }
    }//GEN-LAST:event_StatisticsBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
         if(goals.isEmpty()){
            JOptionPane.showMessageDialog(null, "there are no goals to search");
        }
         else{
         int ans = (Integer.parseInt(JOptionPane.showInputDialog("Would you like to search completed(type 1) or current goals(type 2)? : ")));
        if(ans == 1){
          for(Goal g: completedGoals){
                JOptionPane.showMessageDialog(null,g.getGoalDetails());
                }
        }
      
          if(ans == 2){
            for(Goal g: incompleteGoals){
            JOptionPane.showMessageDialog(null,g.getGoalDetails());
             }
        }
    
        }  
         
    }//GEN-LAST:event_SearchBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(goalsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(goalsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(goalsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(goalsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new goalsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JRadioButton CreateRB;
    private javax.swing.ButtonGroup DailyBG;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DisplayBtn;
    private javax.swing.JButton LoadBtn;
    private javax.swing.JLabel Motto;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton StatisticsBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JRadioButton ViewRB;
    private javax.swing.JTextField addAmountTF;
    private javax.swing.JLabel addamount;
    private javax.swing.JLabel deadline;
    private javax.swing.JTextField deadlineTF;
    private javax.swing.JPanel goalDisplay;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel material;
    private javax.swing.JTextField materialTF;
    private javax.swing.JLabel targetamount;
    private javax.swing.JTextField targetamountTF;
    // End of variables declaration//GEN-END:variables
}

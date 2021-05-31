package canteen;

import static canteen.AllDesk.InputName;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends javax.swing.JFrame {
    
        
    public static int hand,bck ;

    String nam;
    public MainMenu() {
        initComponents();
        setTitle("E-CANTEEN MENU");
        this.setLocationRelativeTo(null);
        setResizable(false);  
        

        setLayout(new BorderLayout());
        URL url = MainMenu.class.getResource(
                "/images/mf.png");
    	JLabel background=new JLabel(new ImageIcon(url));
    	add(background);
    	background.setLayout(new FlowLayout());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Bfast = new javax.swing.JButton();
        Lunch = new javax.swing.JButton();
        Dinner = new javax.swing.JButton();
        Snacks = new javax.swing.JButton();
        drinks = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        cancel.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("   MENU");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Enter Name   :");

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        Bfast.setBackground(new java.awt.Color(0, 102, 204));
        Bfast.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bfast.setText("Breakfast");
        Bfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfastActionPerformed(evt);
            }
        });

        Lunch.setBackground(new java.awt.Color(0, 102, 204));
        Lunch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lunch.setText("Lunch");
        Lunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LunchActionPerformed(evt);
            }
        });

        Dinner.setBackground(new java.awt.Color(0, 102, 204));
        Dinner.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Dinner.setText("Dinner");
        Dinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinnerActionPerformed(evt);
            }
        });

        Snacks.setBackground(new java.awt.Color(0, 102, 204));
        Snacks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Snacks.setText("Snacks");
        Snacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnacksActionPerformed(evt);
            }
        });

        drinks.setBackground(new java.awt.Color(0, 204, 204));
        drinks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        drinks.setText("DRINKS");
        drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(153, 0, 0));
        cancel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cancel.setText("Cancel");

        reset.setBackground(new java.awt.Color(255, 153, 0));
        reset.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bfast, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Lunch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Dinner, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drinks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel)
                    .addComponent(Snacks, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancel)
                        .addComponent(reset))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bfast)
                            .addComponent(Lunch)
                            .addComponent(Dinner)
                            .addComponent(Snacks))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drinks, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        MainMenu reset = new MainMenu();
        
        name.setText("");
        this.dispose();
        reset.setVisible(true);
        
    }//GEN-LAST:event_resetActionPerformed

    private void BfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfastActionPerformed
        
        nam = name.getText();
        hand = 1;
        bck = 1;
        if (nam.equals(null)){
            JOptionPane.showMessageDialog(null,"Please enter a name!","Empty name",JOptionPane.ERROR_MESSAGE);
          }   
        else if (nam.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter a name!","Empty name",JOptionPane.ERROR_MESSAGE);
  
        }   
        else if(!nam.equals(null)){ 
            
            AllDesk all = new AllDesk();
            Bfast b = new Bfast();
            AllDesk.nameMethod(nam);
            InputName.setText(nam);
            AllDesk.desk.add(b);
            b.show();

            this.dispose();
            all.setVisible(true);
           
        }          
    }//GEN-LAST:event_BfastActionPerformed

    private void drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksActionPerformed
        nam = name.getText(); 
        hand = 0;
        bck = 0;
        if (nam.equals(null)){
            JOptionPane.showMessageDialog(null,"Please enter a name!","Empty name",JOptionPane.ERROR_MESSAGE);
          }   
        else if (nam.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter a name!","Empty name",JOptionPane.ERROR_MESSAGE);
  
        }   
        else if(!nam.equals(null)){ 
            
            AllDesk all = new AllDesk();
            Drinks b = new Drinks();
            AllDesk.nameMethod(nam);
            InputName.setText(nam);
            AllDesk.drinks.setText("FOOD");
            b.setLocation(55,0);
            AllDesk.desk.add(b);
            b.show();

            this.dispose();
            all.setVisible(true);
           
        }        
        
    }//GEN-LAST:event_drinksActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
         char c=evt.getKeyChar();
        if (name.getText().length()==40){
            evt.consume();
        }
        if(!(Character.isAlphabetic(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_SPACE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_nameKeyTyped

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void LunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LunchActionPerformed
        
        
        nam = name.getText();
        hand = 2;
        bck = 2;
        if (nam.equals(null)){
            JOptionPane.showMessageDialog(null,"Please enter a name!","Empty name",JOptionPane.ERROR_MESSAGE);
          }   
        else if (nam.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter a name!","Empty name",JOptionPane.ERROR_MESSAGE);
  
        }   
        else if(!nam.equals(null)){ 
            
            AllDesk all = new AllDesk();
            Lunch b = new Lunch();
            AllDesk.nameMethod(nam);
            InputName.setText(nam);
            AllDesk.desk.add(b);
            b.show();

            this.dispose();
            all.setVisible(true);
           
        }          
    }//GEN-LAST:event_LunchActionPerformed

    private void SnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnacksActionPerformed
          
        nam = name.getText();
        hand = 4;
        bck = 4;
        if (nam.equals(null)){
            JOptionPane.showMessageDialog(null,"Please enter a name!","Empty name",JOptionPane.ERROR_MESSAGE);
          }   
        else if (nam.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter a name!","Empty name",JOptionPane.ERROR_MESSAGE);
  
        }   
        else if(!nam.equals(null)){ 
            
            AllDesk all = new AllDesk();
            Snacks b = new Snacks();
            AllDesk.nameMethod(nam);
            InputName.setText(nam);
            AllDesk.desk.add(b);
            b.show();

            this.dispose();
            all.setVisible(true);
           
        }
    }//GEN-LAST:event_SnacksActionPerformed

    private void DinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinnerActionPerformed
        nam = name.getText();
        hand = 3;
        bck = 3;
        if (nam.equals(null)){
            JOptionPane.showMessageDialog(null,"Please enter a name!","Empty name",JOptionPane.ERROR_MESSAGE);
          }   
        else if (nam.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter a name!","Empty name",JOptionPane.ERROR_MESSAGE);
  
        }   
        else if(!nam.equals(null)){ 
            
            AllDesk all = new AllDesk();
            Dinner b = new Dinner();
            AllDesk.nameMethod(nam);
            InputName.setText(nam);
            AllDesk.desk.add(b);
            b.show();

            this.dispose();
            all.setVisible(true);
           
        }
    }//GEN-LAST:event_DinnerActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bfast;
    private javax.swing.JButton Dinner;
    private javax.swing.JButton Lunch;
    private javax.swing.JButton Snacks;
    private javax.swing.JButton cancel;
    private javax.swing.JButton drinks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField name;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}



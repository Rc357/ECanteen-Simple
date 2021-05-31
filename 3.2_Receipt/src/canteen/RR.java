
package canteen;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RR extends javax.swing.JFrame {

 
        
    public RR() {
        initComponents();
        setTitle("Proccessing Order/s");
        setLocationRelativeTo(null);
        setResizable(false);
        
        setLayout(new BorderLayout());
        URL url = RR.class.getResource(
                "/images/BB.jpg");
    	JLabel background=new JLabel(new ImageIcon(url));
    	add(background);
    	background.setLayout(new FlowLayout());
 
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        R_desk = new javax.swing.JDesktopPane();
        msg = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout R_deskLayout = new javax.swing.GroupLayout(R_desk);
        R_desk.setLayout(R_deskLayout);
        R_deskLayout.setHorizontalGroup(
            R_deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        R_deskLayout.setVerticalGroup(
            R_deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        msg.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        msg.setText("Review Your Order/s");

        menu.setBackground(new java.awt.Color(0, 153, 255));
        menu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menu.setText("Main Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 153, 204));
        back.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(R_desk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg)
                    .addComponent(menu)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addComponent(R_desk)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        Receipt.ch = -1;
        MainMenu mm = new MainMenu();
        dispose();
        mm.setVisible(true);
        
    }//GEN-LAST:event_menuActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        AllDesk al = new AllDesk();
        switch(AllDesk.handler){
            case 0:
            
                Drinks dr = new Drinks();
                AllDesk.desk.removeAll();
                AllDesk.desk.repaint();
                AllDesk.desk.add(dr);
                dr.setLocation(55,0);
                dr.show();
                AllDesk.drinks.setText("FOOD");
                this.dispose();
                al.setVisible(true);                
                
                break;
            case 1:
            case 20:
            case 11:
                
                Bfast bf = new Bfast();
                AllDesk.desk.removeAll();
                AllDesk.desk.repaint();
                AllDesk.desk.add(bf);
                bf.show();
                this.dispose();
                al.setVisible(true);
                MainMenu.hand = 1;
                break;
                
            case 2:
            case 30:
                
                Lunch l = new Lunch();
                AllDesk.desk.removeAll();
                AllDesk.desk.repaint();
                AllDesk.desk.add(l);
                l.show();
                this.dispose();
                al.setVisible(true);
                MainMenu.hand = 2;
                break;
                
            case 3:
            case 40:
                Dinner dn = new Dinner();
                AllDesk.desk.removeAll();
                AllDesk.desk.repaint();
                AllDesk.desk.add(dn);
                dn.show();
                this.dispose();
                al.setVisible(true);                
                MainMenu.hand = 3;
                break;
                
            case 4:
            case 50:
            	Snacks snks = new Snacks();
            	AllDesk.desk.removeAll();
            	AllDesk.desk.repaint();
            	AllDesk.desk.add(snks);
            	snks.show();
            	al.setVisible(true);
            	MainMenu.hand = 4;
            	break;
            	
            default:
                break;
        }
                Option.oh = 0;

    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(RR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane R_desk;
    public static javax.swing.JButton back;
    private javax.swing.JButton menu;
    public static javax.swing.JLabel msg;
    // End of variables declaration//GEN-END:variables
}


package canteen;

import static canteen.RR.msg;
import java.awt.Container;
import java.awt.event.MouseListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.Color;

public class Review extends javax.swing.JInternalFrame {
    static String name;
    static int orderdPrice,oTotal;
    public static void totalM(int t,String n){
        orderdPrice = t;
        name = n;
    }
    public static void opTotal(int oT){
        oTotal = oT;
    }
    public Review() {
    	getContentPane().setBackground(new Color(176, 224, 230));
        initComponents();
        setTitle("Reviewing Order/s");
        reviewArea.setEditable(false);
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        Container north  = (Container)ui.getNorthPane();
        north.remove(0);
        north.validate();
        north.repaint();
        
        for (MouseListener listener :((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).getNorthPane().getMouseListeners()){
            ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).getNorthPane().removeMouseListener(listener);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        reviewArea = new javax.swing.JTextArea();
        conti = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        reviewArea.setColumns(20);
        reviewArea.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        reviewArea.setRows(5);
        jScrollPane1.setViewportView(reviewArea);

        conti.setBackground(new java.awt.Color(0, 204, 204));
        conti.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        conti.setText("CONTINUE");
        conti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contiActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(102, 0, 0));
        cancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(conti, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conti)
                    .addComponent(cancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contiActionPerformed
        Receipt rec = new Receipt();
        switch(AllDesk.handler){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 20:
            case 30:
            case 40:
            case 50:
                msg.setText("RECEIPT PROCESS");
                
                Receipt.r_Total.setText(" P "+orderdPrice+".00");
                Receipt.T(orderdPrice,name);
                RR.R_desk.add(rec);
                RR.back.setVisible(false);
                this.dispose();
                rec.show();
            
                break;
           
            case 11:
            case 22:
            case 33:
            case 44:
                msg.setText("RECEIPT PROCESS");
                Receipt.r_Total.setText(" P "+oTotal+".00");
                Receipt.T(oTotal,name);
                RR.R_desk.add(rec);
                RR.back.setVisible(false);
                this.dispose();
                rec.show();
                break;
        }
    }//GEN-LAST:event_contiActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        System.exit(0);       
    }//GEN-LAST:event_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton conti;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea reviewArea;
    // End of variables declaration//GEN-END:variables
}

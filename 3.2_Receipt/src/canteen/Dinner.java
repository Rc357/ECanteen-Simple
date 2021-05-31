
package canteen;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.Color;

public class Dinner extends javax.swing.JInternalFrame {
    

    public Dinner() {
    	getContentPane().setBackground(new Color(135, 206, 250));
        initComponents();
        setTitle("Dinner List");
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

        mecha = new javax.swing.JCheckBox();
        hamo = new javax.swing.JCheckBox();
        kare = new javax.swing.JCheckBox();
        bistek = new javax.swing.JCheckBox();
        embu = new javax.swing.JCheckBox();
        salad = new javax.swing.JCheckBox();
        bbq = new javax.swing.JCheckBox();
        bicol = new javax.swing.JCheckBox();
        tino = new javax.swing.JCheckBox();
        bula = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        sua = new javax.swing.JCheckBox();
        ina = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        tap = new javax.swing.JTextField();
        longSi = new javax.swing.JTextField();
        ham = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(670, 390));

        mecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mecha.setText("Mechado     -     P 40.00");
        mecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapsiActionPerformed(evt);
            }
        });

        hamo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        hamo.setText("Hamonado     -     P 40.00");
        hamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longsiActionPerformed(evt);
            }
        });

        kare.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        kare.setText("Kare-kare   -   P 40.00");
        kare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamsiActionPerformed(evt);
            }
        });

        bistek.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bistek.setText("Bistek     -     P 40.00");
        bistek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porksiActionPerformed(evt);
            }
        });

        embu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        embu.setText("Embutido       -      P 40.00");
        embu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panCantonActionPerformed(evt);
            }
        });

        salad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salad.setText("Salad                -       P 30.00");
        salad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaghettiActionPerformed(evt);
            }
        });

        bbq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bbq.setText("Barbeque Staek     -  P 40.00");
        bbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteSpaActionPerformed(evt);
            }
        });

        bicol.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bicol.setText("Bicol Express   -   P 40.00");
        bicol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotsiActionPerformed(evt);
            }
        });

        tino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tino.setText("Tinola             -          P 40.00");
        tino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteSpa1ActionPerformed(evt);
            }
        });

        bula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bula.setText("Bulalo              -         P 40.00");
        bula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteSpa2ActionPerformed(evt);
            }
        });

        sua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sua.setText("Suasage     -     P 40.00");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapsi1ActionPerformed(evt);
            }
        });

        ina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ina.setText("Inasal             -      P 40.00");
        ina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapsi2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Check Food             PRICE         No. Item");

        tap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tap.setEnabled(false);
        tap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapActionPerformed(evt);
            }
        });
        tap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tapKeyTyped(evt);
            }
        });

        longSi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        longSi.setEnabled(false);
        longSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longSiActionPerformed(evt);
            }
        });
        longSi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                longSiKeyTyped(evt);
            }
        });

        ham.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ham.setEnabled(false);
        ham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hamKeyTyped(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.setEnabled(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setEnabled(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setEnabled(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setEnabled(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jTextField11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField11.setEnabled(false);
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });

        jTextField12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField12.setEnabled(false);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });

        jTextField13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField13.setEnabled(false);
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setEnabled(false);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Check Food            PRICE         No. Item");

        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setEnabled(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hamo)
                            .addComponent(mecha)
                            .addComponent(kare))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(longSi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(tap, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ham))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bicol)
                            .addComponent(bistek)
                            .addComponent(sua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salad)
                                .addGap(24, 24, 24)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bula)
                                    .addComponent(tino)
                                    .addComponent(bbq)
                                    .addComponent(embu)
                                    .addComponent(ina))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField13)))))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(mecha)
                                .addComponent(tap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(embu))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hamo)
                                    .addComponent(longSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ina)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kare)
                                    .addComponent(ham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bistek)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bicol)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sua)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bbq)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tino)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bula)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(salad)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tapsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapsiActionPerformed

        if (mecha.isSelected())
        {
            tap.setText("1");
            tap.setEnabled(true);
        } else {
            tap.setText(null);
            tap.setEnabled(false);
        }        
    }//GEN-LAST:event_tapsiActionPerformed

    private void longsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longsiActionPerformed
         if (hamo.isSelected())
        {
            longSi.setText("1");
            longSi.setEnabled(true);
        } else {
             longSi.setText(null);
            longSi.setEnabled(false);
        }  

    }//GEN-LAST:event_longsiActionPerformed

    private void hamsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamsiActionPerformed
        if (kare.isSelected()){
            ham.setText("1");
            ham.setEnabled(true);
        } else {
            ham.setText(null);
            ham.setEnabled(false);
        }

    }//GEN-LAST:event_hamsiActionPerformed

    private void porksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porksiActionPerformed
        if(bistek.isSelected()){
            jTextField4.setText("1");
            jTextField4.setEnabled(true);
        } else {
            jTextField4.setText(null);
            jTextField4.setEnabled(false);
        }

    }//GEN-LAST:event_porksiActionPerformed

    private void spaghettiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaghettiActionPerformed
        // TODO add your handling code here:
        if (salad.isSelected()){
            jTextField14.setText("1");
            jTextField14.setEnabled(true);
        } else {
            jTextField14.setText(null);
            jTextField14.setEnabled(false);
        }

    }//GEN-LAST:event_spaghettiActionPerformed

    private void whiteSpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteSpaActionPerformed
        // TODO add your handling code here:
        if (bbq.isSelected()){
            jTextField11.setText("1");
            jTextField11.setEnabled(true);
        } else {
            jTextField11.setText(null);
            jTextField11.setEnabled(false);
        }

    }//GEN-LAST:event_whiteSpaActionPerformed

    private void hotsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotsiActionPerformed
        // TODO add your handling code here:
        if(bicol.isSelected()){
            jTextField5.setText("1");
            jTextField5.setEnabled(true);
        } else {
            jTextField5.setText(null);
            jTextField5.setEnabled(false);
        }
    }//GEN-LAST:event_hotsiActionPerformed

    private void whiteSpa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteSpa1ActionPerformed
        // TODO add your handling code here:
        if (tino.isSelected()){
            jTextField12.setText("1");
            jTextField12.setEnabled(true);
        } else {
            jTextField12.setText(null);
            jTextField12.setEnabled(false);
        }
    }//GEN-LAST:event_whiteSpa1ActionPerformed

    private void whiteSpa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteSpa2ActionPerformed
        // TODO add your handling code here:
        if (bula.isSelected()){
            jTextField13.setText("1");
            jTextField13.setEnabled(true);
        } else {
            jTextField13.setText(null);
            jTextField13.setEnabled(false);
        }
    }//GEN-LAST:event_whiteSpa2ActionPerformed

    private void tapsi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapsi1ActionPerformed
        // TODO add your handling code here:
        if (sua.isSelected()){
            jTextField6.setText("1");
            jTextField6.setEnabled(true);
        } else {
            jTextField6.setText(null);
            jTextField6.setEnabled(false);
        }
    }//GEN-LAST:event_tapsi1ActionPerformed

    private void tapsi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapsi2ActionPerformed
        // TODO add your handling code here:
        if (ina.isSelected()){
            jTextField8.setText("1");
            jTextField8.setEnabled(true);
        } else {
            jTextField8.setText(null);
            jTextField8.setEnabled(false);
        }
    }//GEN-LAST:event_tapsi2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void longSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_longSiActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void tapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tapKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (tap.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_tapKeyTyped

    private void longSiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_longSiKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (longSi.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
        
    }//GEN-LAST:event_longSiKeyTyped

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void tapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tapActionPerformed

    private void hamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hamKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (ham.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_hamKeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (jTextField4.getText().length()==2){
            evt.consume();
        }
        
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (jTextField5.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (jTextField6.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (jTextField8.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        // TODO add your handling code here
        char c=evt.getKeyChar();
        if (jTextField11.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (jTextField12.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (jTextField13.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        // TODO add your handling code here
        char c=evt.getKeyChar();
        if (jTextField14.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (jTextField9.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
        evt.consume();
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void panCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panCantonActionPerformed
        if (embu.isSelected()){
            jTextField9.setText("1");
            jTextField9.setEnabled(true);
        } else {
            jTextField9.setText(null);
            jTextField9.setEnabled(false);
        }
    }//GEN-LAST:event_panCantonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ham;
    public static javax.swing.JCheckBox kare;
    public static javax.swing.JCheckBox bicol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField jTextField11;
    public static javax.swing.JTextField jTextField12;
    public static javax.swing.JTextField jTextField13;
    public static javax.swing.JTextField jTextField14;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    public static javax.swing.JTextField longSi;
    public static javax.swing.JCheckBox hamo;
    public static javax.swing.JCheckBox embu;
    public static javax.swing.JCheckBox bistek;
    public static javax.swing.JCheckBox salad;
    public static javax.swing.JTextField tap;
    public static javax.swing.JCheckBox mecha;
    public static javax.swing.JCheckBox sua;
    public static javax.swing.JCheckBox ina;
    public static javax.swing.JCheckBox bbq;
    public static javax.swing.JCheckBox tino;
    public static javax.swing.JCheckBox bula;
    // End of variables declaration//GEN-END:variables
}

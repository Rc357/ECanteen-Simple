
package canteen;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.Color;

/**
 *
 * @author rex
 */
public class Snacks extends javax.swing.JInternalFrame {
    

    public Snacks() {
    	getContentPane().setBackground(new Color(135, 206, 250));
        initComponents();
        setTitle("Snacks List");
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

        siopao = new javax.swing.JCheckBox();
        longsi = new javax.swing.JCheckBox();
        hamsi = new javax.swing.JCheckBox();
        porksi = new javax.swing.JCheckBox();
        panCanton = new javax.swing.JCheckBox();
        panPalabok = new javax.swing.JCheckBox();
        spaghetti = new javax.swing.JCheckBox();
        whiteSpa = new javax.swing.JCheckBox();
        hotsi = new javax.swing.JCheckBox();
        whiteSpa1 = new javax.swing.JCheckBox();
        whiteSpa2 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        tapsi1 = new javax.swing.JCheckBox();
        tapsi2 = new javax.swing.JCheckBox();
        spaghetti1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        sio = new javax.swing.JTextField();
        longSi = new javax.swing.JTextField();
        ham = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(670, 390));

        siopao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        siopao.setText("Siopao     -     P 30.00");
        siopao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siopaoActionPerformed(evt);
            }
        });

        longsi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        longsi.setText("Siomai     -     P 15.00");
        longsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longsiActionPerformed(evt);
            }
        });

        hamsi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        hamsi.setText("Turon     -     P 10.00");
        hamsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamsiActionPerformed(evt);
            }
        });

        porksi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        porksi.setText("Burger     -     P 25.00");
        porksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porksiActionPerformed(evt);
            }
        });

        panCanton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        panCanton.setText("Ginataan     -     P 30.00");
        panCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panCantonActionPerformed(evt);
            }
        });

        panPalabok.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        panPalabok.setText("Champorado     -     P 30.00");
        panPalabok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panPalabokActionPerformed(evt);
            }
        });

        spaghetti.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spaghetti.setText("Ice Cream           -     P 12.00");
        spaghetti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaghettiActionPerformed(evt);
            }
        });

        whiteSpa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        whiteSpa.setText("Lugaw            -        P 30.00");
        whiteSpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteSpaActionPerformed(evt);
            }
        });

        hotsi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        hotsi.setText("Footlong     -     P 30.00");
        hotsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotsiActionPerformed(evt);
            }
        });

        whiteSpa1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        whiteSpa1.setText("Halo-Halo             -     P 20.00");
        whiteSpa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteSpa1ActionPerformed(evt);
            }
        });

        whiteSpa2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        whiteSpa2.setText("Choco shake       -      P 12.00");
        whiteSpa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteSpa2ActionPerformed(evt);
            }
        });

        tapsi1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tapsi1.setText("Pizza     -   P 10.00/1slice");
        tapsi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapsi1ActionPerformed(evt);
            }
        });

        tapsi2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tapsi2.setText("Puto       -      P 10.00");
        tapsi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapsi2ActionPerformed(evt);
            }
        });

        spaghetti1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spaghetti1.setText("Ice Candy         -      P 5.00");
        spaghetti1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaghetti1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Check Food             PRICE         No. Item");

        sio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sio.setEnabled(false);
        sio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sioActionPerformed(evt);
            }
        });
        sio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sioKeyTyped(evt);
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

        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField10.setEnabled(false);
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
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

        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setEnabled(false);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField15KeyTyped(evt);
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(longsi)
                            .addComponent(siopao)
                            .addComponent(hamsi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(longSi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(sio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ham))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hotsi)
                            .addComponent(porksi)
                            .addComponent(tapsi1)
                            .addComponent(tapsi2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField8))
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spaghetti)
                                    .addComponent(spaghetti1))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(whiteSpa2)
                                    .addComponent(whiteSpa1)
                                    .addComponent(whiteSpa)
                                    .addComponent(panPalabok)
                                    .addComponent(panCanton))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField13))))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                                .addComponent(siopao)
                                .addComponent(sio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panCanton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(longsi)
                                    .addComponent(longSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(panPalabok))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hamsi)
                                    .addComponent(ham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(porksi)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hotsi)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tapsi1)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(whiteSpa)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(whiteSpa1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(whiteSpa2)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spaghetti)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tapsi2)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spaghetti1)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void longsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longsiActionPerformed
         if (longsi.isSelected())
        {
            longSi.setText("1");
            longSi.setEnabled(true);
        } else {
             longSi.setText(null);
            longSi.setEnabled(false);
        }  

    }//GEN-LAST:event_longsiActionPerformed

    private void hamsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamsiActionPerformed
        if (hamsi.isSelected()){
            ham.setText("1");
            ham.setEnabled(true);
        } else {
            ham.setText(null);
            ham.setEnabled(false);
        }

    }//GEN-LAST:event_hamsiActionPerformed

    private void porksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porksiActionPerformed
        if(porksi.isSelected()){
            jTextField4.setText("1");
            jTextField4.setEnabled(true);
        } else {
            jTextField4.setText(null);
            jTextField4.setEnabled(false);
        }

    }//GEN-LAST:event_porksiActionPerformed

    private void panCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panCantonActionPerformed
        if (panCanton.isSelected()){
            jTextField9.setText("1");
            jTextField9.setEnabled(true);
        } else {
            jTextField9.setText(null);
            jTextField9.setEnabled(false);
        }

    }//GEN-LAST:event_panCantonActionPerformed

    private void panPalabokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panPalabokActionPerformed
        // TODO add your handling code here:
        if (panPalabok.isSelected()){
            jTextField10.setText("1");
            jTextField10.setEnabled(true);
        } else {
            jTextField10.setText(null);
            jTextField10.setEnabled(false);
        }

    }//GEN-LAST:event_panPalabokActionPerformed

    private void spaghettiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaghettiActionPerformed
        // TODO add your handling code here:
        if (spaghetti.isSelected()){
            jTextField14.setText("1");
            jTextField14.setEnabled(true);
        } else {
            jTextField14.setText(null);
            jTextField14.setEnabled(false);
        }

    }//GEN-LAST:event_spaghettiActionPerformed

    private void whiteSpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteSpaActionPerformed
        // TODO add your handling code here:
        if (whiteSpa.isSelected()){
            jTextField11.setText("1");
            jTextField11.setEnabled(true);
        } else {
            jTextField11.setText(null);
            jTextField11.setEnabled(false);
        }

    }//GEN-LAST:event_whiteSpaActionPerformed

    private void hotsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotsiActionPerformed
        // TODO add your handling code here:
        if(hotsi.isSelected()){
            jTextField5.setText("1");
            jTextField5.setEnabled(true);
        } else {
            jTextField5.setText(null);
            jTextField5.setEnabled(false);
        }
    }//GEN-LAST:event_hotsiActionPerformed

    private void whiteSpa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteSpa1ActionPerformed
        // TODO add your handling code here:
        if (whiteSpa1.isSelected()){
            jTextField12.setText("1");
            jTextField12.setEnabled(true);
        } else {
            jTextField12.setText(null);
            jTextField12.setEnabled(false);
        }
    }//GEN-LAST:event_whiteSpa1ActionPerformed

    private void whiteSpa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteSpa2ActionPerformed
        // TODO add your handling code here:
        if (whiteSpa2.isSelected()){
            jTextField13.setText("1");
            jTextField13.setEnabled(true);
        } else {
            jTextField13.setText(null);
            jTextField13.setEnabled(false);
        }
    }//GEN-LAST:event_whiteSpa2ActionPerformed

    private void tapsi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapsi1ActionPerformed
        // TODO add your handling code here:
        if (tapsi1.isSelected()){
            jTextField6.setText("1");
            jTextField6.setEnabled(true);
        } else {
            jTextField6.setText(null);
            jTextField6.setEnabled(false);
        }
    }//GEN-LAST:event_tapsi1ActionPerformed

    private void tapsi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapsi2ActionPerformed
        // TODO add your handling code here:
        if (tapsi2.isSelected()){
            jTextField8.setText("1");
            jTextField8.setEnabled(true);
        } else {
            jTextField8.setText(null);
            jTextField8.setEnabled(false);
        }
    }//GEN-LAST:event_tapsi2ActionPerformed

    private void spaghetti1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaghetti1ActionPerformed
        // TODO add your handling code here:
        if (spaghetti1.isSelected()){
            jTextField15.setText("1");
            jTextField15.setEnabled(true);
        } else {
            jTextField15.setText(null);
        jTextField15.setEnabled(false);
        }
    }//GEN-LAST:event_spaghetti1ActionPerformed

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

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (jTextField9.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (jTextField10.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextField10KeyTyped

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

    private void jTextField15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyTyped
        // TODO add your handling code here
        char c=evt.getKeyChar();
        if (jTextField15.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextField15KeyTyped

    private void sioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sioKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (sio.getText().length()==2){
            evt.consume();
        }
        if((!Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
        evt.consume();
    }//GEN-LAST:event_sioKeyTyped

    private void sioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_sioActionPerformed

    private void siopaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siopaoActionPerformed

        if (siopao.isSelected())
        {
            sio.setText("1");
            sio.setEnabled(true);
        } else {
            sio.setText(null);
            sio.setEnabled(false);
        }
    }//GEN-LAST:event_siopaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ham;
    public static javax.swing.JCheckBox hamsi;
    public static javax.swing.JCheckBox hotsi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField jTextField10;
    public static javax.swing.JTextField jTextField11;
    public static javax.swing.JTextField jTextField12;
    public static javax.swing.JTextField jTextField13;
    public static javax.swing.JTextField jTextField14;
    public static javax.swing.JTextField jTextField15;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    public static javax.swing.JTextField longSi;
    public static javax.swing.JCheckBox longsi;
    public static javax.swing.JCheckBox panCanton;
    public static javax.swing.JCheckBox panPalabok;
    public static javax.swing.JCheckBox porksi;
    public static javax.swing.JTextField sio;
    public static javax.swing.JCheckBox siopao;
    public static javax.swing.JCheckBox spaghetti;
    public static javax.swing.JCheckBox spaghetti1;
    public static javax.swing.JCheckBox tapsi1;
    public static javax.swing.JCheckBox tapsi2;
    public static javax.swing.JCheckBox whiteSpa;
    public static javax.swing.JCheckBox whiteSpa1;
    public static javax.swing.JCheckBox whiteSpa2;
    // End of variables declaration//GEN-END:variables
}

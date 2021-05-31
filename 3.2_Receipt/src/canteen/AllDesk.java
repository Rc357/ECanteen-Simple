package canteen;

import static canteen.MainMenu.bck;
import static canteen.Review.reviewArea;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AllDesk extends javax.swing.JFrame {
        
    public static int handler,pTotal,foodT;
    int p,total = 0, drTotal = 0;
    String food,Dname;
    static String allfood,alldr,sumAll,name,pName,foodO;
    
    //Food Array Handler
    static String []array = new String[20];
    static int []arrayItem = new int[20];
    static int []price = new int[20];
    
    //Drinks Array Handler
    static String []drName = new String[17];
    static int []drItem = new int[17];
    static int []drPrice = new int[17];
    
    public static void Fd(String fd, int fdT){
        foodO = fd;
        foodT = fdT;
    }
    public static void nameMethod(String n){
        name = n;
    }
    public static void pass(String passName, int passTotal){
        pName = passName;
        pTotal = passTotal;
    }
    public AllDesk() {
        initComponents();
        setTitle("SELECTING ORDER/s");
        setLocationRelativeTo(null);
        setResizable(false);
        InputName.setText(name);
        
        setLayout(new BorderLayout());
        
        URL url = AllDesk.class.getResource(
                "/images/menu.png");
        
    	JLabel background=new JLabel(new ImageIcon(url));
    	add(background);
    	background.setLayout(new FlowLayout());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        InputName = new javax.swing.JLabel();
        desk = new javax.swing.JDesktopPane();
        drinks = new javax.swing.JButton();
        order = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Welcome To E - Canteen!");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Name   :");

        InputName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        InputName.setText("inputName");

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        drinks.setBackground(new java.awt.Color(0, 153, 204));
        drinks.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        drinks.setForeground(new java.awt.Color(0, 0, 0));
        drinks.setText("DRINKS");
        drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksActionPerformed(evt);
            }
        });

        order.setBackground(new java.awt.Color(0, 153, 204));
        order.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        order.setForeground(new java.awt.Color(0, 0, 0));
        order.setText("ORDER");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });

        menu.setBackground(new java.awt.Color(0, 204, 204));
        menu.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        menu.setForeground(new java.awt.Color(0, 0, 0));
        menu.setText("Back to MENU");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(153, 0, 0));
        cancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(0, 0, 0));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 153, 0));
        reset.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 0, 0));
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
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(150, 150, 150)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(cancel))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InputName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drinks)
                .addGap(18, 18, 18)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(desk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cancel)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(InputName)
                    .addComponent(order)
                    .addComponent(drinks)
                    .addComponent(reset))
                .addGap(12, 12, 12)
                .addComponent(desk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksActionPerformed
        /**case 1 - drinks; case 10 - drinks; case 0 - option; case 20 - Bfast **/  
        RR openR = new RR();
        Review rev = new Review();
        
        switch (MainMenu.hand){
        case 0:
            if (Drinks.jCheckBox1.isSelected()){
                    if (Drinks.jTextField1.getText().equals("")){
                        drItem[0] = 0;
                        Dname = "Black Coffee\t\tP 10.00";
                        drPrice[0] = 10;
                        drTotal += drPrice[0]*drItem[0];
                        drName[0] = Dname ;                        
                    } else {
                        drItem[0] = Integer.parseInt(Drinks.jTextField1.getText());
                        Dname = "Black Coffee\t\tP 10.00";
                        drPrice[0] = 10;
                        drTotal += drPrice[0]*drItem[0];
                        drName[0] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[0] = 0;
                    drTotal += drPrice[0];
                    drName[0] = Dname;
                }
                if (Drinks.jCheckBox2.isSelected()){
                    if (Drinks.jTextField2.getText().equals("")){
                        drItem[1] = 0;
                        Dname = "Brown Coffee\t\tP 10.00";
                        drPrice[1] = 10;
                        drTotal += drPrice[0]*drItem[0];
                        drName[1] = Dname ;                        
                    } else {
                        drItem[1] = Integer.parseInt(Drinks.jTextField2.getText());
                        Dname = "Brown Coffee\t\tP 10.00";
                        drPrice[1] = 10;
                        drTotal += drPrice[1]*drItem[1];
                        drName[1] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[1] = 0;
                    drTotal += drPrice[1];
                    drName[1] = Dname;
                }
                if (Drinks.jCheckBox3.isSelected()){
                    if (Drinks.jTextField3.getText().equals("")){
                        drItem[2] = 0;
                        Dname = "Hot Tea\t\tP 10.00";
                        drPrice[2] = 10;
                        drTotal += drPrice[2]*drItem[2];
                        drName[2] = Dname ;                        
                    } else {
                        drItem[2] = Integer.parseInt(Drinks.jTextField3.getText());
                        Dname = "Hot Tea\t\tP 10.00";
                        drPrice[2] = 10;
                        drTotal += drPrice[2]*drItem[2];
                        drName[2] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[2] = 0;
                    drTotal += drPrice[2];
                    drName[2] = Dname;
                }
                if (Drinks.jCheckBox4.isSelected()){
                    if (Drinks.jTextField4.getText().equals("")){
                        drItem[3] = 0;
                        Dname = "Hot Milk\t\tP 15.00";
                        drPrice[3] = 15;
                        drTotal += drPrice[3]*drItem[3];
                        drName[3] = Dname ;                        
                    } else {
                        drItem[3] = Integer.parseInt(Drinks.jTextField4.getText());
                        Dname = "Hot Milk\t\tP 15.00";
                        drPrice[3] = 15;
                        drTotal += drPrice[3]*drItem[3];
                        drName[3] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[3] = 0;
                    drTotal += drPrice[3];
                    drName[3] = Dname;
                }
                if (Drinks.jCheckBox5.isSelected()){
                    if (Drinks.jTextField5.getText().equals("")){
                        drItem[4] = 0;
                        Dname = "Hot Choco\t\tP 15.00";
                        drPrice[4] = 15;
                        drTotal += drPrice[4]*drItem[4];
                        drName[4] = Dname ;                        
                    } else {
                        drItem[4] = Integer.parseInt(Drinks.jTextField5.getText());
                        Dname = "Hot Choco\t\tP 15.00";
                        drPrice[4] = 15;
                        drTotal += drPrice[4]*drItem[4];
                        drName[4] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[4] = 0;
                    drTotal += drPrice[4];
                    drName[4] = Dname;
                }
                if (Drinks.jCheckBox6.isSelected()){
                    if (Drinks.jTextField14.getText().equals("")){
                        drItem[5] = 0;
                        Dname = "Cold Water\t\tP 10.00";
                        drPrice[5] = 10;
                        drTotal += drPrice[5]*drItem[5];
                        drName[5] = Dname ;                        
                    } else {
                        drItem[5] = Integer.parseInt(Drinks.jTextField14.getText());
                        Dname = "Cold Water\t\tP 10.00";
                        drPrice[5] = 10;
                        drTotal += drPrice[5]*drItem[5];
                        drName[5] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[5] = 0;
                    drTotal += drPrice[5];
                    drName[5] = Dname;
                }
                if (Drinks.jCheckBox7.isSelected()){
                    if (Drinks.jTextField15.getText().equals("")){
                        drItem[6] = 0;
                        Dname = "Hot Water\t\tP   5.00";
                        drPrice[6] = 5;
                        drTotal += drPrice[6]*drItem[6];
                        drName[6] = Dname ;                        
                    } else {
                        drItem[6] = Integer.parseInt(Drinks.jTextField15.getText());
                        Dname = "Hot Water\t\tP   5.00";
                        drPrice[6] = 5;
                        drTotal += drPrice[6]*drItem[6];
                        drName[6] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[6] = 0;
                    drTotal += drPrice[6];
                    drName[6] = Dname;
                }
                if (Drinks.buko.isSelected()){
                    if (Drinks.jTextField6.getText().equals("")){
                        drItem[7] = 0;
                        Dname = "Buko juice\t\tP 12.00";
                        drPrice[7] = 12;
                        drTotal += drPrice[7]*drItem[7];
                        drName[7] = Dname ;                        
                    } else {
                        drItem[7] = Integer.parseInt(Drinks.jTextField6.getText());
                        Dname = "Buko juice\t\tP 12.00";
                        drPrice[7] = 12;
                        drTotal += drPrice[7]*drItem[7];
                        drName[7] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[7] = 0;
                    drTotal += drPrice[7];
                    drName[7] = Dname;
                }
                if (Drinks.pineapple.isSelected()){
                    if (Drinks.jTextField7.getText().equals("")){
                        drItem[8] = 0;
                        Dname = "Pineapple juice\t\tP 12.00";
                        drPrice[8] = 12;
                        drTotal += drPrice[8]*drItem[8];
                        drName[8] = Dname ;                        
                    } else {
                        drItem[8] = Integer.parseInt(Drinks.jTextField7.getText());
                        Dname = "Pineapple juice\t\tP 12.00";
                        drPrice[8] = 12;
                        drTotal += drPrice[8]*drItem[8];
                        drName[8] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[8] = 0;
                    drTotal += drPrice[8];
                    drName[8] = Dname;
                }
                if (Drinks.orange.isSelected()){
                    if (Drinks.jTextField8.getText().equals("")){
                        drItem[9] = 0;
                        Dname = "Orange juice\t\tP 12.00";
                        drPrice[9] = 12;
                        drTotal += drPrice[9]*drItem[9];
                        drName[9] = Dname ;                        
                    } else {
                        drItem[9] = Integer.parseInt(Drinks.jTextField8.getText());
                        Dname = "Orange juice\t\tP 12.00";
                        drPrice[9] = 12;
                        drTotal += drPrice[9]*drItem[9];
                        drName[9] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[9] = 0;
                    drTotal += drPrice[9];
                    drName[9] = Dname;
                }
                if (Drinks.melon.isSelected()){
                    if (Drinks.jTextField9.getText().equals("")){
                        drItem[10] = 0;
                        Dname = "Melon juice\t\tP 12.00";
                        drPrice[10] = 12;
                        drTotal += drPrice[10]*drItem[10];
                        drName[10] = Dname ;                        
                    } else {
                        drItem[10] = Integer.parseInt(Drinks.jTextField9.getText());
                        Dname = "Melon juice\t\tP 12.00";
                        drPrice[10] = 12;
                        drTotal += drPrice[10]*drItem[10];
                        drName[10] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[10] = 0;
                    drTotal += drPrice[10];
                    drName[10] = Dname;
                }
                if (Drinks.apple.isSelected()){
                    if (Drinks.jTextField10.getText().equals("")){
                        drItem[11] = 0;
                        Dname = "Apple juice\t\tP 12.00";
                        drPrice[11] = 12;
                        drTotal += drPrice[11]*drItem[11];
                        drName[11] = Dname ;                        
                    } else {
                        drItem[11] = Integer.parseInt(Drinks.jTextField10.getText());
                        Dname = "Apple juice\t\tP 12.00";
                        drPrice[11] = 12;
                        drTotal += drPrice[11]*drItem[11];
                        drName[11] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[11] = 0;
                    drTotal += drPrice[11];
                    drName[11] = Dname;
                }
                if (Drinks.cola.isSelected()){
                    if (Drinks.jTextField11.getText().equals("")){
                        drItem[12] = 0;
                        Dname = "Cola\t\t\tP 15.00";
                        drPrice[12] = 15;
                        drTotal += drPrice[12]*drItem[12];
                        drName[12] = Dname ;                        
                    } else {
                        drItem[12] = Integer.parseInt(Drinks.jTextField11.getText());
                        Dname = "Cola\t\t\tP 15.00";
                        drPrice[12] = 15;
                        drTotal += drPrice[12]*drItem[12];
                        drName[12] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[12] = 0;
                    drTotal += drPrice[12];
                    drName[12] = Dname;
                }
                if (Drinks.c2.isSelected()){
                    if (Drinks.jTextField12.getText().equals("")){
                        drItem[13] = 0;
                        Dname = "C2\t\t\tP 15.00";
                        drPrice[13] = 15;
                        drTotal += drPrice[13]*drItem[13];
                        drName[13] = Dname ;                        
                    } else {
                        drItem[13] = Integer.parseInt(Drinks.jTextField12.getText());
                        Dname = "C2\t\t\tP 15.00";
                        drPrice[13] = 15;
                        drTotal += drPrice[13]*drItem[13];
                        drName[13] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[13] = 0;
                    drTotal += drPrice[13];
                    drName[13] = Dname;
                }
                if (Drinks.minit.isSelected()){
                    if (Drinks.jTextField13.getText().equals("")){
                        drItem[14] = 0;
                        Dname = "Minit\t\t\tP 15.00";
                        drPrice[14] = 15;
                        drTotal += drPrice[14]*drItem[14];
                        drName[14] = Dname ;                        
                    } else {
                        drItem[14] = Integer.parseInt(Drinks.jTextField13.getText());
                        Dname = "Minit\t\t\tP 15.00";
                        drPrice[14] = 15;
                        drTotal += drPrice[14]*drItem[14];
                        drName[14] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[14] = 0;
                    drTotal += drPrice[14];
                    drName[14] = Dname;
                }
                
                
                
                if (drTotal<=0){
                    JOptionPane.showMessageDialog(null,"Please order DRINKS first,\n or back to MENU to order food only.","EMPTY DRINKS!!!",JOptionPane.OK_CANCEL_OPTION);

                } else { 
    
                reviewArea.setText("***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"***                             ********** Continue To Proceed **********                          ***\n");
                reviewArea.setText(reviewArea.getText()+"***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"\t\tD R I N K S & F O O D S\n\n");
                reviewArea.setText(reviewArea.getText()+"Name  :   "+name);
                reviewArea.setText(reviewArea.getText()+"\n\nList of Order/s  :");
                reviewArea.setText(reviewArea.getText()+"\n\n   Drinks Order/s :\t\tNo. of Item/s                  Total Price\n");

                for( int arr = 0, dit = 0, dp = 0; arr<drName.length; arr++, dit++, dp++){
                    if (drName[arr] == null){
                        
                    } else {
                        reviewArea.setText(reviewArea.getText()+"              "+drName[arr]+"   x   "+drItem[dit]+"                   P "+drPrice[dp]*drItem[dit]+".00\n");
                    }
                }
                
                alldr = reviewArea.getText();
              
                
                Option.Dr(alldr, drTotal);
                handler = 11;
                order.setVisible(false);
                Option op = new Option();
                desk.removeAll();
                desk.repaint();
                desk.add(op);
                op.setLocation(190,95);
                op.show();
                MainMenu.hand = 10;
                drinks.setText("DRINKS");
                drTotal = 0;
            }
            break;
               
        case 1:
            if (Bfast.tapsi.isSelected()){
                if (Bfast.tap.getText().equals("")){          
                    arrayItem[0] = 0;
                    food = "Tapsilog\t\tP 40.00";       
                    price[0] = 40;
                    total += price[0]*arrayItem[0];
                    array[0] = food;
                } else {
                    arrayItem[0] = Integer.parseInt(Bfast.tap.getText());
                    food = "Tapsilog\t\tP 40.00";       
                    price[0] = 40;
                    total += price[0]*arrayItem[0];
                    array[0] = food;    
                }
            } else {
                food = null;
                price[0] = 0;
                total += price[0];
                array[0] = food;
            }

            if (Bfast.longsi.isSelected()){
                if (Bfast.longSi.getText().equals("")){
                    arrayItem[1] = 0;
                    food = "Longsilog\t\tP 40.00";       
                    price[1] = 40;
                    total += price[1]*arrayItem[1];
                    array[1] = food;
                } else {
                    arrayItem[1] = Integer.parseInt(Bfast.longSi.getText());
                    food = "Longsilog\t\tP 40.00";       
                    price[1] = 40;
                    total += price[1]*arrayItem[1];
                    array[1] = food;
                }
            } else {
                food = null;
                price[1] = 0;
                total += price[1];
                array[1] = food;
            }
            if (Bfast.hamsi.isSelected()){
                if(Bfast.ham.getText().equals("")){
                    arrayItem[2] = 0;
                    food = "Hamsilog\t\tP 40.00";       
                    price[2] = 40;
                    total += price[2]*arrayItem[2];
                    array[2] = food;
                } else {
                    arrayItem[2] = Integer.parseInt(Bfast.ham.getText());
                    food = "Hamsilog\t\tP 40.00";       
                    price[2] = 40;
                    total += price[2]*arrayItem[2];
                    array[2] = food;
                }

            } else {
                food = null;
                price[2] = 0;
                total += price[2];
                array[2] = food;
            }
            if (Bfast.porksi.isSelected()){
                if (Bfast.jTextField4.getText().equals("")){
                    arrayItem[3] = 0;
                    food = "Porksilog\t\tP 40.00";       
                    price[3] = 40;
                    total += price[3];
                    array[3] = food;
                } else {
                    arrayItem[3] = Integer.parseInt(Bfast.jTextField4.getText());
                    food = "Porksilog\t\tP 40.00";       
                    price[3] = 40;
                    total += price[3];
                    array[3] = food;
                }
            } else {
                food = null;
                price[3] = 0;
                total += price[3];
                array[3] = food;
            }
            if (Bfast.hotsi.isSelected()){
                if (Bfast.jTextField5.getText().equals("")){
                    arrayItem[4] = 0;
                    food = "Hotsilog\t\tP 40.00";       
                    price[4] = 40;
                    total += price[4]*arrayItem[4];
                    array[4] = food;
                } else {
                    arrayItem[4] = Integer.parseInt(Bfast.jTextField5.getText());
                    food = "Hotsilog\t\tP 40.00";       
                    price[4] = 40;
                    total += price[4]*arrayItem[4];
                    array[4] = food;
                }
            } else {
                food = null;
                price[4] = 0;
                total += price[4];
                array[4] = food;
            }
            if (Bfast.tapsi1.isSelected()){
                if (Bfast.jTextField6.getText().equals("")){
                    arrayItem[5] = 0;
                    food = "Tosilog\t\tP 40.00";       
                    price[5] = 40;
                    total += price[5]*arrayItem[5];
                    array[5] = food;
                } else {
                    arrayItem[5] = Integer.parseInt(Bfast.jTextField6.getText());
                    food = "Tosilog\t\tP 40.00";       
                    price[5] = 40;
                    total += price[5]*arrayItem[5];
                    array[5] = food;
                }

            } else {
                food = null;
                price[5] = 0;
                total += price[5];
                array[5] = food;
            }
            if (Bfast.tapsi2.isSelected()){
                if (Bfast.jTextField8.getText().equals("")){
                    arrayItem[6] = 0;
                    food = "Sopas\t\tP 30.00";       
                    price[6] = 30;
                    total += price[6]*arrayItem[6];
                    array[6] = food;   
                } else {
                    arrayItem[6] = Integer.parseInt(Bfast.jTextField8.getText());
                    food = "Sopas\t\tP 30.00";       
                    price[6] = 30;
                    total += price[6]*arrayItem[6];
                    array[6] = food;
                }            
            } else {
                food = null;
                price[6] = 0;
                total += price[6];
                array[6] = food;
            }
            if (Bfast.panCanton.isSelected()){
                if (Bfast.jTextField9.getText().equals("")){
                    arrayItem[7] = 0;
                    food = "Pansit Canton\t\tP 30.00";       
                    price[7] = 30;
                    total += price[7]*arrayItem[7];
                    array[7] = food;
                } else {
                    arrayItem[7] = Integer.parseInt(Bfast.jTextField9.getText());
                    food = "Pansit Canton\t\tP 30.00";       
                    price[7] = 30;
                    total += price[7]*arrayItem[7];
                    array[7] = food;
                }
            } else {
                food = null;
                price[7] = 0;
                total += price[7];
                array[7] = food;
            }
            if (Bfast.panPalabok.isSelected()){
                if (Bfast.jTextField10.getText().equals("")){
                    arrayItem[8] = 0;
                    food = "Pansit Palabok\t\tP 30.00";       
                    price[8] = 30;
                    total += price[8]*arrayItem[8];
                    array[8] = food;
                } else {
                    arrayItem[8] = Integer.parseInt(Bfast.jTextField10.getText());
                    food = "Pansit Palabok\t\tP 30.00";       
                    price[8] = 30;
                    total += price[8]*arrayItem[8];
                    array[8] = food;
                }
            } else {
                food = null;
                price[8] = 0;
                total += price[8];
                array[8] = food;
            }
            if (Bfast.whiteSpa.isSelected()){
                if (Bfast.jTextField11.getText().equals("")){
                    arrayItem[9] = 0;
                    food = "White Spaghetti\t\tP 30.00";       
                    price[9] = 30;
                    total += price[9]*arrayItem[9];
                    array[9] = food;
                } else {
                    arrayItem[9] = Integer.parseInt(Bfast.jTextField11.getText());
                    food = "White Spaghetti\t\tP 30.00";       
                    price[9] = 30;
                    total += price[9]*arrayItem[9];
                    array[9] = food;
                }
            } else {
                food = null;
                price[9] = 0;
                total += price[9];
                array[9] = food;
            }
            if (Bfast.whiteSpa1.isSelected()){
                if (Bfast.jTextField12.getText().equals("")){
                    arrayItem[10] = 0;
                    food = "Spaghetti\t\tP 30.00";       
                    price[10] = 30;
                    total += price[10]*arrayItem[10];
                    array[10] = food;
                } else {
                    arrayItem[10] = Integer.parseInt(Bfast.jTextField12.getText());
                    food = "Spaghetti\t\tP 30.00";       
                    price[10] = 30;
                    total += price[10]*arrayItem[10];
                    array[10] = food;
                }

            } else {
                food = null;
                price[10] = 0;
                total += price[10];
                array[10] = food;
            }
            if (Bfast.whiteSpa2.isSelected()){
                if(Bfast.jTextField13.getText().equals("")){
                    arrayItem[11] = 0;
                    food = "Homi\t\t\tP 30.00";       
                    price[11] = 30;
                    total += price[11]*arrayItem[11];
                    array[11] = food;
                } else {
                    arrayItem[11] = Integer.parseInt(Bfast.jTextField13.getText());
                    food = "Homi\t\t\tP 30.00";       
                    price[11] = 30;
                    total += price[11]*arrayItem[11];
                    array[11] = food;
                }            
            } else {
                food = null;
                price[11] = 0;
                total += price[11];
                array[11] = food;
            }
            if (Bfast.spaghetti.isSelected()){
                if(Bfast.jTextField14.getText().equals("")){
                    arrayItem[12] = 0;
                    food = "Macaroni\t\tP 30.00";       
                    price[12] = 30;
                    total += price[12]*arrayItem[12];
                    array[12] = food;
                } else {
                    arrayItem[12] = Integer.parseInt(Bfast.jTextField14.getText());
                    food = "Macaroni\t\tP 30.00";       
                    price[12] = 30;
                    total += price[12]*arrayItem[12];
                    array[12] = food;
                }            
            } else {
                food = null;
                price[12] = 0;
                total += price[12];
                array[12] = food;
            }
            if (Bfast.spaghetti1.isSelected()){
                if(Bfast.jTextField15.getText().equals("")){
                    arrayItem[13] = 0;
                    food = "Pasta\t\tP 30.00";       
                    price[13] = 30;
                    total += price[13]*arrayItem[13];
                    array[13] = food;
                } else {
                    arrayItem[13] = Integer.parseInt(Bfast.jTextField15.getText());
                    food = "Pasta\t\tP 30.00";       
                    price[13] = 30;
                    total += price[13]*arrayItem[13];
                    array[13] = food;
                }

            } else {
                food = null;
                price[13] = 0;
                total += price[13];
                array[13] = food;
            }
            
             if (total<=0){
                JOptionPane.showMessageDialog(null,"Please order food first,\n or back to menu to order drinks only.","EMPTY FOOD!!!",JOptionPane.OK_CANCEL_OPTION);

            } else { 
                reviewArea.setText("***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"***                             ********** Continue To Proceed **********                          ***\n");
                reviewArea.setText(reviewArea.getText()+"***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"\t\tBREAKFAST & DRINKS\n\n");
                reviewArea.setText(reviewArea.getText()+"Name  :   "+name);
                reviewArea.setText(reviewArea.getText()+"\n\nList of Order/s  :");
                reviewArea.setText(reviewArea.getText()+"\n\n   Food Order/s :\t\tNo. of Item/s                  Total Price\n");
            
            for (int i = 0, it = 0,pr = 0; i<array.length; i++,it++,pr++){
                if (array[i]==null){

                } else {
                    reviewArea.setText(reviewArea.getText()+"              "+array[i]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
                }
            }
            
            allfood = reviewArea.getText();
            Fd(allfood,total);
            Drinks dr = new Drinks();
            desk.removeAll();
            desk.repaint();
            desk.add(dr);
            dr.setLocation(55,0);
            dr.show();
            drinks.setText("BACK");
            MainMenu.hand = 20;
            total=0;
             }
           break;
           
        case 2:
        if (Lunch.adobo.isSelected()){
            if (Lunch.tap.getText().equals("")){          
                arrayItem[0] = 0;
                food = "Adobo\t\tP 40.00";       
                price[0] = 40;
                total += price[0]*arrayItem[0];
                array[0] = food;
            } else {
                arrayItem[0] = Integer.parseInt(Lunch.tap.getText());
                food = "Adobo\t\tP 40.00";       
                price[0] = 40;
                total += price[0]*arrayItem[0];
                array[0] = food;    
            }
        } else {
            food = null;
            price[0] = 0;
            total += price[0];
            array[0] = food;
        }
        
        if (Lunch.longsi.isSelected()){
            if (Lunch.longSi.getText().equals("")){
                arrayItem[1] = 0;
                food = "Menudo\t\tP 40.00";       
                price[1] = 40;
                total += price[1]*arrayItem[1];
                array[1] = food;
            } else {
                arrayItem[1] = Integer.parseInt(Lunch.longSi.getText());
                food = "Menudo\t\tP 40.00";       
                price[1] = 40;
                total += price[1]*arrayItem[1];
                array[1] = food;
            }
        } else {
            food = null;
            price[1] = 0;
            total += price[1];
            array[1] = food;
        }
        if (Lunch.hamsi.isSelected()){
            if(Lunch.ham.getText().equals("")){
                arrayItem[2] = 0;
                food = "Kaldereta\t\tP 40.00";       
                price[2] = 40;
                total += price[2]*arrayItem[2];
                array[2] = food;
            } else {
                arrayItem[2] = Integer.parseInt(Lunch.ham.getText());
                food = "Kaldereta\t\tP 40.00";       
                price[2] = 40;
                total += price[2]*arrayItem[2];
                array[2] = food;
            }
            
        } else {
            food = null;
            price[2] = 0;
            total += price[2];
            array[2] = food;
        }
        if (Lunch.porksi.isSelected()){
            if (Lunch.jTextField4.getText().equals("")){
                arrayItem[3] = 0;
                food = "Sisig\t\t\tP 40.00";       
                price[3] = 40;
                total += price[3];
                array[3] = food;
            } else {
                arrayItem[3] = Integer.parseInt(Lunch.jTextField4.getText());
                food = "Sisig\t\t\tP 40.00";       
                price[3] = 40;
                total += price[3];
                array[3] = food;
            }
        } else {
            food = null;
            price[3] = 0;
            total += price[3];
            array[3] = food;
        }
        if (Lunch.hotsi.isSelected()){
            if (Lunch.jTextField5.getText().equals("")){
                arrayItem[4] = 0;
                food = "Pinakbet\t\tP 40.00";       
                price[4] = 40;
                total += price[4]*arrayItem[4];
                array[4] = food;
            } else {
                arrayItem[4] = Integer.parseInt(Lunch.jTextField5.getText());
                food = "Pinakbet\t\tP 40.00";       
                price[4] = 40;
                total += price[4]*arrayItem[4];
                array[4] = food;
            }
        } else {
            food = null;
            price[4] = 0;
            total += price[4];
            array[4] = food;
        }
        if (Lunch.tapsi1.isSelected()){
            if (Lunch.jTextField6.getText().equals("")){
                arrayItem[5] = 0;
                food = "Sinigang na Baboy\t\tP 40.00";       
                price[5] = 40;
                total += price[5]*arrayItem[5];
                array[5] = food;
            } else {
                arrayItem[5] = Integer.parseInt(Lunch.jTextField6.getText());
                food = "Sinigang na Baboy\t\tP 40.00";       
                price[5] = 40;
                total += price[5]*arrayItem[5];
                array[5] = food;
            }
            
        } else {
            food = null;
            price[5] = 0;
            total += price[5];
            array[5] = food;
        }
        if (Lunch.tapsi2.isSelected()){
            if (Lunch.jTextField8.getText().equals("")){
                arrayItem[6] = 0;
                food = "Ginatang Manok\t\tP 40.00";       
                price[6] = 40;
                total += price[6]*arrayItem[6];
                array[6] = food;   
            } else {
                arrayItem[6] = Integer.parseInt(Lunch.jTextField8.getText());
                food = "Ginatang Manok\t\tP 40.00";       
                price[6] = 40;
                total += price[6]*arrayItem[6];
                array[6] = food;
            }            
        } else {
            food = null;
            price[6] = 0;
            total += price[6];
            array[6] = food;
        }
        if (Lunch.panCanton.isSelected()){
            if (Lunch.jTextField9.getText().equals("")){
                arrayItem[7] = 0;
                food = "Giniling na Baboy\t\tP 40.00";       
                price[7] = 40;
                total += price[7]*arrayItem[7];
                array[7] = food;
            } else {
                arrayItem[7] = Integer.parseInt(Lunch.jTextField9.getText());
                food = "Giniling na Baboy\t\tP 40.00";       
                price[7] = 40;
                total += price[7]*arrayItem[7];
                array[7] = food;
            }
        } else {
            food = null;
            price[7] = 0;
            total += price[7];
            array[7] = food;
        }
        if (Lunch.panPalabok.isSelected()){
            if (Lunch.jTextField10.getText().equals("")){
                arrayItem[8] = 0;
                food = "Paksiw\t\tP 40.00";       
                price[8] = 40;
                total += price[8]*arrayItem[8];
                array[8] = food;
            } else {
                arrayItem[8] = Integer.parseInt(Lunch.jTextField10.getText());
                food = "Paksiw\t\tP 40.00";       
                price[8] = 40;
                total += price[8]*arrayItem[8];
                array[8] = food;
            }
        } else {
            food = null;
            price[8] = 0;
            total += price[8];
            array[8] = food;
        }
        if (Lunch.whiteSpa.isSelected()){
            if (Lunch.jTextField11.getText().equals("")){
                arrayItem[9] = 0;
                food = "Tortang Talong\t\tP 30.00";       
                price[9] = 30;
                total += price[9]*arrayItem[9];
                array[9] = food;
            } else {
                arrayItem[9] = Integer.parseInt(Lunch.jTextField11.getText());
                food = "Tortang Talong\t\tP 30.00";       
                price[9] = 30;
                total += price[9]*arrayItem[9];
                array[9] = food;
            }
        } else {
            food = null;
            price[9] = 0;
            total += price[9];
            array[9] = food;
        }
        if (Lunch.whiteSpa1.isSelected()){
            if (Lunch.jTextField12.getText().equals("")){
                arrayItem[10] = 0;
                food = "Pritong Isda\t\tP 30.00";       
                price[10] = 30;
                total += price[10]*arrayItem[10];
                array[10] = food;
            } else {
                arrayItem[10] = Integer.parseInt(Lunch.jTextField12.getText());
                food = "Pritong Isda\t\tP 30.00";       
                price[10] = 30;
                total += price[10]*arrayItem[10];
                array[10] = food;
            }
            
        } else {
            food = null;
            price[10] = 0;
            total += price[10];
            array[10] = food;
        }
        if (Lunch.whiteSpa2.isSelected()){
            if(Lunch.jTextField13.getText().equals("")){
                arrayItem[11] = 0;
                food = "Fried Chicken\t\tP 30.00";       
                price[11] = 30;
                total += price[11]*arrayItem[11];
                array[11] = food;
            } else {
                arrayItem[11] = Integer.parseInt(Lunch.jTextField13.getText());
                food = "Fried Chicken\t\tP 30.00";       
                price[11] = 30;
                total += price[11]*arrayItem[11];
                array[11] = food;
            }            
        } else {
            food = null;
            price[11] = 0;
            total += price[11];
            array[11] = food;
        }
        if (Lunch.spaghetti.isSelected()){
            if(Lunch.jTextField14.getText().equals("")){
                arrayItem[12] = 0;
                food = "Ham & Egg\t\tP 30.00";       
                price[12] = 30;
                total += price[12]*arrayItem[12];
                array[12] = food;
            } else {
                arrayItem[12] = Integer.parseInt(Lunch.jTextField14.getText());
                food = "Ham & Egg\t\tP 30.00";       
                price[12] = 30;
                total += price[12]*arrayItem[12];
                array[12] = food;
            }            
        } else {
            food = null;
            price[12] = 0;
            total += price[12];
            array[12] = food;
        }
        if (Lunch.spaghetti1.isSelected()){
            if(Lunch.jTextField15.getText().equals("")){
                arrayItem[13] = 0;
                food = "Hotdog\t\tP 20.00";       
                price[13] = 20;
                total += price[13]*arrayItem[13];
                array[13] = food;
            } else {
                arrayItem[13] = Integer.parseInt(Lunch.jTextField15.getText());
                food = "Hotdog\t\tP 20.00";       
                price[13] = 20;
                total += price[13]*arrayItem[13];
                array[13] = food;
            }
            
        } else {
            food = null;
            price[13] = 0;
            total += price[13];
            array[13] = food;
        }
            
             if (total<=0){
                JOptionPane.showMessageDialog(null,"Please order food first,\n or back to menu to order drinks only.","EMPTY FOOD!!!",JOptionPane.OK_CANCEL_OPTION);

            } else { 
                reviewArea.setText("***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"***                             ********** Continue To Proceed **********                          ***\n");
                reviewArea.setText(reviewArea.getText()+"***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"\t\tLUNCH & DRINKS\n\n");
                reviewArea.setText(reviewArea.getText()+"Name  :   "+name);
                reviewArea.setText(reviewArea.getText()+"\n\nList of Order/s  :");
                reviewArea.setText(reviewArea.getText()+"\n\n   Food Order/s :\t\tNo. of Item/s                  Total Price\n");
            
            for (int i = 0, it = 0,pr = 0; i<array.length; i++,it++,pr++){
                if (array[i]==null){

                } else {
                    reviewArea.setText(reviewArea.getText()+"              "+array[i]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
                }
            }
            
            allfood = reviewArea.getText();
            Fd(allfood,total);
            Drinks dr = new Drinks();
            desk.removeAll();
            desk.repaint();
            desk.add(dr);
            dr.setLocation(55,0);
            dr.show();
            drinks.setText("BACK");
            MainMenu.hand = 30;
            total=0;
             }
             
            break;
            
        case 3:
            
        if (Dinner.mecha.isSelected()){
            if (Dinner.tap.getText().equals("")){          
                arrayItem[0] = 0;
                food = "Mechado\t\tP 40.00";       
                price[0] = 40;
                total += price[0]*arrayItem[0];
                array[0] = food;
            } else {
                arrayItem[0] = Integer.parseInt(Dinner.tap.getText());
                food = "Mechado\t\tP 40.00";       
                price[0] = 40;
                total += price[0]*arrayItem[0];
                array[0] = food;    
            }
        } else {
            food = null;
            price[0] = 0;
            total += price[0];
            array[0] = food;
        }
        
        if (Dinner.hamo.isSelected()){
            if (Dinner.longSi.getText().equals("")){
                arrayItem[1] = 0;
                food = "Hamonado\t\tP 40.00";       
                price[1] = 40;
                total += price[1]*arrayItem[1];
                array[1] = food;
            } else {
                arrayItem[1] = Integer.parseInt(Dinner.longSi.getText());
                food = "Hamonado\t\tP 40.00";       
                price[1] = 40;
                total += price[1]*arrayItem[1];
                array[1] = food;
            }
        } else {
            food = null;
            price[1] = 0;
            total += price[1];
            array[1] = food;
        }
        if (Dinner.kare.isSelected()){
            if(Dinner.ham.getText().equals("")){
                arrayItem[2] = 0;
                food = "Kare-kare\t\tP 40.00";       
                price[2] = 40;
                total += price[2]*arrayItem[2];
                array[2] = food;
            } else {
                arrayItem[2] = Integer.parseInt(Dinner.ham.getText());
                food = "Kare-kare\t\tP 40.00";       
                price[2] = 40;
                total += price[2]*arrayItem[2];
                array[2] = food;
            }
            
        } else {
            food = null;
            price[2] = 0;
            total += price[2];
            array[2] = food;
        }
        if (Dinner.bistek.isSelected()){
            if (Dinner.jTextField4.getText().equals("")){
                arrayItem[3] = 0;
                food = "Bistek\t\tP 40.00";       
                price[3] = 40;
                total += price[3];
                array[3] = food;
            } else {
                arrayItem[3] = Integer.parseInt(Dinner.jTextField4.getText());
                food = "Bistek\t\tP 40.00";       
                price[3] = 40;
                total += price[3];
                array[3] = food;
            }
        } else {
            food = null;
            price[3] = 0;
            total += price[3];
            array[3] = food;
        }
        if (Dinner.bicol.isSelected()){
            if (Dinner.jTextField5.getText().equals("")){
                arrayItem[4] = 0;
                food = "Bicol Express\t\tP 40.00";       
                price[4] = 40;
                total += price[4]*arrayItem[4];
                array[4] = food;
            } else {
                arrayItem[4] = Integer.parseInt(Dinner.jTextField5.getText());
                food = "Bicol Express\t\tP 40.00";       
                price[4] = 40;
                total += price[4]*arrayItem[4];
                array[4] = food;
            }
        } else {
            food = null;
            price[4] = 0;
            total += price[4];
            array[4] = food;
        }
        if (Dinner.sua.isSelected()){
            if (Dinner.jTextField6.getText().equals("")){
                arrayItem[5] = 0;
                food = "Suasage\t\tP 40.00";       
                price[5] = 40;
                total += price[5]*arrayItem[5];
                array[5] = food;
            } else {
                arrayItem[5] = Integer.parseInt(Dinner.jTextField6.getText());
                food = "Suasage\t\tP 40.00";       
                price[5] = 40;
                total += price[5]*arrayItem[5];
                array[5] = food;
            }
            
        } else {
            food = null;
            price[5] = 0;
            total += price[5];
            array[5] = food;
        }
        if (Dinner.ina.isSelected()){
            if (Dinner.jTextField8.getText().equals("")){
                arrayItem[6] = 0;
                food = "Inasal\t\tP 40.00";       
                price[6] = 40;
                total += price[6]*arrayItem[6];
                array[6] = food;   
            } else {
                arrayItem[6] = Integer.parseInt(Dinner.jTextField8.getText());
                food = "Inasal\t\tP 40.00";       
                price[6] = 40;
                total += price[6]*arrayItem[6];
                array[6] = food;
            }            
        } else {
            food = null;
            price[6] = 0;
            total += price[6];
            array[6] = food;
        }

        food = null;
        price[7] = 0;
        total += price[7];
        array[7] = food;
        
        food = null;
        price[8] = 0;
        total += price[8];
        array[8] = food;
        
        if (Dinner.bbq.isSelected()){
            if (Dinner.jTextField11.getText().equals("")){
                arrayItem[9] = 0;
                food = "Barbeque Staek\t\tP 40.00";       
                price[9] = 40;
                total += price[9]*arrayItem[9];
                array[9] = food;
            } else {
                arrayItem[9] = Integer.parseInt(Dinner.jTextField11.getText());
                food = "Barbeque Staek\t\tP 40.00";       
                price[9] = 40;
                total += price[9]*arrayItem[9];
                array[9] = food;
            }
        } else {
            food = null;
            price[9] = 0;
            total += price[9];
            array[9] = food;
        }
        if (Dinner.tino.isSelected()){
            if (Dinner.jTextField12.getText().equals("")){
                arrayItem[10] = 0;
                food = "Tinola\t\tP 40.00";       
                price[10] = 40;
                total += price[10]*arrayItem[10];
                array[10] = food;
            } else {
                arrayItem[10] = Integer.parseInt(Dinner.jTextField12.getText());
                food = "Tinola\t\tP 40.00";       
                price[10] = 40;
                total += price[10]*arrayItem[10];
                array[10] = food;
            }
            
        } else {
            food = null;
            price[10] = 0;
            total += price[10];
            array[10] = food;
        }
        if (Dinner.bula.isSelected()){
            if(Dinner.jTextField13.getText().equals("")){
                arrayItem[11] = 0;
                food = "Bulalo\t\tP 40.00";       
                price[11] = 40;
                total += price[11]*arrayItem[11];
                array[11] = food;
            } else {
                arrayItem[11] = Integer.parseInt(Dinner.jTextField13.getText());
                food = "Bulalo\t\tP 40.00";       
                price[11] = 40;
                total += price[11]*arrayItem[11];
                array[11] = food;
            }            
        } else {
            food = null;
            price[11] = 0;
            total += price[11];
            array[11] = food;
        }
        if (Dinner.salad.isSelected()){
            if(Dinner.jTextField14.getText().equals("")){
                arrayItem[12] = 0;
                food = "Salad\t\tP 30.00";       
                price[12] = 30;
                total += price[12]*arrayItem[12];
                array[12] = food;
            } else {
                arrayItem[12] = Integer.parseInt(Dinner.jTextField14.getText());
                food = "Salad\t\tP 30.00";       
                price[12] = 30;
                total += price[12]*arrayItem[12];
                array[12] = food;
            }            
        } else {
            food = null;
            price[12] = 0;
            total += price[12];
            array[12] = food;
        }
        if (Dinner.embu.isSelected()){
            if(Dinner.jTextField9.getText().equals("")){
                arrayItem[13] = 0;
                food = "Embutido\t\tP 40.00";       
                price[13] = 40;
                total += price[13]*arrayItem[13];
                array[13] = food;
            } else {
                arrayItem[13] = Integer.parseInt(Dinner.jTextField9.getText());
                food = "Embutido\t\tP 40.00";       
                price[13] = 40;
                total += price[13]*arrayItem[13];
                array[13] = food;
            }
            
        } else {
            food = null;
            price[13] = 0;
            total += price[13];
            array[13] = food;
        }
        
             if (total<=0){
                JOptionPane.showMessageDialog(null,"Please order food first,\n or back to menu to order drinks only.","EMPTY FOOD!!!",JOptionPane.OK_CANCEL_OPTION);

            } else { 
                reviewArea.setText("***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"***                             ********** Continue To Proceed **********                          ***\n");
                reviewArea.setText(reviewArea.getText()+"***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"\t\tDINNER & DRINKS\n\n");
                reviewArea.setText(reviewArea.getText()+"Name  :   "+name);
                reviewArea.setText(reviewArea.getText()+"\n\nList of Order/s  :");
                reviewArea.setText(reviewArea.getText()+"\n\n   Food Order/s :\t\tNo. of Item/s                  Total Price\n");
            
            for (int i = 0, it = 0,pr = 0; i<array.length; i++,it++,pr++){
                if (array[i]==null){

                } else {
                    reviewArea.setText(reviewArea.getText()+"              "+array[i]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
                }
            }
            
            allfood = reviewArea.getText();
            Fd(allfood,total);
            Drinks dr = new Drinks();
            desk.removeAll();
            desk.repaint();
            desk.add(dr);
            dr.setLocation(55,0);
            dr.show();
            drinks.setText("BACK");
            MainMenu.hand = 40;
            total=0;
             }
            
            break;
        case 4:
        	
        	if (Snacks.siopao.isSelected()){
                if (Snacks.sio.getText().equals("")){          
                    arrayItem[0] = 0;
                    food = "Siopao\t\tP 30.00";       
                    price[0] = 30;
                    total += price[0]*arrayItem[0];
                    array[0] = food;
                } else {
                    arrayItem[0] = Integer.parseInt(Snacks.sio.getText());
                    food = "Siopao\t\tP 30.00";       
                    price[0] = 30;
                    total += price[0]*arrayItem[0];
                    array[0] = food;    
                }
            } else {
                food = null;
                price[0] = 0;
                total += price[0];
                array[0] = food;
            }
            
            if (Snacks.longsi.isSelected()){
                if (Snacks.longSi.getText().equals("")){
                    arrayItem[1] = 0;
                    food = "Siomai\t\tP 15.00";       
                    price[1] = 15;
                    total += price[1]*arrayItem[1];
                    array[1] = food;
                } else {
                    arrayItem[1] = Integer.parseInt(Snacks.longSi.getText());
                    food = "Siomai\t\tP 15.00";       
                    price[1] = 15;
                    total += price[1]*arrayItem[1];
                    array[1] = food;
                }
            } else {
                food = null;
                price[1] = 0;
                total += price[1];
                array[1] = food;
            }
            if (Snacks.hamsi.isSelected()){
                if(Snacks.ham.getText().equals("")){
                    arrayItem[2] = 0;
                    food = "Turon\t\tP 10.00";       
                    price[2] = 10;
                    total += price[2]*arrayItem[2];
                    array[2] = food;
                } else {
                    arrayItem[2] = Integer.parseInt(Snacks.ham.getText());
                    food = "Turon\t\tP 10.00";       
                    price[2] = 10;
                    total += price[2]*arrayItem[2];
                    array[2] = food;
                }
                
            } else {
                food = null;
                price[2] = 0;
                total += price[2];
                array[2] = food;
            }
            if (Snacks.porksi.isSelected()){
                if (Snacks.jTextField4.getText().equals("")){
                    arrayItem[3] = 0;
                    food = "Burger\t\tP 25.00";       
                    price[3] = 25;
                    total += price[3];
                    array[3] = food;
                } else {
                    arrayItem[3] = Integer.parseInt(Snacks.jTextField4.getText());
                    food = "Burger\t\tP 25.00";       
                    price[3] = 25;
                    total += price[3];
                    array[3] = food;
                }
            } else {
                food = null;
                price[3] = 0;
                total += price[3];
                array[3] = food;
            }
            if (Snacks.hotsi.isSelected()){
                if (Snacks.jTextField5.getText().equals("")){
                    arrayItem[4] = 0;
                    food = "Footlong\t\tP 30.00";       
                    price[4] = 30;
                    total += price[4]*arrayItem[4];
                    array[4] = food;
                } else {
                    arrayItem[4] = Integer.parseInt(Snacks.jTextField5.getText());
                    food = "Footlong\t\tP 30.00";       
                    price[4] = 30;
                    total += price[4]*arrayItem[4];
                    array[4] = food;
                }
            } else {
                food = null;
                price[4] = 0;
                total += price[4];
                array[4] = food;
            }
            if (Snacks.tapsi1.isSelected()){
                if (Snacks.jTextField6.getText().equals("")){
                    arrayItem[5] = 0;
                    food = "Pizza\t\tP 10.00";       
                    price[5] = 10;
                    total += price[5]*arrayItem[5];
                    array[5] = food;
                } else {
                    arrayItem[5] = Integer.parseInt(Snacks.jTextField6.getText());
                    food = "Pizza\t\tP 10.00";       
                    price[5] = 10;
                    total += price[5]*arrayItem[5];
                    array[5] = food;
                }
                
            } else {
                food = null;
                price[5] = 0;
                total += price[5];
                array[5] = food;
            }
            if (Snacks.tapsi2.isSelected()){
                if (Snacks.jTextField8.getText().equals("")){
                    arrayItem[6] = 0;
                    food = "Puto\t\t\tP 10.00";       
                    price[6] = 10;
                    total += price[6]*arrayItem[6];
                    array[6] = food;   
                } else {
                    arrayItem[6] = Integer.parseInt(Snacks.jTextField8.getText());
                    food = "Puto\t\t\tP 10.00";       
                    price[6] = 10;
                    total += price[6]*arrayItem[6];
                    array[6] = food;
                }            
            } else {
                food = null;
                price[6] = 0;
                total += price[6];
                array[6] = food;
            }
            if (Snacks.panCanton.isSelected()){
                if (Snacks.jTextField9.getText().equals("")){
                    arrayItem[7] = 0;
                    food = "Ginataan\t\tP 30.00";       
                    price[7] = 30;
                    total += price[7]*arrayItem[7];
                    array[7] = food;
                } else {
                    arrayItem[7] = Integer.parseInt(Snacks.jTextField9.getText());
                    food = "Ginataan\t\tP 30.00";       
                    price[7] = 30;
                    total += price[7]*arrayItem[7];
                    array[7] = food;
                }
            } else {
                food = null;
                price[7] = 0;
                total += price[7];
                array[7] = food;
            }
            if (Snacks.panPalabok.isSelected()){
                if (Snacks.jTextField10.getText().equals("")){
                    arrayItem[8] = 0;
                    food = "Champorado\t\tP 30.00";       
                    price[8] = 30;
                    total += price[8]*arrayItem[8];
                    array[8] = food;
                } else {
                    arrayItem[8] = Integer.parseInt(Snacks.jTextField10.getText());
                    food = "Champorado\t\tP 30.00";       
                    price[8] = 30;
                    total += price[8]*arrayItem[8];
                    array[8] = food;
                }
            } else {
                food = null;
                price[8] = 0;
                total += price[8];
                array[8] = food;
            }
            if (Snacks.whiteSpa.isSelected()){
                if (Snacks.jTextField11.getText().equals("")){
                    arrayItem[9] = 0;
                    food = "Lugaw\t\tP 30.00";       
                    price[9] = 30;
                    total += price[9]*arrayItem[9];
                    array[9] = food;
                } else {
                    arrayItem[9] = Integer.parseInt(Snacks.jTextField11.getText());
                    food = "Lugaw\t\tP 30.00";       
                    price[9] = 30;
                    total += price[9]*arrayItem[9];
                    array[9] = food;
                }
            } else {
                food = null;
                price[9] = 0;
                total += price[9];
                array[9] = food;
            }
            if (Snacks.whiteSpa1.isSelected()){
                if (Snacks.jTextField12.getText().equals("")){
                    arrayItem[10] = 0;
                    food = "Halo-halo\t\tP 20.00";       
                    price[10] = 20;
                    total += price[10]*arrayItem[10];
                    array[10] = food;
                } else {
                    arrayItem[10] = Integer.parseInt(Snacks.jTextField12.getText());
                    food = "Halo-halo\t\tP 20.00";       
                    price[10] = 20;
                    total += price[10]*arrayItem[10];
                    array[10] = food;
                }
                
            } else {
                food = null;
                price[10] = 0;
                total += price[10];
                array[10] = food;
            }
            if (Snacks.whiteSpa2.isSelected()){
                if(Snacks.jTextField13.getText().equals("")){
                    arrayItem[11] = 0;
                    food = "Choco Shake\t\tP 12.00";       
                    price[11] = 12;
                    total += price[11]*arrayItem[11];
                    array[11] = food;
                } else {
                    arrayItem[11] = Integer.parseInt(Snacks.jTextField13.getText());
                    food = "Choco Shake\t\tP 12.00";       
                    price[11] = 12;
                    total += price[11]*arrayItem[11];
                    array[11] = food;
                }            
            } else {
                food = null;
                price[11] = 0;
                total += price[11];
                array[11] = food;
            }
            if (Snacks.spaghetti.isSelected()){
                if(Snacks.jTextField14.getText().equals("")){
                    arrayItem[12] = 0;
                    food = "Ice Cream\t\tP 12.00";       
                    price[12] = 12;
                    total += price[12]*arrayItem[12];
                    array[12] = food;
                } else {
                    arrayItem[12] = Integer.parseInt(Snacks.jTextField14.getText());
                    food = "Ice Cream\t\tP 12.00";       
                    price[12] = 12;
                    total += price[12]*arrayItem[12];
                    array[12] = food;
                }            
            } else {
                food = null;
                price[12] = 0;
                total += price[12];
                array[12] = food;
            }
            if (Snacks.spaghetti1.isSelected()){
                if(Snacks.jTextField15.getText().equals("")){
                    arrayItem[13] = 0;
                    food = "Ice Candy\t\tP  5.00";       
                    price[13] = 5;
                    total += price[13]*arrayItem[13];
                    array[13] = food;
                } else {
                    arrayItem[13] = Integer.parseInt(Snacks.jTextField15.getText());
                    food = "Ice Candy\t\tP  5.00";       
                    price[13] = 5;
                    total += price[13]*arrayItem[13];
                    array[13] = food;
                }
                
            } else {
                food = null;
                price[13] = 0;
                total += price[13];
                array[13] = food;
            }
      
        	
            if (total<=0){
                JOptionPane.showMessageDialog(null,"Please order food first,\n or back to menu to order drinks only.","EMPTY FOOD!!!",JOptionPane.OK_CANCEL_OPTION);

            } else { 
                reviewArea.setText("***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"***                             ********** Continue To Proceed **********                          ***\n");
                reviewArea.setText(reviewArea.getText()+"***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"\t\tSNACKS & DRINKS\n\n");
                reviewArea.setText(reviewArea.getText()+"Name  :   "+name);
                reviewArea.setText(reviewArea.getText()+"\n\nList of Order/s  :");
                reviewArea.setText(reviewArea.getText()+"\n\n   Food Order/s :\t\tNo. of Item/s                  Total Price\n");
            
            for (int i = 0, it = 0,pr = 0; i<array.length; i++,it++,pr++){
                if (array[i]==null){

                } else {
                    reviewArea.setText(reviewArea.getText()+"              "+array[i]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
                }
            }
            
            allfood = reviewArea.getText();
            Fd(allfood,total);
            Drinks dr = new Drinks();
            desk.removeAll();
            desk.repaint();
            desk.add(dr);
            dr.setLocation(55,0);
            dr.show();
            drinks.setText("BACK");
            MainMenu.hand = 50;
            total=0;
             }
        	
        	break;
        	
        case 10:
            order.setVisible(true);
            Drinks drs = new Drinks();
            desk.removeAll();
            desk.repaint();
            desk.add(drs);
            drs.setLocation(55,0);
            drs.show();
            drinks.setText("FOOD");
            MainMenu.hand = 0;
            break;
        case 20:
            Bfast bf = new Bfast();
            desk.removeAll();
            desk.repaint();
            desk.add(bf);
            bf.show();
            drinks.setText("DRINKS");
            
            MainMenu.hand = 1;
            break;
            
        case 30:
            Lunch lun = new Lunch();
            desk.removeAll();
            desk.repaint();
            desk.add(lun);
            lun.show();
            drinks.setText("DRINKS");
            
            MainMenu.hand = 2;
            break;
            
        case 40:
            Dinner dnr = new Dinner();
            desk.removeAll();
            desk.repaint();
            desk.add(dnr);
            dnr.show();
            drinks.setText("DRINKS");
            MainMenu.hand = 3;            
            break;
            
        case 50:
        	Snacks snk = new Snacks();
        	desk.removeAll();
            desk.repaint();
            desk.add(snk);
            snk.show();
            drinks.setText("DRINKS");
            MainMenu.hand = 4; 
        	break;
        	
        default:
            break;
       }
    }//GEN-LAST:event_drinksActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        MainMenu me = new MainMenu();
        this.dispose();
        me.setVisible(true);
        Option.oh = 0;
    }//GEN-LAST:event_menuActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
         switch(MainMenu.hand){
            case 0:
            case 20:
            case 30:
            case 40:
            case 50:
                Drinks dd = new Drinks();
                desk.removeAll();
                desk.updateUI();
                desk.add(dd);
                dd.setLocation(55,0);
                dd.show();
                break;
                 
            case 1:
                    
                    Bfast bb = new Bfast();
                    desk.removeAll();
                    desk.updateUI();
                    desk.add(bb);
                    bb.show();
                    
                break;
                
            case 2:
            	Lunch ll = new Lunch();
            	desk.removeAll();
            	desk.updateUI();
                desk.add(ll);
                ll.show();
                
            	break;
            	
            case 3:
            	Dinner dinr = new Dinner();
            	desk.removeAll();
            	desk.updateUI();
                desk.add(dinr);
                dinr.show();
            	
                break;
            	                
            case 4:
            	Snacks ss = new Snacks();
            	desk.removeAll();
            	desk.updateUI();
                desk.add(ss);
                ss.show();
            	break;
            	
            default:
                break;
        }
    }//GEN-LAST:event_resetActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        
        
        RR openR = new RR();
        Review rev = new Review();
        switch(MainMenu.hand){
            case 0:
                if (Drinks.jCheckBox1.isSelected()){
                    if (Drinks.jTextField1.getText().equals("")){
                        drItem[0] = 0;
                        Dname = "Black Coffee\t\tP 10.00";
                        drPrice[0] = 10;
                        drTotal += drPrice[0]*drItem[0];
                        drName[0] = Dname ;                        
                    } else {
                        drItem[0] = Integer.parseInt(Drinks.jTextField1.getText());
                        Dname = "Black Coffee\t\tP 10.00";
                        drPrice[0] = 10;
                        drTotal += drPrice[0]*drItem[0];
                        drName[0] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[0] = 0;
                    drTotal += drPrice[0];
                    drName[0] = Dname;
                }
                if (Drinks.jCheckBox2.isSelected()){
                    if (Drinks.jTextField2.getText().equals("")){
                        drItem[1] = 0;
                        Dname = "Brown Coffee\t\tP 10.00";
                        drPrice[1] = 10;
                        drTotal += drPrice[0]*drItem[0];
                        drName[1] = Dname ;                        
                    } else {
                        drItem[1] = Integer.parseInt(Drinks.jTextField2.getText());
                        Dname = "Brown Coffee\t\tP 10.00";
                        drPrice[1] = 10;
                        drTotal += drPrice[1]*drItem[1];
                        drName[1] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[1] = 0;
                    drTotal += drPrice[1];
                    drName[1] = Dname;
                }
                if (Drinks.jCheckBox3.isSelected()){
                    if (Drinks.jTextField3.getText().equals("")){
                        drItem[2] = 0;
                        Dname = "Hot Tea\t\tP 10.00";
                        drPrice[2] = 10;
                        drTotal += drPrice[2]*drItem[2];
                        drName[2] = Dname ;                        
                    } else {
                        drItem[2] = Integer.parseInt(Drinks.jTextField3.getText());
                        Dname = "Hot Tea\t\tP 10.00";
                        drPrice[2] = 10;
                        drTotal += drPrice[2]*drItem[2];
                        drName[2] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[2] = 0;
                    drTotal += drPrice[2];
                    drName[2] = Dname;
                }
                if (Drinks.jCheckBox4.isSelected()){
                    if (Drinks.jTextField4.getText().equals("")){
                        drItem[3] = 0;
                        Dname = "Hot Milk\t\tP 15.00";
                        drPrice[3] = 15;
                        drTotal += drPrice[3]*drItem[3];
                        drName[3] = Dname ;                        
                    } else {
                        drItem[3] = Integer.parseInt(Drinks.jTextField4.getText());
                        Dname = "Hot Milk\t\tP 15.00";
                        drPrice[3] = 15;
                        drTotal += drPrice[3]*drItem[3];
                        drName[3] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[3] = 0;
                    drTotal += drPrice[3];
                    drName[3] = Dname;
                }
                if (Drinks.jCheckBox5.isSelected()){
                    if (Drinks.jTextField5.getText().equals("")){
                        drItem[4] = 0;
                        Dname = "Hot Choco\t\tP 15.00";
                        drPrice[4] = 15;
                        drTotal += drPrice[4]*drItem[4];
                        drName[4] = Dname ;                        
                    } else {
                        drItem[4] = Integer.parseInt(Drinks.jTextField5.getText());
                        Dname = "Hot Choco\t\tP 15.00";
                        drPrice[4] = 15;
                        drTotal += drPrice[4]*drItem[4];
                        drName[4] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[4] = 0;
                    drTotal += drPrice[4];
                    drName[4] = Dname;
                }
                if (Drinks.jCheckBox6.isSelected()){
                    if (Drinks.jTextField14.getText().equals("")){
                        drItem[5] = 0;
                        Dname = "Cold Water\t\tP 10.00";
                        drPrice[5] = 10;
                        drTotal += drPrice[5]*drItem[5];
                        drName[5] = Dname ;                        
                    } else {
                        drItem[5] = Integer.parseInt(Drinks.jTextField14.getText());
                        Dname = "Cold Water\t\tP 10.00";
                        drPrice[5] = 10;
                        drTotal += drPrice[5]*drItem[5];
                        drName[5] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[5] = 0;
                    drTotal += drPrice[5];
                    drName[5] = Dname;
                }
                if (Drinks.jCheckBox7.isSelected()){
                    if (Drinks.jTextField15.getText().equals("")){
                        drItem[6] = 0;
                        Dname = "Hot Water\t\tP   5.00";
                        drPrice[6] = 5;
                        drTotal += drPrice[6]*drItem[6];
                        drName[6] = Dname ;                        
                    } else {
                        drItem[6] = Integer.parseInt(Drinks.jTextField15.getText());
                        Dname = "Hot Water\t\tP   5.00";
                        drPrice[6] = 5;
                        drTotal += drPrice[6]*drItem[6];
                        drName[6] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[6] = 0;
                    drTotal += drPrice[6];
                    drName[6] = Dname;
                }
                if (Drinks.buko.isSelected()){
                    if (Drinks.jTextField6.getText().equals("")){
                        drItem[7] = 0;
                        Dname = "Buko juice\t\tP 12.00";
                        drPrice[7] = 12;
                        drTotal += drPrice[7]*drItem[7];
                        drName[7] = Dname ;                        
                    } else {
                        drItem[7] = Integer.parseInt(Drinks.jTextField6.getText());
                        Dname = "Buko juice\t\tP 12.00";
                        drPrice[7] = 12;
                        drTotal += drPrice[7]*drItem[7];
                        drName[7] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[7] = 0;
                    drTotal += drPrice[7];
                    drName[7] = Dname;
                }
                if (Drinks.pineapple.isSelected()){
                    if (Drinks.jTextField7.getText().equals("")){
                        drItem[8] = 0;
                        Dname = "Pineapple juice\t\tP 12.00";
                        drPrice[8] = 12;
                        drTotal += drPrice[8]*drItem[8];
                        drName[8] = Dname ;                        
                    } else {
                        drItem[8] = Integer.parseInt(Drinks.jTextField7.getText());
                        Dname = "Pineapple juice\t\tP 12.00";
                        drPrice[8] = 12;
                        drTotal += drPrice[8]*drItem[8];
                        drName[8] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[8] = 0;
                    drTotal += drPrice[8];
                    drName[8] = Dname;
                }
                if (Drinks.orange.isSelected()){
                    if (Drinks.jTextField8.getText().equals("")){
                        drItem[9] = 0;
                        Dname = "Orange juice\t\tP 12.00";
                        drPrice[9] = 12;
                        drTotal += drPrice[9]*drItem[9];
                        drName[9] = Dname ;                        
                    } else {
                        drItem[9] = Integer.parseInt(Drinks.jTextField8.getText());
                        Dname = "Orange juice\t\tP 12.00";
                        drPrice[9] = 12;
                        drTotal += drPrice[9]*drItem[9];
                        drName[9] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[9] = 0;
                    drTotal += drPrice[9];
                    drName[9] = Dname;
                }
                if (Drinks.melon.isSelected()){
                    if (Drinks.jTextField9.getText().equals("")){
                        drItem[10] = 0;
                        Dname = "Melon juice\t\tP 12.00";
                        drPrice[10] = 12;
                        drTotal += drPrice[10]*drItem[10];
                        drName[10] = Dname ;                        
                    } else {
                        drItem[10] = Integer.parseInt(Drinks.jTextField9.getText());
                        Dname = "Melon juice\t\tP 12.00";
                        drPrice[10] = 12;
                        drTotal += drPrice[10]*drItem[10];
                        drName[10] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[10] = 0;
                    drTotal += drPrice[10];
                    drName[10] = Dname;
                }
                if (Drinks.apple.isSelected()){
                    if (Drinks.jTextField10.getText().equals("")){
                        drItem[11] = 0;
                        Dname = "Apple juice\t\tP 12.00";
                        drPrice[11] = 12;
                        drTotal += drPrice[11]*drItem[11];
                        drName[11] = Dname ;                        
                    } else {
                        drItem[11] = Integer.parseInt(Drinks.jTextField10.getText());
                        Dname = "Apple juice\t\tP 12.00";
                        drPrice[11] = 12;
                        drTotal += drPrice[11]*drItem[11];
                        drName[11] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[11] = 0;
                    drTotal += drPrice[11];
                    drName[11] = Dname;
                }
                if (Drinks.cola.isSelected()){
                    if (Drinks.jTextField11.getText().equals("")){
                        drItem[12] = 0;
                        Dname = "Cola\t\t\tP 15.00";
                        drPrice[12] = 15;
                        drTotal += drPrice[12]*drItem[12];
                        drName[12] = Dname ;                        
                    } else {
                        drItem[12] = Integer.parseInt(Drinks.jTextField11.getText());
                        Dname = "Cola\t\t\tP 15.00";
                        drPrice[12] = 15;
                        drTotal += drPrice[12]*drItem[12];
                        drName[12] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[12] = 0;
                    drTotal += drPrice[12];
                    drName[12] = Dname;
                }
                if (Drinks.c2.isSelected()){
                    if (Drinks.jTextField12.getText().equals("")){
                        drItem[13] = 0;
                        Dname = "C2\t\t\tP 15.00";
                        drPrice[13] = 15;
                        drTotal += drPrice[13]*drItem[13];
                        drName[13] = Dname ;                        
                    } else {
                        drItem[13] = Integer.parseInt(Drinks.jTextField12.getText());
                        Dname = "C2\t\t\tP 15.00";
                        drPrice[13] = 15;
                        drTotal += drPrice[13]*drItem[13];
                        drName[13] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[13] = 0;
                    drTotal += drPrice[13];
                    drName[13] = Dname;
                }
                if (Drinks.minit.isSelected()){
                    if (Drinks.jTextField13.getText().equals("")){
                        drItem[14] = 0;
                        Dname = "Minit\t\t\tP 15.00";
                        drPrice[14] = 15;
                        drTotal += drPrice[14]*drItem[14];
                        drName[14] = Dname ;                        
                    } else {
                        drItem[14] = Integer.parseInt(Drinks.jTextField13.getText());
                        Dname = "Minit\t\t\tP 15.00";
                        drPrice[14] = 15;
                        drTotal += drPrice[14]*drItem[14];
                        drName[14] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[14] = 0;
                    drTotal += drPrice[14];
                    drName[14] = Dname;
                }
                if (drTotal<=0){
                    JOptionPane.showMessageDialog(null,"Please Check Your Order!","EMPTY ORDER!!!",JOptionPane.ERROR_MESSAGE);
                   
                } else { 
                reviewArea.setText("***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"***                             ********** Continue To Proceed **********                          ***\n");
                reviewArea.setText(reviewArea.getText()+"***************************************************************************************************\n");
                reviewArea.setText(reviewArea.getText()+"\t\t      D R I N K S\n\n");
                reviewArea.setText(reviewArea.getText()+"Name  :   "+name);
                reviewArea.setText(reviewArea.getText()+"\n\nList of Order/s  :");
                reviewArea.setText(reviewArea.getText()+"\n\n   Drinks Order/s :\t\tNo. of Item/s                  Total Price\n");
                
                for( int arr = 0, dit = 0, dp = 0; arr<drName.length; arr++, dit++, dp++){
                    if (drName[arr] == null){
                        
                    } else {
                        reviewArea.setText(reviewArea.getText()+"              "+drName[arr]+"   x   "+drItem[dit]+"                   P "+drPrice[dp]*drItem[dit]+".00\n");
                    }
                }

                reviewArea.setText(reviewArea.getText()+"\n\t\t\t              Over All Total :   P "+drTotal+".00");

                handler = 0;
                rev.totalM(drTotal,name);
                openR.R_desk.add(rev);
                rev.setLocation(40,15);
                rev.show();
                this.dispose();
                openR.setVisible(true);

                }
                
                break;
                
                
            case 1:
        if (Bfast.tapsi.isSelected()){
            if (Bfast.tap.getText().equals("")){          
                arrayItem[0] = 0;
                food = "Tapsilog\t\tP 40.00";       
                price[0] = 40;
                total += price[0]*arrayItem[0];
                array[0] = food;
            } else {
                arrayItem[0] = Integer.parseInt(Bfast.tap.getText());
                food = "Tapsilog\t\tP 40.00";       
                price[0] = 40;
                total += price[0]*arrayItem[0];
                array[0] = food;    
            }
        } else {
            food = null;
            price[0] = 0;
            total += price[0];
            array[0] = food;
        }
        
        if (Bfast.longsi.isSelected()){
            if (Bfast.longSi.getText().equals("")){
                arrayItem[1] = 0;
                food = "Longsilog\t\tP 40.00";       
                price[1] = 40;
                total += price[1]*arrayItem[1];
                array[1] = food;
            } else {
                arrayItem[1] = Integer.parseInt(Bfast.longSi.getText());
                food = "Longsilog\t\tP 40.00";       
                price[1] = 40;
                total += price[1]*arrayItem[1];
                array[1] = food;
            }
        } else {
            food = null;
            price[1] = 0;
            total += price[1];
            array[1] = food;
        }
        if (Bfast.hamsi.isSelected()){
            if(Bfast.ham.getText().equals("")){
                arrayItem[2] = 0;
                food = "Hamsilog\t\tP 40.00";       
                price[2] = 40;
                total += price[2]*arrayItem[2];
                array[2] = food;
            } else {
                arrayItem[2] = Integer.parseInt(Bfast.ham.getText());
                food = "Hamsilog\t\tP 40.00";       
                price[2] = 40;
                total += price[2]*arrayItem[2];
                array[2] = food;
            }
            
        } else {
            food = null;
            price[2] = 0;
            total += price[2];
            array[2] = food;
        }
        if (Bfast.porksi.isSelected()){
            if (Bfast.jTextField4.getText().equals("")){
                arrayItem[3] = 0;
                food = "Porksilog\t\tP 40.00";       
                price[3] = 40;
                total += price[3];
                array[3] = food;
            } else {
                arrayItem[3] = Integer.parseInt(Bfast.jTextField4.getText());
                food = "Porksilog\t\tP 40.00";       
                price[3] = 40;
                total += price[3];
                array[3] = food;
            }
        } else {
            food = null;
            price[3] = 0;
            total += price[3];
            array[3] = food;
        }
        if (Bfast.hotsi.isSelected()){
            if (Bfast.jTextField5.getText().equals("")){
                arrayItem[4] = 0;
                food = "Hotsilog\t\tP 40.00";       
                price[4] = 40;
                total += price[4]*arrayItem[4];
                array[4] = food;
            } else {
                arrayItem[4] = Integer.parseInt(Bfast.jTextField5.getText());
                food = "Hotsilog\t\tP 40.00";       
                price[4] = 40;
                total += price[4]*arrayItem[4];
                array[4] = food;
            }
        } else {
            food = null;
            price[4] = 0;
            total += price[4];
            array[4] = food;
        }
        if (Bfast.tapsi1.isSelected()){
            if (Bfast.jTextField6.getText().equals("")){
                arrayItem[5] = 0;
                food = "Tosilog\t\tP 40.00";       
                price[5] = 40;
                total += price[5]*arrayItem[5];
                array[5] = food;
            } else {
                arrayItem[5] = Integer.parseInt(Bfast.jTextField6.getText());
                food = "Tosilog\t\tP 40.00";       
                price[5] = 40;
                total += price[5]*arrayItem[5];
                array[5] = food;
            }
            
        } else {
            food = null;
            price[5] = 0;
            total += price[5];
            array[5] = food;
        }
        if (Bfast.tapsi2.isSelected()){
            if (Bfast.jTextField8.getText().equals("")){
                arrayItem[6] = 0;
                food = "Sopas\t\tP 30.00";       
                price[6] = 30;
                total += price[6]*arrayItem[6];
                array[6] = food;   
            } else {
                arrayItem[6] = Integer.parseInt(Bfast.jTextField8.getText());
                food = "Sopas\t\tP 30.00";       
                price[6] = 30;
                total += price[6]*arrayItem[6];
                array[6] = food;
            }            
        } else {
            food = null;
            price[6] = 0;
            total += price[6];
            array[6] = food;
        }
        if (Bfast.panCanton.isSelected()){
            if (Bfast.jTextField9.getText().equals("")){
                arrayItem[7] = 0;
                food = "Pansit Canton\t\tP 30.00";       
                price[7] = 30;
                total += price[7]*arrayItem[7];
                array[7] = food;
            } else {
                arrayItem[7] = Integer.parseInt(Bfast.jTextField9.getText());
                food = "Pansit Canton\t\tP 30.00";       
                price[7] = 30;
                total += price[7]*arrayItem[7];
                array[7] = food;
            }
        } else {
            food = null;
            price[7] = 0;
            total += price[7];
            array[7] = food;
        }
        if (Bfast.panPalabok.isSelected()){
            if (Bfast.jTextField10.getText().equals("")){
                arrayItem[8] = 0;
                food = "Pansit Palabok\t\tP 30.00";       
                price[8] = 30;
                total += price[8]*arrayItem[8];
                array[8] = food;
            } else {
                arrayItem[8] = Integer.parseInt(Bfast.jTextField10.getText());
                food = "Pansit Palabok\t\tP 30.00";       
                price[8] = 30;
                total += price[8]*arrayItem[8];
                array[8] = food;
            }
        } else {
            food = null;
            price[8] = 0;
            total += price[8];
            array[8] = food;
        }
        if (Bfast.whiteSpa.isSelected()){
            if (Bfast.jTextField11.getText().equals("")){
                arrayItem[9] = 0;
                food = "White Spaghetti\t\tP 30.00";       
                price[9] = 30;
                total += price[9]*arrayItem[9];
                array[9] = food;
            } else {
                arrayItem[9] = Integer.parseInt(Bfast.jTextField11.getText());
                food = "White Spaghetti\t\tP 30.00";       
                price[9] = 30;
                total += price[9]*arrayItem[9];
                array[9] = food;
            }
        } else {
            food = null;
            price[9] = 0;
            total += price[9];
            array[9] = food;
        }
        if (Bfast.whiteSpa1.isSelected()){
            if (Bfast.jTextField12.getText().equals("")){
                arrayItem[10] = 0;
                food = "Spaghetti\t\tP 30.00";       
                price[10] = 30;
                total += price[10]*arrayItem[10];
                array[10] = food;
            } else {
                arrayItem[10] = Integer.parseInt(Bfast.jTextField12.getText());
                food = "Spaghetti\t\tP 30.00";       
                price[10] = 30;
                total += price[10]*arrayItem[10];
                array[10] = food;
            }
            
        } else {
            food = null;
            price[10] = 0;
            total += price[10];
            array[10] = food;
        }
        if (Bfast.whiteSpa2.isSelected()){
            if(Bfast.jTextField13.getText().equals("")){
                arrayItem[11] = 0;
                food = "Homi\t\t\tP 30.00";       
                price[11] = 30;
                total += price[11]*arrayItem[11];
                array[11] = food;
            } else {
                arrayItem[11] = Integer.parseInt(Bfast.jTextField13.getText());
                food = "Homi\t\t\tP 30.00";       
                price[11] = 30;
                total += price[11]*arrayItem[11];
                array[11] = food;
            }            
        } else {
            food = null;
            price[11] = 0;
            total += price[11];
            array[11] = food;
        }
        if (Bfast.spaghetti.isSelected()){
            if(Bfast.jTextField14.getText().equals("")){
                arrayItem[12] = 0;
                food = "Macaroni\t\tP 30.00";       
                price[12] = 30;
                total += price[12]*arrayItem[12];
                array[12] = food;
            } else {
                arrayItem[12] = Integer.parseInt(Bfast.jTextField14.getText());
                food = "Macaroni\t\tP 30.00";       
                price[12] = 30;
                total += price[12]*arrayItem[12];
                array[12] = food;
            }            
        } else {
            food = null;
            price[12] = 0;
            total += price[12];
            array[12] = food;
        }
        if (Bfast.spaghetti1.isSelected()){
            if(Bfast.jTextField15.getText().equals("")){
                arrayItem[13] = 0;
                food = "Pasta\t\tP 30.00";       
                price[13] = 30;
                total += price[13]*arrayItem[13];
                array[13] = food;
            } else {
                arrayItem[13] = Integer.parseInt(Bfast.jTextField15.getText());
                food = "Pasta\t\tP 30.00";       
                price[13] = 30;
                total += price[13]*arrayItem[13];
                array[13] = food;
            }
            
        } else {
            food = null;
            price[13] = 0;
            total += price[13];
            array[13] = food;
        }
         
        if (total<=0){
            JOptionPane.showMessageDialog(null,"Please Check Your Order!","EMPTY ORDER!!!",JOptionPane.ERROR_MESSAGE);
        } else if (Option.oh == 1){
            reviewArea.setText(pName);
            reviewArea.setText(reviewArea.getText()+"\n   Food Order/s :\n");
            for (int i = 0, it = 0,pr = 0; i<array.length; i++,it++,pr++){
                if (array[i]==null){

                } else {
                    reviewArea.setText(reviewArea.getText()+"              "+array[i]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
                }

            }
            int totalAll = pTotal+total;
            
            reviewArea.setText(reviewArea.getText()+"\n\t\t\t              Over All Total :   P "+totalAll+".00");
            
            Review.opTotal(totalAll);
            
            handler = 11;
            rev.totalM(total,name);
            openR.R_desk.add(rev);
            rev.setLocation(40,15);
            rev.show();
            this.dispose();
            openR.setVisible(true);
            Option.oh = 0;
        } else {
            reviewArea.setText("***************************************************************************************************\n");
            reviewArea.setText(reviewArea.getText()+"***                             ********** Continue To Proceed **********                          ***\n");
            reviewArea.setText(reviewArea.getText()+"***************************************************************************************************\n");
            reviewArea.setText(reviewArea.getText()+"\t\tB R E A K F A S T\n\n");
            reviewArea.setText(reviewArea.getText()+"Name  :   "+name);
            reviewArea.setText(reviewArea.getText()+"\n\nList of Order/s  :");
            reviewArea.setText(reviewArea.getText()+"\n\n   Food Order/s :\t\tNo. of Item/s                  Total Price\n");
        
        for (int i = 0, it = 0,pr = 0; i<array.length; i++,it++,pr++){
            if (array[i]==null){
                
            } else {
                reviewArea.setText(reviewArea.getText()+"              "+array[i]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
            }
            
        }
        
            reviewArea.setText(reviewArea.getText()+"\n\t\t\t              Over All Total :   P "+total+".00");
    
        handler = 1;
        rev.totalM(total,name);
        openR.R_desk.add(rev);
        rev.setLocation(40,15);
        rev.show();
        this.dispose();
        openR.setVisible(true);
        }
        
            break;

        case 2:
            
        if (Lunch.adobo.isSelected()){
            if (Lunch.tap.getText().equals("")){          
                arrayItem[0] = 0;
                food = "Adobo\t\tP 40.00";       
                price[0] = 40;
                total += price[0]*arrayItem[0];
                array[0] = food;
            } else {
                arrayItem[0] = Integer.parseInt(Lunch.tap.getText());
                food = "Adobo\t\tP 40.00";       
                price[0] = 40;
                total += price[0]*arrayItem[0];
                array[0] = food;    
            }
        } else {
            food = null;
            price[0] = 0;
            total += price[0];
            array[0] = food;
        }
        
        if (Lunch.longsi.isSelected()){
            if (Lunch.longSi.getText().equals("")){
                arrayItem[1] = 0;
                food = "Menudo\t\tP 40.00";       
                price[1] = 40;
                total += price[1]*arrayItem[1];
                array[1] = food;
            } else {
                arrayItem[1] = Integer.parseInt(Lunch.longSi.getText());
                food = "Menudo\t\tP 40.00";       
                price[1] = 40;
                total += price[1]*arrayItem[1];
                array[1] = food;
            }
        } else {
            food = null;
            price[1] = 0;
            total += price[1];
            array[1] = food;
        }
        if (Lunch.hamsi.isSelected()){
            if(Lunch.ham.getText().equals("")){
                arrayItem[2] = 0;
                food = "Kaldereta\t\tP 40.00";       
                price[2] = 40;
                total += price[2]*arrayItem[2];
                array[2] = food;
            } else {
                arrayItem[2] = Integer.parseInt(Lunch.ham.getText());
                food = "Kaldereta\t\tP 40.00";       
                price[2] = 40;
                total += price[2]*arrayItem[2];
                array[2] = food;
            }
            
        } else {
            food = null;
            price[2] = 0;
            total += price[2];
            array[2] = food;
        }
        if (Lunch.porksi.isSelected()){
            if (Lunch.jTextField4.getText().equals("")){
                arrayItem[3] = 0;
                food = "Sisig\t\t\tP 40.00";       
                price[3] = 40;
                total += price[3];
                array[3] = food;
            } else {
                arrayItem[3] = Integer.parseInt(Lunch.jTextField4.getText());
                food = "Sisig\t\t\tP 40.00";       
                price[3] = 40;
                total += price[3];
                array[3] = food;
            }
        } else {
            food = null;
            price[3] = 0;
            total += price[3];
            array[3] = food;
        }
        if (Lunch.hotsi.isSelected()){
            if (Lunch.jTextField5.getText().equals("")){
                arrayItem[4] = 0;
                food = "Pinakbet\t\tP 40.00";       
                price[4] = 40;
                total += price[4]*arrayItem[4];
                array[4] = food;
            } else {
                arrayItem[4] = Integer.parseInt(Lunch.jTextField5.getText());
                food = "Pinakbet\t\tP 40.00";       
                price[4] = 40;
                total += price[4]*arrayItem[4];
                array[4] = food;
            }
        } else {
            food = null;
            price[4] = 0;
            total += price[4];
            array[4] = food;
        }
        if (Lunch.tapsi1.isSelected()){
            if (Lunch.jTextField6.getText().equals("")){
                arrayItem[5] = 0;
                food = "Sinigang na Baboy\t\tP 40.00";       
                price[5] = 40;
                total += price[5]*arrayItem[5];
                array[5] = food;
            } else {
                arrayItem[5] = Integer.parseInt(Lunch.jTextField6.getText());
                food = "Sinigang na Baboy\t\tP 40.00";       
                price[5] = 40;
                total += price[5]*arrayItem[5];
                array[5] = food;
            }
            
        } else {
            food = null;
            price[5] = 0;
            total += price[5];
            array[5] = food;
        }
        if (Lunch.tapsi2.isSelected()){
            if (Lunch.jTextField8.getText().equals("")){
                arrayItem[6] = 0;
                food = "Ginatang Manok\t\tP 40.00";       
                price[6] = 40;
                total += price[6]*arrayItem[6];
                array[6] = food;   
            } else {
                arrayItem[6] = Integer.parseInt(Lunch.jTextField8.getText());
                food = "Ginatang Manok\t\tP 40.00";       
                price[6] = 40;
                total += price[6]*arrayItem[6];
                array[6] = food;
            }            
        } else {
            food = null;
            price[6] = 0;
            total += price[6];
            array[6] = food;
        }
        if (Lunch.panCanton.isSelected()){
            if (Lunch.jTextField9.getText().equals("")){
                arrayItem[7] = 0;
                food = "Giniling na Baboy\t\tP 40.00";       
                price[7] = 40;
                total += price[7]*arrayItem[7];
                array[7] = food;
            } else {
                arrayItem[7] = Integer.parseInt(Lunch.jTextField9.getText());
                food = "Giniling na Baboy\t\tP 40.00";       
                price[7] = 40;
                total += price[7]*arrayItem[7];
                array[7] = food;
            }
        } else {
            food = null;
            price[7] = 0;
            total += price[7];
            array[7] = food;
        }
        if (Lunch.panPalabok.isSelected()){
            if (Lunch.jTextField10.getText().equals("")){
                arrayItem[8] = 0;
                food = "Paksiw\t\tP 40.00";       
                price[8] = 40;
                total += price[8]*arrayItem[8];
                array[8] = food;
            } else {
                arrayItem[8] = Integer.parseInt(Lunch.jTextField10.getText());
                food = "Paksiw\t\tP 40.00";       
                price[8] = 40;
                total += price[8]*arrayItem[8];
                array[8] = food;
            }
        } else {
            food = null;
            price[8] = 0;
            total += price[8];
            array[8] = food;
        }
        if (Lunch.whiteSpa.isSelected()){
            if (Lunch.jTextField11.getText().equals("")){
                arrayItem[9] = 0;
                food = "Tortang Talong\t\tP 30.00";       
                price[9] = 30;
                total += price[9]*arrayItem[9];
                array[9] = food;
            } else {
                arrayItem[9] = Integer.parseInt(Lunch.jTextField11.getText());
                food = "Tortang Talong\t\tP 30.00";       
                price[9] = 30;
                total += price[9]*arrayItem[9];
                array[9] = food;
            }
        } else {
            food = null;
            price[9] = 0;
            total += price[9];
            array[9] = food;
        }
        if (Lunch.whiteSpa1.isSelected()){
            if (Lunch.jTextField12.getText().equals("")){
                arrayItem[10] = 0;
                food = "Pritong Isda\t\tP 30.00";       
                price[10] = 30;
                total += price[10]*arrayItem[10];
                array[10] = food;
            } else {
                arrayItem[10] = Integer.parseInt(Lunch.jTextField12.getText());
                food = "Pritong Isda\t\tP 30.00";       
                price[10] = 30;
                total += price[10]*arrayItem[10];
                array[10] = food;
            }
            
        } else {
            food = null;
            price[10] = 0;
            total += price[10];
            array[10] = food;
        }
        if (Lunch.whiteSpa2.isSelected()){
            if(Lunch.jTextField13.getText().equals("")){
                arrayItem[11] = 0;
                food = "Fried Chicken\t\tP 30.00";       
                price[11] = 30;
                total += price[11]*arrayItem[11];
                array[11] = food;
            } else {
                arrayItem[11] = Integer.parseInt(Lunch.jTextField13.getText());
                food = "Fried Chicken\t\tP 30.00";       
                price[11] = 30;
                total += price[11]*arrayItem[11];
                array[11] = food;
            }            
        } else {
            food = null;
            price[11] = 0;
            total += price[11];
            array[11] = food;
        }
        if (Lunch.spaghetti.isSelected()){
            if(Lunch.jTextField14.getText().equals("")){
                arrayItem[12] = 0;
                food = "Ham & Egg\t\tP 30.00";       
                price[12] = 30;
                total += price[12]*arrayItem[12];
                array[12] = food;
            } else {
                arrayItem[12] = Integer.parseInt(Lunch.jTextField14.getText());
                food = "Ham & Egg\t\tP 30.00";       
                price[12] = 30;
                total += price[12]*arrayItem[12];
                array[12] = food;
            }            
        } else {
            food = null;
            price[12] = 0;
            total += price[12];
            array[12] = food;
        }
        if (Lunch.spaghetti1.isSelected()){
            if(Lunch.jTextField15.getText().equals("")){
                arrayItem[13] = 0;
                food = "Hotdog\t\tP 20.00";       
                price[13] = 20;
                total += price[13]*arrayItem[13];
                array[13] = food;
            } else {
                arrayItem[13] = Integer.parseInt(Lunch.jTextField15.getText());
                food = "Hotdog\t\tP 20.00";       
                price[13] = 20;
                total += price[13]*arrayItem[13];
                array[13] = food;
            }
            
        } else {
            food = null;
            price[13] = 0;
            total += price[13];
            array[13] = food;
        }
         
        if (total<=0){
            JOptionPane.showMessageDialog(null,"Please Check Your Order!","EMPTY ORDER!!!",JOptionPane.ERROR_MESSAGE);
        } else if (Option.oh == 2){
            reviewArea.setText(pName);
            reviewArea.setText(reviewArea.getText()+"\n   Food Order/s :\n");
            for (int i = 0, it = 0,pr = 0; i<array.length; i++,it++,pr++){
                if (array[i]==null){

                } else {
                    reviewArea.setText(reviewArea.getText()+"              "+array[i]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
                }

            }
            int totalAll = pTotal+total;
            
            reviewArea.setText(reviewArea.getText()+"\n\t\t\t              Over All Total :   P "+totalAll+".00");
            
            Review.opTotal(totalAll);
            
            handler = 22;
            rev.totalM(total,name);
            openR.R_desk.add(rev);
            rev.setLocation(40,15);
            rev.show();
            this.dispose();
            openR.setVisible(true);
            Option.oh = 0;
        } else {
        reviewArea.setText("***************************************************************************************************\n");
        reviewArea.setText(reviewArea.getText()+"***                             ********** Continue To Proceed **********                          ***\n");
        reviewArea.setText(reviewArea.getText()+"***************************************************************************************************\n");
        reviewArea.setText(reviewArea.getText()+"\t\t L U N C H\n\n");
        reviewArea.setText(reviewArea.getText()+"Name  :   "+name);
        reviewArea.setText(reviewArea.getText()+"\n\nList of Order/s  :");
        reviewArea.setText(reviewArea.getText()+"\n\n   Food Order/s :\t\tNo. of Item/s                  Total Price\n");
        for (int i = 0, it = 0,pr = 0; i<array.length; i++,it++,pr++){
            if (array[i]==null){
                
            } else {
                reviewArea.setText(reviewArea.getText()+"              "+array[i]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
            }
            
        }
        
        reviewArea.setText(reviewArea.getText()+"\n\t\t\t              Over All Total :   P "+total+".00");
    
        handler = 2;
        rev.totalM(total,name);
        openR.R_desk.add(rev);
        rev.setLocation(40,15);
        rev.show();
        this.dispose();
        openR.setVisible(true);
        }
    
            break;
            
        case 3:
            
            if (Dinner.mecha.isSelected()){
                if (Dinner.tap.getText().equals("")){          
                    arrayItem[0] = 0;
                    food = "Mechado\t\tP 40.00";       
                    price[0] = 40;
                    total += price[0]*arrayItem[0];
                    array[0] = food;
                } else {
                    arrayItem[0] = Integer.parseInt(Dinner.tap.getText());
                    food = "Mechado\t\tP 40.00";       
                    price[0] = 40;
                    total += price[0]*arrayItem[0];
                    array[0] = food;    
                }
            } else {
                food = null;
                price[0] = 0;
                total += price[0];
                array[0] = food;
            }
            
            if (Dinner.hamo.isSelected()){
                if (Dinner.longSi.getText().equals("")){
                    arrayItem[1] = 0;
                    food = "Hamonado\t\tP 40.00";       
                    price[1] = 40;
                    total += price[1]*arrayItem[1];
                    array[1] = food;
                } else {
                    arrayItem[1] = Integer.parseInt(Dinner.longSi.getText());
                    food = "Hamonado\t\tP 40.00";       
                    price[1] = 40;
                    total += price[1]*arrayItem[1];
                    array[1] = food;
                }
            } else {
                food = null;
                price[1] = 0;
                total += price[1];
                array[1] = food;
            }
            if (Dinner.kare.isSelected()){
                if(Dinner.ham.getText().equals("")){
                    arrayItem[2] = 0;
                    food = "Kare-kare\t\tP 40.00";       
                    price[2] = 40;
                    total += price[2]*arrayItem[2];
                    array[2] = food;
                } else {
                    arrayItem[2] = Integer.parseInt(Dinner.ham.getText());
                    food = "Kare-kare\t\tP 40.00";       
                    price[2] = 40;
                    total += price[2]*arrayItem[2];
                    array[2] = food;
                }
                
            } else {
                food = null;
                price[2] = 0;
                total += price[2];
                array[2] = food;
            }
            if (Dinner.bistek.isSelected()){
                if (Dinner.jTextField4.getText().equals("")){
                    arrayItem[3] = 0;
                    food = "Bistek\t\tP 40.00";       
                    price[3] = 40;
                    total += price[3];
                    array[3] = food;
                } else {
                    arrayItem[3] = Integer.parseInt(Dinner.jTextField4.getText());
                    food = "Bistek\t\tP 40.00";       
                    price[3] = 40;
                    total += price[3];
                    array[3] = food;
                }
            } else {
                food = null;
                price[3] = 0;
                total += price[3];
                array[3] = food;
            }
            if (Dinner.bicol.isSelected()){
                if (Dinner.jTextField5.getText().equals("")){
                    arrayItem[4] = 0;
                    food = "Bicol Express\t\tP 40.00";       
                    price[4] = 40;
                    total += price[4]*arrayItem[4];
                    array[4] = food;
                } else {
                    arrayItem[4] = Integer.parseInt(Dinner.jTextField5.getText());
                    food = "Bicol Express\t\tP 40.00";       
                    price[4] = 40;
                    total += price[4]*arrayItem[4];
                    array[4] = food;
                }
            } else {
                food = null;
                price[4] = 0;
                total += price[4];
                array[4] = food;
            }
            if (Dinner.sua.isSelected()){
                if (Dinner.jTextField6.getText().equals("")){
                    arrayItem[5] = 0;
                    food = "Suasage\t\tP 40.00";       
                    price[5] = 40;
                    total += price[5]*arrayItem[5];
                    array[5] = food;
                } else {
                    arrayItem[5] = Integer.parseInt(Dinner.jTextField6.getText());
                    food = "Suasage\t\tP 40.00";       
                    price[5] = 40;
                    total += price[5]*arrayItem[5];
                    array[5] = food;
                }
                
            } else {
                food = null;
                price[5] = 0;
                total += price[5];
                array[5] = food;
            }
            if (Dinner.ina.isSelected()){
                if (Dinner.jTextField8.getText().equals("")){
                    arrayItem[6] = 0;
                    food = "Inasal\t\tP 40.00";       
                    price[6] = 40;
                    total += price[6]*arrayItem[6];
                    array[6] = food;   
                } else {
                    arrayItem[6] = Integer.parseInt(Dinner.jTextField8.getText());
                    food = "Inasal\t\tP 40.00";       
                    price[6] = 40;
                    total += price[6]*arrayItem[6];
                    array[6] = food;
                }            
            } else {
                food = null;
                price[6] = 0;
                total += price[6];
                array[6] = food;
            }

            food = null;
            price[7] = 0;
            total += price[7];
            array[7] = food;
            
            food = null;
            price[8] = 0;
            total += price[8];
            array[8] = food;
            
            
            if (Dinner.bbq.isSelected()){
                if (Dinner.jTextField11.getText().equals("")){
                    arrayItem[9] = 0;
                    food = "Barbeque Staek\t\tP 40.00";       
                    price[9] = 40;
                    total += price[9]*arrayItem[9];
                    array[9] = food;
                } else {
                    arrayItem[9] = Integer.parseInt(Dinner.jTextField11.getText());
                    food = "Barbeque Staek\t\tP 40.00";       
                    price[9] = 40;
                    total += price[9]*arrayItem[9];
                    array[9] = food;
                }
            } else {
                food = null;
                price[9] = 0;
                total += price[9];
                array[9] = food;
            }
            if (Dinner.tino.isSelected()){
                if (Dinner.jTextField12.getText().equals("")){
                    arrayItem[10] = 0;
                    food = "Tinola\t\tP 40.00";       
                    price[10] = 40;
                    total += price[10]*arrayItem[10];
                    array[10] = food;
                } else {
                    arrayItem[10] = Integer.parseInt(Dinner.jTextField12.getText());
                    food = "Tinola\t\tP 40.00";       
                    price[10] = 40;
                    total += price[10]*arrayItem[10];
                    array[10] = food;
                }
                
            } else {
                food = null;
                price[10] = 0;
                total += price[10];
                array[10] = food;
            }
            if (Dinner.bula.isSelected()){
                if(Dinner.jTextField13.getText().equals("")){
                    arrayItem[11] = 0;
                    food = "Bulalo\t\tP 40.00";       
                    price[11] = 40;
                    total += price[11]*arrayItem[11];
                    array[11] = food;
                } else {
                    arrayItem[11] = Integer.parseInt(Dinner.jTextField13.getText());
                    food = "Bulalo\t\tP 40.00";       
                    price[11] = 40;
                    total += price[11]*arrayItem[11];
                    array[11] = food;
                }            
            } else {
                food = null;
                price[11] = 0;
                total += price[11];
                array[11] = food;
            }
            if (Dinner.salad.isSelected()){
                if(Dinner.jTextField14.getText().equals("")){
                    arrayItem[12] = 0;
                    food = "Salad\t\tP 30.00";       
                    price[12] = 30;
                    total += price[12]*arrayItem[12];
                    array[12] = food;
                } else {
                    arrayItem[12] = Integer.parseInt(Dinner.jTextField14.getText());
                    food = "Salad\t\tP 30.00";       
                    price[12] = 30;
                    total += price[12]*arrayItem[12];
                    array[12] = food;
                }            
            } else {
                food = null;
                price[12] = 0;
                total += price[12];
                array[12] = food;
            }
            if (Dinner.embu.isSelected()){
                if(Dinner.jTextField9.getText().equals("")){
                    arrayItem[13] = 0;
                    food = "Embutido\t\tP 40.00";       
                    price[13] = 40;
                    total += price[13]*arrayItem[13];
                    array[13] = food;
                } else {
                    arrayItem[13] = Integer.parseInt(Dinner.jTextField9.getText());
                    food = "Embutido\t\tP 40.00";       
                    price[13] = 40;
                    total += price[13]*arrayItem[13];
                    array[13] = food;
                }
                
            } else {
                food = null;
                price[13] = 0;
                total += price[13];
                array[13] = food;
            }
        	
        if (total<=0){
            JOptionPane.showMessageDialog(null,"Please Check Your Order!","EMPTY ORDER!!!",JOptionPane.ERROR_MESSAGE);
        } else if (Option.oh == 3){
            reviewArea.setText(pName);
            reviewArea.setText(reviewArea.getText()+"\n   Food Order/s :\n");
            for (int i = 0, it = 0,pr = 0; i<array.length; i++,it++,pr++){
                if (array[i]==null){

                } else {
                    reviewArea.setText(reviewArea.getText()+"              "+array[i]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
                }

            }
            int totalAll = pTotal+total;
            
            reviewArea.setText(reviewArea.getText()+"\n\t\t\t              Over All Total :   P "+totalAll+".00");
            
            Review.opTotal(totalAll);
            
            handler = 33;
            rev.totalM(total,name);
            openR.R_desk.add(rev);
            rev.setLocation(40,15);
            rev.show();
            this.dispose();
            openR.setVisible(true);
            
        } else {
        reviewArea.setText("***************************************************************************************************\n");
        reviewArea.setText(reviewArea.getText()+"***                             ********** Continue To Proceed **********                          ***\n");
        reviewArea.setText(reviewArea.getText()+"***************************************************************************************************\n");
        reviewArea.setText(reviewArea.getText()+"\t\tD I N N E R\n\n");
        reviewArea.setText(reviewArea.getText()+"Name  :   "+name);
        reviewArea.setText(reviewArea.getText()+"\n\nList of Order/s  :");
        reviewArea.setText(reviewArea.getText()+"\n\n   Food Order/s :\t\tNo. of Item/s                  Total Price\n");
        for (int id = 0, it = 0,pr = 0; id<array.length; id++,it++,pr++){
            if (array[id]==null){
                
            } else {
                reviewArea.setText(reviewArea.getText()+"              "+array[id]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
            }
            
        }
        
        reviewArea.setText(reviewArea.getText()+"\n\t\t\t              Over All Total :   P "+total+".00");
    
        handler = 3;
        rev.totalM(total,name);
        openR.R_desk.add(rev);
        rev.setLocation(40,15);
        rev.show();
        this.dispose();
        openR.setVisible(true);
        }
        
            break;
            
        case 4:
        if (Snacks.siopao.isSelected()){
            if (Snacks.sio.getText().equals("")){          
                arrayItem[0] = 0;
                food = "Siopao\t\tP 30.00";       
                price[0] = 30;
                total += price[0]*arrayItem[0];
                array[0] = food;
            } else {
                arrayItem[0] = Integer.parseInt(Snacks.sio.getText());
                food = "Siopao\t\tP 30.00";       
                price[0] = 30;
                total += price[0]*arrayItem[0];
                array[0] = food;    
            }
        } else {
            food = null;
            price[0] = 0;
            total += price[0];
            array[0] = food;
        }
        
        if (Snacks.longsi.isSelected()){
            if (Snacks.longSi.getText().equals("")){
                arrayItem[1] = 0;
                food = "Siomai\t\tP 15.00";       
                price[1] = 15;
                total += price[1]*arrayItem[1];
                array[1] = food;
            } else {
                arrayItem[1] = Integer.parseInt(Snacks.longSi.getText());
                food = "Siomai\t\tP 15.00";       
                price[1] = 15;
                total += price[1]*arrayItem[1];
                array[1] = food;
            }
        } else {
            food = null;
            price[1] = 0;
            total += price[1];
            array[1] = food;
        }
        if (Snacks.hamsi.isSelected()){
            if(Snacks.ham.getText().equals("")){
                arrayItem[2] = 0;
                food = "Turon\t\tP 10.00";       
                price[2] = 10;
                total += price[2]*arrayItem[2];
                array[2] = food;
            } else {
                arrayItem[2] = Integer.parseInt(Snacks.ham.getText());
                food = "Turon\t\tP 10.00";       
                price[2] = 10;
                total += price[2]*arrayItem[2];
                array[2] = food;
            }
            
        } else {
            food = null;
            price[2] = 0;
            total += price[2];
            array[2] = food;
        }
        if (Snacks.porksi.isSelected()){
            if (Snacks.jTextField4.getText().equals("")){
                arrayItem[3] = 0;
                food = "Burger\t\tP 25.00";       
                price[3] = 25;
                total += price[3];
                array[3] = food;
            } else {
                arrayItem[3] = Integer.parseInt(Snacks.jTextField4.getText());
                food = "Burger\t\tP 25.00";       
                price[3] = 25;
                total += price[3];
                array[3] = food;
            }
        } else {
            food = null;
            price[3] = 0;
            total += price[3];
            array[3] = food;
        }
        if (Snacks.hotsi.isSelected()){
            if (Snacks.jTextField5.getText().equals("")){
                arrayItem[4] = 0;
                food = "Footlong\t\tP 30.00";       
                price[4] = 30;
                total += price[4]*arrayItem[4];
                array[4] = food;
            } else {
                arrayItem[4] = Integer.parseInt(Snacks.jTextField5.getText());
                food = "Footlong\t\tP 30.00";       
                price[4] = 30;
                total += price[4]*arrayItem[4];
                array[4] = food;
            }
        } else {
            food = null;
            price[4] = 0;
            total += price[4];
            array[4] = food;
        }
        if (Snacks.tapsi1.isSelected()){
            if (Snacks.jTextField6.getText().equals("")){
                arrayItem[5] = 0;
                food = "Pizza\t\tP 10.00";       
                price[5] = 10;
                total += price[5]*arrayItem[5];
                array[5] = food;
            } else {
                arrayItem[5] = Integer.parseInt(Snacks.jTextField6.getText());
                food = "Pizza\t\tP 10.00";       
                price[5] = 10;
                total += price[5]*arrayItem[5];
                array[5] = food;
            }
            
        } else {
            food = null;
            price[5] = 0;
            total += price[5];
            array[5] = food;
        }
        if (Snacks.tapsi2.isSelected()){
            if (Snacks.jTextField8.getText().equals("")){
                arrayItem[6] = 0;
                food = "Puto\t\t\tP 10.00";       
                price[6] = 10;
                total += price[6]*arrayItem[6];
                array[6] = food;   
            } else {
                arrayItem[6] = Integer.parseInt(Snacks.jTextField8.getText());
                food = "Puto\t\t\tP 10.00";       
                price[6] = 10;
                total += price[6]*arrayItem[6];
                array[6] = food;
            }            
        } else {
            food = null;
            price[6] = 0;
            total += price[6];
            array[6] = food;
        }
        if (Snacks.panCanton.isSelected()){
            if (Snacks.jTextField9.getText().equals("")){
                arrayItem[7] = 0;
                food = "Ginataan\t\tP 30.00";       
                price[7] = 30;
                total += price[7]*arrayItem[7];
                array[7] = food;
            } else {
                arrayItem[7] = Integer.parseInt(Snacks.jTextField9.getText());
                food = "Ginataan\t\tP 30.00";       
                price[7] = 30;
                total += price[7]*arrayItem[7];
                array[7] = food;
            }
        } else {
            food = null;
            price[7] = 0;
            total += price[7];
            array[7] = food;
        }
        if (Snacks.panPalabok.isSelected()){
            if (Snacks.jTextField10.getText().equals("")){
                arrayItem[8] = 0;
                food = "Champorado\t\tP 30.00";       
                price[8] = 30;
                total += price[8]*arrayItem[8];
                array[8] = food;
            } else {
                arrayItem[8] = Integer.parseInt(Snacks.jTextField10.getText());
                food = "Champorado\t\tP 30.00";       
                price[8] = 30;
                total += price[8]*arrayItem[8];
                array[8] = food;
            }
        } else {
            food = null;
            price[8] = 0;
            total += price[8];
            array[8] = food;
        }
        if (Snacks.whiteSpa.isSelected()){
            if (Snacks.jTextField11.getText().equals("")){
                arrayItem[9] = 0;
                food = "Lugaw\t\tP 30.00";       
                price[9] = 30;
                total += price[9]*arrayItem[9];
                array[9] = food;
            } else {
                arrayItem[9] = Integer.parseInt(Snacks.jTextField11.getText());
                food = "Lugaw\t\tP 30.00";       
                price[9] = 30;
                total += price[9]*arrayItem[9];
                array[9] = food;
            }
        } else {
            food = null;
            price[9] = 0;
            total += price[9];
            array[9] = food;
        }
        if (Snacks.whiteSpa1.isSelected()){
            if (Snacks.jTextField12.getText().equals("")){
                arrayItem[10] = 0;
                food = "Halo-halo\t\tP 20.00";       
                price[10] = 20;
                total += price[10]*arrayItem[10];
                array[10] = food;
            } else {
                arrayItem[10] = Integer.parseInt(Snacks.jTextField12.getText());
                food = "Halo-halo\t\tP 20.00";       
                price[10] = 20;
                total += price[10]*arrayItem[10];
                array[10] = food;
            }
            
        } else {
            food = null;
            price[10] = 0;
            total += price[10];
            array[10] = food;
        }
        if (Snacks.whiteSpa2.isSelected()){
            if(Snacks.jTextField13.getText().equals("")){
                arrayItem[11] = 0;
                food = "Choco Shake\t\tP 12.00";       
                price[11] = 12;
                total += price[11]*arrayItem[11];
                array[11] = food;
            } else {
                arrayItem[11] = Integer.parseInt(Snacks.jTextField13.getText());
                food = "Choco Shake\t\tP 12.00";       
                price[11] = 12;
                total += price[11]*arrayItem[11];
                array[11] = food;
            }            
        } else {
            food = null;
            price[11] = 0;
            total += price[11];
            array[11] = food;
        }
        if (Snacks.spaghetti.isSelected()){
            if(Snacks.jTextField14.getText().equals("")){
                arrayItem[12] = 0;
                food = "Ice Cream\t\tP 12.00";       
                price[12] = 12;
                total += price[12]*arrayItem[12];
                array[12] = food;
            } else {
                arrayItem[12] = Integer.parseInt(Snacks.jTextField14.getText());
                food = "Ice Cream\t\tP 12.00";       
                price[12] = 12;
                total += price[12]*arrayItem[12];
                array[12] = food;
            }            
        } else {
            food = null;
            price[12] = 0;
            total += price[12];
            array[12] = food;
        }
        if (Snacks.spaghetti1.isSelected()){
            if(Snacks.jTextField15.getText().equals("")){
                arrayItem[13] = 0;
                food = "Ice Candy\t\tP  5.00";       
                price[13] = 5;
                total += price[13]*arrayItem[13];
                array[13] = food;
            } else {
                arrayItem[13] = Integer.parseInt(Snacks.jTextField15.getText());
                food = "Ice Candy\t\tP  5.00";       
                price[13] = 5;
                total += price[13]*arrayItem[13];
                array[13] = food;
            }
            
        } else {
            food = null;
            price[13] = 0;
            total += price[13];
            array[13] = food;
        }
         
        if (total<=0){
            JOptionPane.showMessageDialog(null,"Please Check Your Order!","EMPTY ORDER!!!",JOptionPane.ERROR_MESSAGE);
        } else if (Option.oh == 4){
            reviewArea.setText(pName);
            reviewArea.setText(reviewArea.getText()+"\n   Food Order/s :\n");
            for (int i = 0, it = 0,pr = 0; i<array.length; i++,it++,pr++){
                if (array[i]==null){

                } else {
                    reviewArea.setText(reviewArea.getText()+"              "+array[i]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
                }

            }
            int totalAll = pTotal+total;
            
            reviewArea.setText(reviewArea.getText()+"\n\t\t\t              Over All Total :   P "+totalAll+".00");
            
            Review.opTotal(totalAll);
            
            handler = 44;
            rev.totalM(total,name);
            openR.R_desk.add(rev);
            rev.setLocation(40,15);
            rev.show();
            this.dispose();
            openR.setVisible(true);
            
        } else {
        reviewArea.setText("***************************************************************************************************\n");
        reviewArea.setText(reviewArea.getText()+"***                             ********** Continue To Proceed **********                          ***\n");
        reviewArea.setText(reviewArea.getText()+"***************************************************************************************************\n");
        reviewArea.setText(reviewArea.getText()+"\t\tS N A C K S\n\n");
        reviewArea.setText(reviewArea.getText()+"Name  :   "+name);
        reviewArea.setText(reviewArea.getText()+"\n\nList of Order/s  :");
        reviewArea.setText(reviewArea.getText()+"\n\n   Food Order/s :\t\tNo. of Item/s                  Total Price\n");
        for (int i = 0, it = 0,pr = 0; i<array.length; i++,it++,pr++){
            if (array[i]==null){
                
            } else {
                reviewArea.setText(reviewArea.getText()+"              "+array[i]+"   x   "+arrayItem[it]+"                   P "+price[pr]*arrayItem[it]+".00\n");
            }
            
        }
        
        reviewArea.setText(reviewArea.getText()+"\n\t\t\t              Over All Total :   P "+total+".00");
    
        handler = 4;
        rev.totalM(total,name);
        openR.R_desk.add(rev);
        rev.setLocation(40,15);
        rev.show();
        this.dispose();
        openR.setVisible(true);
        }
    
            
            break;
        case 20:
        case 30:
        case 40:
        case 50:
            if (Drinks.jCheckBox1.isSelected()){
                    if (Drinks.jTextField1.getText().equals("")){
                        drItem[0] = 0;
                        Dname = "Black Coffee\t\tP 10.00";
                        drPrice[0] = 10;
                        drTotal += drPrice[0]*drItem[0];
                        drName[0] = Dname ;                        
                    } else {
                        drItem[0] = Integer.parseInt(Drinks.jTextField1.getText());
                        Dname = "Black Coffee\t\tP 10.00";
                        drPrice[0] = 10;
                        drTotal += drPrice[0]*drItem[0];
                        drName[0] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[0] = 0;
                    drTotal += drPrice[0];
                    drName[0] = Dname;
                }
                if (Drinks.jCheckBox2.isSelected()){
                    if (Drinks.jTextField2.getText().equals("")){
                        drItem[1] = 0;
                        Dname = "Brown Coffee\t\tP 10.00";
                        drPrice[1] = 10;
                        drTotal += drPrice[0]*drItem[0];
                        drName[1] = Dname ;                        
                    } else {
                        drItem[1] = Integer.parseInt(Drinks.jTextField2.getText());
                        Dname = "Brown Coffee\t\tP 10.00";
                        drPrice[1] = 10;
                        drTotal += drPrice[1]*drItem[1];
                        drName[1] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[1] = 0;
                    drTotal += drPrice[1];
                    drName[1] = Dname;
                }
                if (Drinks.jCheckBox3.isSelected()){
                    if (Drinks.jTextField3.getText().equals("")){
                        drItem[2] = 0;
                        Dname = "Hot Tea\t\tP 10.00";
                        drPrice[2] = 10;
                        drTotal += drPrice[2]*drItem[2];
                        drName[2] = Dname ;                        
                    } else {
                        drItem[2] = Integer.parseInt(Drinks.jTextField3.getText());
                        Dname = "Hot Tea\t\tP 10.00";
                        drPrice[2] = 10;
                        drTotal += drPrice[2]*drItem[2];
                        drName[2] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[2] = 0;
                    drTotal += drPrice[2];
                    drName[2] = Dname;
                }
                if (Drinks.jCheckBox4.isSelected()){
                    if (Drinks.jTextField4.getText().equals("")){
                        drItem[3] = 0;
                        Dname = "Hot Milk\t\tP 15.00";
                        drPrice[3] = 15;
                        drTotal += drPrice[3]*drItem[3];
                        drName[3] = Dname ;                        
                    } else {
                        drItem[3] = Integer.parseInt(Drinks.jTextField4.getText());
                        Dname = "Hot Milk\t\tP 15.00";
                        drPrice[3] = 15;
                        drTotal += drPrice[3]*drItem[3];
                        drName[3] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[3] = 0;
                    drTotal += drPrice[3];
                    drName[3] = Dname;
                }
                if (Drinks.jCheckBox5.isSelected()){
                    if (Drinks.jTextField5.getText().equals("")){
                        drItem[4] = 0;
                        Dname = "Hot Choco\t\tP 15.00";
                        drPrice[4] = 15;
                        drTotal += drPrice[4]*drItem[4];
                        drName[4] = Dname ;                        
                    } else {
                        drItem[4] = Integer.parseInt(Drinks.jTextField5.getText());
                        Dname = "Hot Choco\t\tP 15.00";
                        drPrice[4] = 15;
                        drTotal += drPrice[4]*drItem[4];
                        drName[4] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[4] = 0;
                    drTotal += drPrice[4];
                    drName[4] = Dname;
                }
                if (Drinks.jCheckBox6.isSelected()){
                    if (Drinks.jTextField14.getText().equals("")){
                        drItem[5] = 0;
                        Dname = "Cold Water\t\tP 10.00";
                        drPrice[5] = 10;
                        drTotal += drPrice[5]*drItem[5];
                        drName[5] = Dname ;                        
                    } else {
                        drItem[5] = Integer.parseInt(Drinks.jTextField14.getText());
                        Dname = "Cold Water\t\tP 10.00";
                        drPrice[5] = 10;
                        drTotal += drPrice[5]*drItem[5];
                        drName[5] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[5] = 0;
                    drTotal += drPrice[5];
                    drName[5] = Dname;
                }
                if (Drinks.jCheckBox7.isSelected()){
                    if (Drinks.jTextField15.getText().equals("")){
                        drItem[6] = 0;
                        Dname = "Hot Water\t\tP   5.00";
                        drPrice[6] = 5;
                        drTotal += drPrice[6]*drItem[6];
                        drName[6] = Dname ;                        
                    } else {
                        drItem[6] = Integer.parseInt(Drinks.jTextField15.getText());
                        Dname = "Hot Water\t\tP   5.00";
                        drPrice[6] = 5;
                        drTotal += drPrice[6]*drItem[6];
                        drName[6] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[6] = 0;
                    drTotal += drPrice[6];
                    drName[6] = Dname;
                }
                if (Drinks.buko.isSelected()){
                    if (Drinks.jTextField6.getText().equals("")){
                        drItem[7] = 0;
                        Dname = "Buko juice\t\tP 12.00";
                        drPrice[7] = 12;
                        drTotal += drPrice[7]*drItem[7];
                        drName[7] = Dname ;                        
                    } else {
                        drItem[7] = Integer.parseInt(Drinks.jTextField6.getText());
                        Dname = "Buko juice\t\tP 12.00";
                        drPrice[7] = 12;
                        drTotal += drPrice[7]*drItem[7];
                        drName[7] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[7] = 0;
                    drTotal += drPrice[7];
                    drName[7] = Dname;
                }
                if (Drinks.pineapple.isSelected()){
                    if (Drinks.jTextField7.getText().equals("")){
                        drItem[8] = 0;
                        Dname = "Pineapple juice\t\tP 12.00";
                        drPrice[8] = 12;
                        drTotal += drPrice[8]*drItem[8];
                        drName[8] = Dname ;                        
                    } else {
                        drItem[8] = Integer.parseInt(Drinks.jTextField7.getText());
                        Dname = "Pineapple juice\t\tP 12.00";
                        drPrice[8] = 12;
                        drTotal += drPrice[8]*drItem[8];
                        drName[8] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[8] = 0;
                    drTotal += drPrice[8];
                    drName[8] = Dname;
                }
                if (Drinks.orange.isSelected()){
                    if (Drinks.jTextField8.getText().equals("")){
                        drItem[9] = 0;
                        Dname = "Orange juice\t\tP 12.00";
                        drPrice[9] = 12;
                        drTotal += drPrice[9]*drItem[9];
                        drName[9] = Dname ;                        
                    } else {
                        drItem[9] = Integer.parseInt(Drinks.jTextField8.getText());
                        Dname = "Orange juice\t\tP 12.00";
                        drPrice[9] = 12;
                        drTotal += drPrice[9]*drItem[9];
                        drName[9] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[9] = 0;
                    drTotal += drPrice[9];
                    drName[9] = Dname;
                }
                if (Drinks.melon.isSelected()){
                    if (Drinks.jTextField9.getText().equals("")){
                        drItem[10] = 0;
                        Dname = "Melon juice\t\tP 12.00";
                        drPrice[10] = 12;
                        drTotal += drPrice[10]*drItem[10];
                        drName[10] = Dname ;                        
                    } else {
                        drItem[10] = Integer.parseInt(Drinks.jTextField9.getText());
                        Dname = "Melon juice\t\tP 12.00";
                        drPrice[10] = 12;
                        drTotal += drPrice[10]*drItem[10];
                        drName[10] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[10] = 0;
                    drTotal += drPrice[10];
                    drName[10] = Dname;
                }
                if (Drinks.apple.isSelected()){
                    if (Drinks.jTextField10.getText().equals("")){
                        drItem[11] = 0;
                        Dname = "Apple juice\t\tP 12.00";
                        drPrice[11] = 12;
                        drTotal += drPrice[11]*drItem[11];
                        drName[11] = Dname ;                        
                    } else {
                        drItem[11] = Integer.parseInt(Drinks.jTextField10.getText());
                        Dname = "Apple juice\t\tP 12.00";
                        drPrice[11] = 12;
                        drTotal += drPrice[11]*drItem[11];
                        drName[11] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[11] = 0;
                    drTotal += drPrice[11];
                    drName[11] = Dname;
                }
                if (Drinks.cola.isSelected()){
                    if (Drinks.jTextField11.getText().equals("")){
                        drItem[12] = 0;
                        Dname = "Cola\t\t\tP 15.00";
                        drPrice[12] = 15;
                        drTotal += drPrice[12]*drItem[12];
                        drName[12] = Dname ;                        
                    } else {
                        drItem[12] = Integer.parseInt(Drinks.jTextField11.getText());
                        Dname = "Cola\t\t\tP 15.00";
                        drPrice[12] = 15;
                        drTotal += drPrice[12]*drItem[12];
                        drName[12] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[12] = 0;
                    drTotal += drPrice[12];
                    drName[12] = Dname;
                }
                if (Drinks.c2.isSelected()){
                    if (Drinks.jTextField12.getText().equals("")){
                        drItem[13] = 0;
                        Dname = "C2\t\t\tP 15.00";
                        drPrice[13] = 15;
                        drTotal += drPrice[13]*drItem[13];
                        drName[13] = Dname ;                        
                    } else {
                        drItem[13] = Integer.parseInt(Drinks.jTextField12.getText());
                        Dname = "C2\t\t\tP 15.00";
                        drPrice[13] = 15;
                        drTotal += drPrice[13]*drItem[13];
                        drName[13] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[13] = 0;
                    drTotal += drPrice[13];
                    drName[13] = Dname;
                }
                if (Drinks.minit.isSelected()){
                    if (Drinks.jTextField13.getText().equals("")){
                        drItem[14] = 0;
                        Dname = "Minit\t\t\tP 15.00";
                        drPrice[14] = 15;
                        drTotal += drPrice[14]*drItem[14];
                        drName[14] = Dname ;                        
                    } else {
                        drItem[14] = Integer.parseInt(Drinks.jTextField13.getText());
                        Dname = "Minit\t\t\tP 15.00";
                        drPrice[14] = 15;
                        drTotal += drPrice[14]*drItem[14];
                        drName[14] = Dname ;
                    }                   
                } else {
                    Dname = null;
                    drPrice[14] = 0;
                    drTotal += drPrice[14];
                    drName[14] = Dname;
                }
                
                    reviewArea.setText(foodO);
                    reviewArea.setText(reviewArea.getText()+"\n   Drinks Order/s :\n");
                   
                    for( int arr = 0, dit = 0, dp = 0; arr<drName.length; arr++, dit++, dp++){
                        if (drName[arr] == null){

                        } else {
                            reviewArea.setText(reviewArea.getText()+"              "+drName[arr]+"   x   "+drItem[dit]+"                   P "+drPrice[dp]*drItem[dit]+".00\n");
                        }
                    }
                    
                    int totalAll = foodT + drTotal;
                    
                    reviewArea.setText(reviewArea.getText()+"\n\t\t\t              Over All Total :   P "+totalAll+".00");
                
                if(bck == 1){
                    handler = 20;
                } else if (bck ==2){
                    handler = 30;
                } else if (bck == 3) {
                	handler = 40;
                } else if (bck == 4) {
                	handler = 50;
                }
                
                rev.totalM(totalAll,name);
                openR.R_desk.add(rev);
                rev.setLocation(40,15);
                rev.show();
                this.dispose();
                openR.setVisible(true);
                
            break;
            default:
                break;
        }
    }//GEN-LAST:event_orderActionPerformed


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
            java.util.logging.Logger.getLogger(AllDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllDesk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel InputName;
    private javax.swing.JButton cancel;
    public static javax.swing.JDesktopPane desk;
    public static javax.swing.JButton drinks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton menu;
    public static javax.swing.JButton order;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}

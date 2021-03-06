/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho6229
 */

import java.text.DecimalFormat;

public class purchaseForm extends javax.swing.JFrame {
    //crat a decimal format
    DecimalFormat df = new DecimalFormat("$###.##");
    
    //declare constants
    final double HST = 0.13;
    final double BEETSA_PRICE = 14.97;
    final double BANZEROTTI_PRICE = 7.49;
    final double DIPPING_PRICE = 3.37;
    final double BORSCHT_PRICE = 8.98;
    
    /**
     * Creates new form purchaseForm
     */
    public purchaseForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        beetsaSpinner = new javax.swing.JSpinner();
        beetsaLabel = new javax.swing.JLabel();
        banzerottiSpinner = new javax.swing.JSpinner();
        banzerottiLabel = new javax.swing.JLabel();
        dippingSpinner = new javax.swing.JSpinner();
        dippingLabel = new javax.swing.JLabel();
        borschtSpinner = new javax.swing.JSpinner();
        borschtLabel = new javax.swing.JLabel();
        subtotalLabel = new javax.swing.JLabel();
        taxLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exitButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(122, 31, 61));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 35)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 67, 8));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Beetsa Beetsa");
        mainPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 540, 40));

        imageLabel.setIcon(new javax.swing.ImageIcon("Y:\\Documents\\BeetsaGood2.png")); // NOI18N
        mainPanel.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("Y:\\Documents\\BeetsaGood2.png")); // NOI18N
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        calculateButton.setText("Calculate Cost");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });
        mainPanel.add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        totalLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(255, 67, 8));
        totalLabel.setText("Total:");
        mainPanel.add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, 20));

        beetsaSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        beetsaSpinner.setRequestFocusEnabled(false);
        mainPanel.add(beetsaSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 50, -1));

        beetsaLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        beetsaLabel.setForeground(new java.awt.Color(255, 67, 8));
        beetsaLabel.setText("Beetsa: $14.97");
        mainPanel.add(beetsaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        banzerottiSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        mainPanel.add(banzerottiSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 50, -1));

        banzerottiLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        banzerottiLabel.setForeground(new java.awt.Color(255, 67, 8));
        banzerottiLabel.setText("Banzerotti: $7.49");
        mainPanel.add(banzerottiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        dippingSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        mainPanel.add(dippingSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 50, -1));

        dippingLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        dippingLabel.setForeground(new java.awt.Color(255, 67, 8));
        dippingLabel.setText("Beet Dipping Sauce: $3.37");
        mainPanel.add(dippingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        borschtSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        mainPanel.add(borschtSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 50, -1));

        borschtLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        borschtLabel.setForeground(new java.awt.Color(255, 67, 8));
        borschtLabel.setText("Borscht: $8.98");
        mainPanel.add(borschtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 20));

        subtotalLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        subtotalLabel.setForeground(new java.awt.Color(255, 67, 8));
        subtotalLabel.setText("Subtotal:");
        mainPanel.add(subtotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, 20));

        taxLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        taxLabel.setForeground(new java.awt.Color(255, 67, 8));
        taxLabel.setText("Tax:");
        mainPanel.add(taxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, 20));

        jMenu1.setText("File");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jMenu1.add(exitButton);

        menuBar.add(jMenu1);

        jMenu2.setText("Edit");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        //get the values
        int numBeetsa = (int)(beetsaSpinner.getValue());
        int numBanzerotti = (int)(banzerottiSpinner.getValue());
        int numDipping = (int)(dippingSpinner.getValue());
        int numBorscht = (int)(borschtSpinner.getValue());
        
        //calculate prices
        double subtotal = (numBeetsa * BEETSA_PRICE) + (numBanzerotti * BANZEROTTI_PRICE) + (numDipping * DIPPING_PRICE) + (numBorscht * BORSCHT_PRICE);
        double tax = subtotal * HST;
        double total = subtotal + tax;
        
        //output
        subtotalLabel.setText("Subtotal:   " + df.format(subtotal));
        totalLabel.setText("Total:       " + df.format(total));
        taxLabel.setText("Tax:         " + df.format(tax));
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //exit program
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(purchaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchaseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banzerottiLabel;
    private javax.swing.JSpinner banzerottiSpinner;
    private javax.swing.JLabel beetsaLabel;
    private javax.swing.JSpinner beetsaSpinner;
    private javax.swing.JLabel borschtLabel;
    private javax.swing.JSpinner borschtSpinner;
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel dippingLabel;
    private javax.swing.JSpinner dippingSpinner;
    private javax.swing.JMenuItem exitButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JLabel taxLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}

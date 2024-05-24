package mainPackage;


import java.awt.Color;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author soria
 */
public class insertArray extends javax.swing.JFrame {

    /**
     * Creates new form insertArray
     */
    public insertArray() {
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

        jButton1 = new javax.swing.JButton();
        insBut = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(359, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(6, 6, 64, 23);

        insBut.setBackground(new java.awt.Color(0, 204, 51));
        insBut.setText("Insert");
        insBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insButActionPerformed(evt);
            }
        });
        getContentPane().add(insBut);
        insBut.setBounds(140, 320, 72, 23);

        jTextField1.setColumns(5);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 200, 69, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Value to insert");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 180, 100, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Insert position");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 240, 100, 20);

        jTextField2.setColumns(5);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 260, 69, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("ARRAY CRUDS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 110, 190, 32);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mainFrame backToMn = new mainFrame();
        backToMn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insButActionPerformed
        // TODO add your handling code here:
        if (createArray.numesLen == 0) {
            JOptionPane.showMessageDialog(this, "Array is not initialized.");
        } else {
            try {
                createArray.numesLen = createArray.numbers.length + 1;
                newNums = new int[createArray.numesLen];
                for (int i=0;i<createArray.numbers.length;i++){    
                    newNums[i] = createArray.numbers[i];
                }
                
//                System.out.println(newNums.length);

                insVal = Integer.parseInt(jTextField1.getText());
                int position = Integer.parseInt(jTextField2.getText());

                if (position < 1 || position > createArray.numesLen) {
                    JOptionPane.showMessageDialog(this, "Invalid position!");
                    return;
                }

                for (int i = newNums.length - 1; i > position - 1; i--) {
                    newNums[i] = newNums[i - 1]; // shift the elements
                }
                newNums[position - 1] = insVal; // insert the value in accord to position[index]
                // Arrays.sort(newNums);
                
                createArray.numbers = newNums;
                createArray.numesLen = createArray.numbers.length;
                
                JOptionPane.showMessageDialog(this, "Number inserted!");
//                for (int i=0;i<numesLen;i++){
//                    System.out.println(numbers[i]);
//                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Enter a number!");
            }
        }
        System.out.println(createArray.numesLen);
    }//GEN-LAST:event_insButActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(insertArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertArray().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insBut;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    public static int insVal;
    public static int[] newNums;
}

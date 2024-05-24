package arrayList;


import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author soria
 */
public class insertionSort extends javax.swing.JFrame {

    /**
     * Creates new form insertionSort
     */
    public insertionSort() {
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

        jLabel3 = new javax.swing.JLabel();
        sortBut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(359, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("ARRAY LIST");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 80, 140, 32);

        sortBut.setBackground(new java.awt.Color(0, 204, 51));
        sortBut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sortBut.setText("Sort");
        sortBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButActionPerformed(evt);
            }
        });
        getContentPane().add(sortBut);
        sortBut.setBounds(140, 160, 75, 27);

        displayArea2.setEditable(false);
        displayArea2.setColumns(20);
        displayArea2.setLineWrap(true);
        displayArea2.setRows(10);
        displayArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(displayArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 210, 234, 180);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(6, 6, 64, 23);

        Color bgColor = new Color(0,255,204);
        getContentPane().setBackground(bgColor);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sortButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButActionPerformed
        // TODO add your handling code here:
        sortMethod();
    }//GEN-LAST:event_sortButActionPerformed

    public ArrayList<Integer> sortMethod() {
        int rounds = 1;
        if (crtArrayLst.numesLen == 0) {
            JOptionPane.showMessageDialog(this, "Array is not initialized.");
        } else {
            boolean inOrder = false; // variable for exiting the loop

            while (!inOrder) { // while false
                StringBuilder oa = new StringBuilder();
                oa.append("Original Array: ");
                for (int i = 0; i < crtArrayLst.numesLen; i++) {
                    oa.append(crtArrayLst.numbersList.get(i)).append(" ");
                }
                oa.append("\n\n");
                displayArea2.append(oa.toString());

                int out;
                int less = 1;
                
                for (out = 1; out < crtArrayLst.numbersList.size(); out++) { // out is dividing line
                    int temp = crtArrayLst.numbersList.get(out); // remove marked item
                    int in = out; // start shifts at out

                    while (in > 0 && crtArrayLst.numbersList.get(in - 1) >= temp) { // until one is smaller
                        int val = crtArrayLst.numbersList.get(in - 1);
//                        int pos = in - 1;
                        crtArrayLst.numbersList.set(in, val);
                        --in;
                    }

                    crtArrayLst.numbersList.set(in, temp);
                    less++;

                    if (less >= 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Round " + rounds + " : ");
                        for (int i = 0; i < crtArrayLst.numesLen; i++) {
                            int nums = crtArrayLst.numbersList.get(i);
                            sb.append(nums).append(" ");
                        }
                        sb.append("\n");
                        displayArea2.append(sb.toString());
                        rounds++;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Round " + rounds + " : ");
                for (int i = 0; i < crtArrayLst.numesLen; i++) {
                    int nums = crtArrayLst.numbersList.get(i);
                    sb.append(nums).append(" ");
                }
                sb.append("\n");
                displayArea2.append(sb.toString());
                inOrder = true; // set to true after each iteration
            }

        }
        return crtArrayLst.numbersList;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        sortOption backToSrt = new sortOption();
        backToSrt.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(insertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertionSort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea displayArea2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sortBut;
    // End of variables declaration//GEN-END:variables
}
